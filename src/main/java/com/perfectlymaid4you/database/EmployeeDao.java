package com.perfectlymaid4you.database;

import com.perfectlymaid4you.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EmployeeDao {
    private NamedParameterJdbcTemplate jdbcTemplate;
    private static final String GET_EMPLOYEE = "SELECT * FROM employees WHERE ID= :employeeID;";
    private static final String GET_EMPLOYEES = "SELECT * FROM employees;";
    private static final String ADD_EMPLOYEE = "INSERT INTO employees (Fname, Lname, address, phone, hourlyRate, email, dob, ssn, position, dateOfHire, shirtSize, emergencyContact) " +
            "VALUES(:fname, :lname, :address, :phone, :hourlyRate, :email, :dob, :ssn, :position, :dateOfHire, :shirtSize, :emergencyContact);";

    @Autowired
    public EmployeeDao(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public Employee getEmployee(int employeeID) {
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("employeeID", employeeID);
        return this.jdbcTemplate.queryForObject(GET_EMPLOYEE, parameterSource, EmployeeDao::mapEmployee);

    }

    public List<Employee> getEmployeeList() {
        return this.jdbcTemplate.query(GET_EMPLOYEES, new HashMap<>(), EmployeeDao::mapEmployee);
    }

    public void addEmployee(String fname, String lname, String address, String phone, double hourlyRate, String email, Date dob, String ssn, String position, Date dateOfHire, String shirtSize, String emergencyContact) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("fname", fname);
        map.put("lname", lname);
        map.put("address", address);
        map.put("phone", phone);
        map.put("hourlyRate", hourlyRate);
        map.put("email", email);
        map.put("dob", dob);
        map.put("ssn", ssn);
        map.put("position", position);
        map.put("dateOfHire", dateOfHire);
        map.put("shirtSize", shirtSize);
        map.put("emergencyContact", emergencyContact);
        System.out.println("Map values: "+map);
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValues(map);

        this.jdbcTemplate.update(ADD_EMPLOYEE, map);
    }

    private static Employee mapEmployee(ResultSet results, int rowNumber) throws SQLException {
        Employee employee = new Employee();
        employee.setId(results.getInt("id"));
        employee.setFirstName(results.getString("Fname"));
        employee.setLastName(results.getString("Lname"));
        employee.setAddress(results.getString("address"));
        employee.setPhone(results.getString("phone"));
        employee.setHourlyRate(results.getDouble("hourlyRate"));
        employee.setEmail(results.getString("email"));
        employee.setDob(results.getDate("dob"));
        employee.setSsn(results.getString("ssn"));
        employee.setPosition(results.getString("position"));
        employee.setDateOfHire(results.getDate("dateOfHire"));
        employee.setDateOfTerm(results.getDate("dateOfTerm"));
        employee.setShirtSize(results.getString("shirtSize"));
        employee.setEmergencyContact(results.getString("emergencyContact"));

        return employee;
    }


}
