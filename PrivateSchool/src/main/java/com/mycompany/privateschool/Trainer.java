package com.mycompany.privateschool;

public class Trainer {

    private Person person;
    private String subject;

    Trainer(Person person) {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "person=" + person
                + ", subject=" + subject + '}';
    }

}
