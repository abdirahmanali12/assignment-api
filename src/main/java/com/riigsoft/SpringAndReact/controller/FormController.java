package com.riigsoft.SpringAndReact.controller;

import com.riigsoft.SpringAndReact.exceptions.ApiRequestException;
import com.riigsoft.SpringAndReact.model.ClientForm;
import com.riigsoft.SpringAndReact.model.Elements;
import com.riigsoft.SpringAndReact.model.Save;
import com.riigsoft.SpringAndReact.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/form")
@CrossOrigin("*")
public class FormController {

    private final ClientService service;
    @Autowired
    public FormController(ClientService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity<List<ClientForm>> showData(){
        return ResponseEntity.ok(service.getClientInfo());
    }

    @PostMapping("/save")
    public void saveData(@RequestBody ClientForm clientForm ){
        if(clientForm == null)
               throw new ApiRequestException("Empty payload is not accepted", new NullPointerException());
        service.addNewClient(clientForm);
    }
}
