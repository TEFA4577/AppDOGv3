package com.example.appdogv3.entidades;

public class Mascota {
    private Integer id_masc;
    private String nombre_masc;
    private String id_pna;
    private String id_edad;
    private String peso;
    private String id_tip_rza;

    public Mascota(Integer id_masc, String nombre_masc, String id_pna, String id_edad, String peso, String id_tip_rza) {
        this.id_masc = id_masc;
        this.nombre_masc = nombre_masc;
        this.id_pna = id_pna;
        this.id_edad = id_edad;
        this.peso = peso;
        this.id_tip_rza = id_tip_rza;
    }

    public Integer getId_masc() {
        return id_masc;
    }

    public void setId_masc(Integer id_masc) {
        this.id_masc = id_masc;
    }

    public String getNombre_masc() {
        return nombre_masc;
    }

    public void setNombre_masc(String nombre_masc) {
        this.nombre_masc = nombre_masc;
    }

    public String getId_pna() {
        return id_pna;
    }

    public void setId_pna(String id_pna) {
        this.id_pna = id_pna;
    }

    public String getId_edad() {
        return id_edad;
    }

    public void setId_edad(String id_edad) {
        this.id_edad = id_edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getId_tip_rza() {
        return id_tip_rza;
    }

    public void setId_tip_rza(String id_tip_rza) {
        this.id_tip_rza = id_tip_rza;
    }
}
