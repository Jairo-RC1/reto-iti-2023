/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Li
 */
public class Client {
    int id, id_number, id_sales;
    String name;

    public Client() {
    }

    public Client(int id, int id_number, String name, int id_sales) {
        this.id = id;
        this.id_number = id_number;
        this.id_sales = id_sales;
        this.name = name;
    }
    
    public Client( int id_number, String name, int id_sales) {
        this.id_number = id_number;
        this.id_sales = id_sales;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_number() {
        return id_number;
    }

    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public int getId_sales() {
        return id_sales;
    }

    public void setId_sales(int id_sales) {
        this.id_sales = id_sales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
