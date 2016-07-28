package com.perfectlymaid4you.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import com.perfectlymaid4you.model.Client;
import org.springframework.stereotype.Repository;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Repository
public class ClientDao {

    private NamedParameterJdbcTemplate jdbcTemplate;
    private static final String GET_CLIENT = "SELECT * FROM clients WHERE id= :clientID;";
    private static final String GET_CLIENTS = "SELECT * FROM clients;";
    private static final String UPDATE_CLIENT = "UPDATE clients " +
            "SET name=:name, address=:address, primaryPhone=:primaryPhone, additionalPhone=:additionalPhone, email=:email, cleaningtype=:cleaningtype, " +
            "initialCharge=:initialCharge, price=:price, active=:active, notes=:notes " +
            "WHERE id=:id;";
    private static final String GET_CLIENT_BY_NAME = "SELECT * FROM clients WHERE name= :name;";
    private static final String ADD_CLIENT = "INSERT INTO clients (name, address, primaryPhone, additionalPhone, email, cleaningtype, initialCharge, price, active, notes) " +
            "VALUES(:name, :address, :primaryPhone,:additionalPhone, :email, :cleaningtype, :initialCharge, :price, :active, :notes);";
    private static final String DELETE_CLIENT = "DELETE FROM clients WHERE id=:id;";

    @Autowired
    public ClientDao(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    public Client getClient(int clientID) {
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("clientID", clientID);
        return this.jdbcTemplate.queryForObject(GET_CLIENT, parameterSource, ClientDao::mapClient);

    }

    public List<Client> getClientList(){
        return this.jdbcTemplate.query(GET_CLIENTS, new HashMap<>(), ClientDao::mapClient);
    }

    public void addClient(String name, String address, String primaryPhone, String additionalPhone, String email, String cleaningtype, double initialCharge, double price, Boolean active, String notes) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("name", name);
        map.put("address", address);
        map.put("primaryPhone", primaryPhone);
        map.put("additionalPhone", additionalPhone);
        map.put("email", email);
        map.put("cleaningtype", cleaningtype);
        map.put("initialCharge", initialCharge);
        map.put("price", price);
        map.put("active", active);
        map.put("notes", notes);
        System.out.println("Map values: "+map);
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValues(map);

        this.jdbcTemplate.update(ADD_CLIENT, map);
    }
    public List<Client> getClientByName(String name){
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("name", name);
        List<Client> client = this.jdbcTemplate.query(GET_CLIENT_BY_NAME, parameterSource,ClientDao::mapClient);
        return client;
    }
    private static Client mapClient(ResultSet results, int rowNumber) throws SQLException {
        Client client = new Client();
        client.setId(results.getInt("id"));
        client.setName(results.getString("name"));
        client.setAddress(results.getString("address"));
        client.setPrimaryPhone(results.getString("primaryPhone"));
        client.setAdditionalPhone(results.getString("additionalPhone"));
        client.setEmail(results.getString("email"));
        client.setCleaningtype(results.getString("cleaningtype"));
        client.setInitialCharge(results.getDouble("initialCharge"));
        client.setPrice(results.getDouble("price"));
        client.setActive(results.getBoolean("active"));
        client.setNotes(results.getString("notes"));

        return client;
    }
    public void updateClient(int id, String name, String address, String primaryPhone, String additionalPhone, String email, String cleaningtype, double initialCharge, double price, Boolean active, String notes) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("id",id);
        map.put("name", name);
        map.put("address", address);
        map.put("primaryPhone", primaryPhone);
        map.put("additionalPhone", additionalPhone);
        map.put("email", email);
        map.put("cleaningtype", cleaningtype);
        map.put("initialCharge", initialCharge);
        map.put("price", price);
        map.put("active", active);
        map.put("notes", notes);
        System.out.println("Map values: "+map);
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValues(map);

        this.jdbcTemplate.update(UPDATE_CLIENT, map);
    }
    public void deleteClient(int id){
        SqlParameterSource parameterSource = new MapSqlParameterSource()
                .addValue("id", id);

        this.jdbcTemplate.update(DELETE_CLIENT, parameterSource);
    }
}
