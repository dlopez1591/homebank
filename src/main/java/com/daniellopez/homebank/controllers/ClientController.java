package com.daniellopez.homebank.controllers;

import com.daniellopez.homebank.models.Client;
import com.daniellopez.homebank.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClientController {
    @Autowired
    private ClientRepository clientRepository;

    @RequestMapping("/clients")
    public List<Client> getClients(){
        return clientRepository.findAll();
    }
}
