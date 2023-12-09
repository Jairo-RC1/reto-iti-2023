/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Li
 */
public class User {
    int id, rol_id, store_id;
    String name, password;

    public User() {
    }

    public User(int id, String name,String password, int rol_id, int store_id) {
        this.id = id;
        this.rol_id = rol_id;
        this.store_id = store_id;
        this.password = password;
        this.name = name;
    }
    
    public User(String name,String password, int rol_id, int store_id) {
        this.rol_id = rol_id;
        this.store_id = store_id;
        this.password = password;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
   
}
