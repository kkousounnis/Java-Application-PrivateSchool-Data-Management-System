package com.mycompany.privateschool;

public class Trainer {

    private Person person;
    private String subject;

    Trainer(Person person) {
        this.person = person;
    }

    Trainer(Person person, String subject) {
        this.person = person;
        this.subject = subject;
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
