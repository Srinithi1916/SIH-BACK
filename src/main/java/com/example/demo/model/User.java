package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String damName;
    private String state;
    private String password;
    private String govtId;
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDamName(String damName) {
        this.damName = damName;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setGovtId(String govtId) {
        this.govtId = govtId;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDamName() {
        return damName;
    }
    public String getState() {
        return state;
    }
    public String getPassword() {
        return password;
    }
    public String getGovtId() {
        return govtId;
    }

}
