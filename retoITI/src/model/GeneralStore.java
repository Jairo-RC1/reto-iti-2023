/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Li
 */
public class GeneralStore {
    int id, id_product, id_speciality;
    String name;

    public GeneralStore() {
    }

    public GeneralStore(int id, String name, int id_product, int id_speciality) {
        this.id = id;
        this.id_product = id_product;
        this.id_speciality = id_speciality;
        this.name = name;
    }
    
    public GeneralStore(String name, int id_product, int id_speciality) {
        this.id_product = id_product;
        this.id_speciality = id_speciality;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_product() {
        return id_product;
    }

    public void setId_product(int id_product) {
        this.id_product = id_product;
    }

    public int getId_speciality() {
        return id_speciality;
    }

    public void setId_speciality(int id_speciality) {
        this.id_speciality = id_speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
