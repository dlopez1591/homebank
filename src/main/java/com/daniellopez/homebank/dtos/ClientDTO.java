package com.daniellopez.homebank.dtos;

import com.daniellopez.homebank.models.Account;
import com.daniellopez.homebank.models.Client;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class ClientDTO {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private Set<Account> accounts;

    public ClientDTO (Client client){
        this.id = client.getId();
        this.firstName = client.getFirstName();
        this.lastName = client.getLastName();
        this.email = client.getEmail();
        this.accounts = client.getAccounts().stream()
                .map(account -> new Account(account.getNumber(), account.getCreationDate(), account.getBalance()))
                .collect(toSet());

    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
