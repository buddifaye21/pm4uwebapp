package com.perfectlymaid4you.controller;

import com.perfectlymaid4you.database.ClientDao;
import com.perfectlymaid4you.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/client", consumes = "*", method = RequestMethod.GET)
public class clientAddController {

    @Autowired
    private ClientDao clientDao;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String getClientAddPage(@ModelAttribute("client") Client client, BindingResult result){
        return "/clientadd";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String getClientEditPage(@ModelAttribute("client") Client client, BindingResult result){
        return "/clientedit";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String getClientDeletePage(@ModelAttribute("client") Client client, BindingResult result){
        return "/clientdelete";
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public String addClient(@ModelAttribute("client") Client clientForm){
        System.out.println("Form Info: "+clientForm);
        try {
            clientDao.addClient(
                    clientForm.getName(),
                    clientForm.getAddress(),
                    clientForm.getPrimaryPhone(),
                    clientForm.getAdditionalPhone(),
                    clientForm.getEmail(),
                    clientForm.getCleaningtype(),
                    clientForm.getInitialCharge(),
                    clientForm.getPrice(),
                    clientForm.getActive(),
                    clientForm.getNotes()
            );
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
        return "clientaddsuccess";
    }

    @RequestMapping(value="/edit/submit")
    public ModelAndView clientSearchResult(@ModelAttribute("client") Client client){
        System.out.println("Client: "+client.toString());
        int clientId;
        List<Client> result = clientDao.getClientByName(client.getName());
        System.out.println("Result: "+result.get(0).getId());
        if(result.size()== 1) {
            clientId = result.get(0).getId();
        }else{
            clientId = -9999;
        }
        ModelAndView modelAndView = new ModelAndView("clientedit");
        modelAndView.addObject("client", clientDao.getClient(clientId));
        Client resultid=clientDao.getClient(clientId);
        System.out.println("ResultID: "+resultid.getId());
        return modelAndView;
    }

    @RequestMapping(value="/delete/submit")
    public ModelAndView clientDeleteSearchResult(@ModelAttribute("client") Client client){
        System.out.println("Client: "+client.toString());
        int clientId;
        List<Client> result = clientDao.getClientByName(client.getName());
        System.out.println("Result: "+result.get(0).getId());
        if(result.size()== 1) {
            clientId = result.get(0).getId();
        }else{
            clientId = -9999;
        }
        ModelAndView modelAndView = new ModelAndView("clientdelete");
        modelAndView.addObject("client", clientDao.getClient(clientId));
        Client resultid=clientDao.getClient(clientId);
        System.out.println("ResultID: "+resultid.getId());
        return modelAndView;
    }

    @RequestMapping(value = "/edit/update", method = RequestMethod.POST)
    public String updateClient(@ModelAttribute("client") Client clientForm){
        System.out.println("Form Info: "+clientForm);
        System.out.println("Form Id: "+clientForm.getId());
        try {
            clientDao.updateClient(
                    clientForm.getId(),
                    clientForm.getName(),
                    clientForm.getAddress(),
                    clientForm.getPrimaryPhone(),
                    clientForm.getAdditionalPhone(),
                    clientForm.getEmail(),
                    clientForm.getCleaningtype(),
                    clientForm.getInitialCharge(),
                    clientForm.getPrice(),
                    clientForm.getActive(),
                    clientForm.getNotes()
            );
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
        return "clientupdatesuccess";
    }

    @RequestMapping(value = "/edit/delete", method = RequestMethod.POST)
    public String deleteClient(@ModelAttribute("client") Client clientForm){
        System.out.println("Form Info: "+clientForm);
        System.out.println("Form Id: "+clientForm.getId());
        try {
            clientDao.deleteClient(clientForm.getId());
        }catch (Exception e){
            System.out.println("Error: " +e);
        }
        return "clientdeletesuccess";
    }
}
