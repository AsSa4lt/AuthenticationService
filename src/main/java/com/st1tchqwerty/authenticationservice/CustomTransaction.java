package com.st1tchqwerty.authenticationservice;
import javax.persistence.*;

@Entity
public class CustomTransaction {
    @Id
    @GeneratedValue
    private long id;
    private String timeStamp;

    private String type;
    private String actor;
    private String data;

    public CustomTransaction(long id, String timeStamp, String type, String actor, String data) {
        this.id = id;
        this.timeStamp = timeStamp;
        this.type = type;
        this.actor = actor;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
