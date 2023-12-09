/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Li
 */
public class Deliver {
    int id, id_store, id_user;
    Date date;

    public Deliver() {
    }

    public Deliver(int id, int id_store, Date date, int id_user) {
        this.id = id;
        this.id_store = id_store;
        this.id_user = id_user;
        this.date = date;
    }
    
    public Deliver(int id_store, Date date, int id_user) {
        this.id_store = id_store;
        this.id_user = id_user;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_store() {
        return id_store;
    }

    public void setId_store(int id_store) {
        this.id_store = id_store;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
}
