package com.greenfoxacademy.ptop_app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    String message;

    public Log() {
    }

    public Log(String message) {

        this.message = message;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}