package com.user.entity;
import java.util.ArrayList;
import java.util.List;


public class User {

    private Long userId;
    private String Name;
    private String Phone;

    List<Contact> contacts = new ArrayList<>();


    // Constercters with list
    public User(Long userId, String name, String phone, List<Contact> contacts) {
        this.userId = userId;
        Name = name;
        Phone = phone;
        this.contacts = contacts;
    }

    // Constructer without list
    public User(int id, String name, String phone) {
        this.userId = (long) id;
        Name = name;
        Phone = phone;
    }
     
    //default constructer
    public User() {

    }




    //Getter and setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    
}