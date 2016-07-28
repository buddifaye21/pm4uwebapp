package com.perfectlymaid4you.controller;


import com.perfectlymaid4you.database.ClientDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/client", consumes = "*", method = RequestMethod.GET)
public class ClientController {

    @Autowired
    private ClientDao clientDao;

    @RequestMapping(value = "/list")
    public ModelAndView listEmployees() {
        ModelAndView modelAndView = new ModelAndView("clients");
        modelAndView.addObject("list", clientDao.getClientList());
        return modelAndView;
    }

}
