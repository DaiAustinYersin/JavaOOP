/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai13.entities;

import java.time.LocalDate;

/**
 *
 * @author DaiAustinYersin
 */
public class Certificate {

    private String ID, name;
    private String rank;
    private LocalDate date;

    public Certificate(String ID, String name, String rank, LocalDate date) {
        this.ID = ID;
        this.name = name;
        this.rank = rank;
        this.date = date;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Certificate{" + "ID=" + ID + ", name=" + name + ", rank=" + rank + ", date=" + date + '}';
    }

}
