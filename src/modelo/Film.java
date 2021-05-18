/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Miguel
 */
public class Film {

    private int id;
    private String titulo;
    private String desc;
    private Date fehca;
    private String lengName;
    private String lengOri;
    private int duracion;
    private double costo;
    private String rating;  
    private String cat;

    public Film(){}

    public Film(int id, String titulo, String desc, Date fehca, String lengName, String lengOri, int duracion, double costo, String rating, String cat) {
        this.id = id;
        this.titulo = titulo;
        this.desc = desc;
        this.fehca = fehca;
        this.lengName = lengName;
        this.lengOri = lengOri;
        this.duracion = duracion;
        this.costo = costo;
        this.rating = rating;
        this.cat = cat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Date getFehca() {
        return fehca;
    }

    public void setFehca(Date fehca) {
        this.fehca = fehca;
    }

    public String getLengName() {
        return lengName;
    }

    public void setLengName(String lengName) {
        this.lengName = lengName;
    }

    public String getLengOri() {
        return lengOri;
    }

    public void setLengOri(String lengOri) {
        this.lengOri = lengOri;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    
}
