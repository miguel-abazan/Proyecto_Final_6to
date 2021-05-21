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
public class Film2 {
    private int id;
    private String titulo;
    private String desc;
    private Date fehca;
    private String lengName;
    private String lengOri;
    private int diaAl;
    private double pAl;
    private int duracion;
    private double cosE;
    private String rating;  
    private String spFe;
    
    public Film2(){}
    
    public Film2(int id, String titulo, String desc, Date fehca, String lengName, String lengOri, int diaAl, double pAl, int duracion, double cosE, String rating, String spFe) {
        this.id = id;
        this.titulo = titulo;
        this.desc = desc;
        this.fehca = fehca;
        this.lengName = lengName;
        this.lengOri = lengOri;
        this.diaAl = diaAl;
        this.pAl = pAl;
        this.duracion = duracion;
        this.cosE = cosE;
        this.rating = rating;
        this.spFe = spFe;
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

    public int getDiaAl() {
        return diaAl;
    }

    public void setDiaAl(int diaAl) {
        this.diaAl = diaAl;
    }

    public double getpAl() {
        return pAl;
    }

    public void setpAl(double pAl) {
        this.pAl = pAl;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosE() {
        return cosE;
    }

    public void setCosE(double cosE) {
        this.cosE = cosE;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpFe() {
        return spFe;
    }

    public void setSpFe(String spFe) {
        this.spFe = spFe;
    }

    
    
    
}
