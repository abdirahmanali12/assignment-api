package com.riigsoft.SpringAndReact.services;

import com.riigsoft.SpringAndReact.model.ClientForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService implements FormService{

    final List<ClientForm> clientForms = new ArrayList<>();

    @Override
    public List<ClientForm> getClientInfo() {
        return  clientForms;
    }

    @Override
    public void addNewClient(ClientForm clientForm) {
        clientForms.add(clientForm);
    }
}
