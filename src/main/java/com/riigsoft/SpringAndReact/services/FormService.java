package com.riigsoft.SpringAndReact.services;

import com.riigsoft.SpringAndReact.model.ClientForm;

import java.util.List;

public interface FormService {
    // read all data
    List<ClientForm> getClientInfo();
    // add new data
    void addNewClient(ClientForm clientForm);
}
