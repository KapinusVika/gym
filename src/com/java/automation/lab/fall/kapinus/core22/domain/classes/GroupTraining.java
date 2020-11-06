package com.java.automation.lab.fall.kapinus.core22.domain.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroupTraining {
    private String name;
    private Trainer trainer;
    private List<Client> clients;
    private int duration;

    public GroupTraining(String name, Trainer trainer, List<Client> clients, int duration){
        this.name = name;
        this.trainer = trainer;
        this.clients = clients;
        this.duration = duration;
    }

    public void addClients(Client client){
        clients.add(client);
    }
    public void removeClients(int index) {
        clients.remove(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
