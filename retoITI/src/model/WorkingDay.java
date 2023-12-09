/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Li
 */
public class WorkingDay {
    int id, id_employe,total_hour,extraodinary;
    String in,out;

    public WorkingDay(int id, String in, String out, int id_employe, int total_hour, int extraodinary) {
        this.id = id;
        this.id_employe = id_employe;
        this.total_hour = total_hour;
        this.extraodinary = extraodinary;
        this.in = in;
        this.out = out;
    }
    
    public WorkingDay(String in, String out, int id_employe, int total_hour, int extraodinary) {
        this.id_employe = id_employe;
        this.total_hour = total_hour;
        this.extraodinary = extraodinary;
        this.in = in;
        this.out = out;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_employe() {
        return id_employe;
    }

    public void setId_employe(int id_employe) {
        this.id_employe = id_employe;
    }

    public int getTotal_hour() {
        return total_hour;
    }

    public void setTotal_hour(int total_hour) {
        this.total_hour = total_hour;
    }

    public int getExtraodinary() {
        return extraodinary;
    }

    public void setExtraodinary(int extraodinary) {
        this.extraodinary = extraodinary;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getOut() {
        return out;
    }

    public void setOut(String out) {
        this.out = out;
    }
    
    
    
}
