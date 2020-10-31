package com.java.automation.lab.fall.kapinus.core22.domain.classes;


public abstract class Training {
    private String name;
    private Trainer trainer;
    private Client client;
    private int sets;
    private int reps;

    public Training(String name, Trainer trainer, Client client, int sets, int reps){
        this.name = name;
        this.trainer = trainer;
        this.client = client;
        this.sets = sets;
        this.reps = reps;
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    @Override
    public String toString() {
        return "Training {\n\tname:" + name +
                "\n\ttrainer:" + trainer +
                "\n\tclient:" + client +
                "\n\tsets:" + Integer.toString(sets) +
                "\n\treps:" + Integer.toString(reps) +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return  name.equals(((Training)that).name) &&
                trainer.equals(((Training)that).trainer) &&
                client.equals(((Training)that).client) &&
                sets == ((Training)that).sets &&
                reps == ((Training)that).reps;
    }

    @Override
    public int hashCode() {
        return (reps + name.hashCode()) * sets;
    }
}
