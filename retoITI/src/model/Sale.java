/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Li
 */
public class Sale {
    int id, amount_total, id_prodcut;

    public Sale(int id, int amount_total, int id_prodcut) {
        this.id = id;
        this.amount_total = amount_total;
        this.id_prodcut = id_prodcut;
    }

    public Sale(int amount_total, int id_prodcut) {
        this.amount_total = amount_total;
        this.id_prodcut = id_prodcut;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount_total() {
        return amount_total;
    }

    public void setAmount_total(int amount_total) {
        this.amount_total = amount_total;
    }

    public int getId_prodcut() {
        return id_prodcut;
    }

    public void setId_prodcut(int id_prodcut) {
        this.id_prodcut = id_prodcut;
    }
    
    
}
