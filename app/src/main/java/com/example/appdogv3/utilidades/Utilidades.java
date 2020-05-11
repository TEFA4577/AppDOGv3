package com.example.appdogv3.utilidades;

public class Utilidades {

    //constntes campos tabla mascota
    public final static String TABLA_MASCOTA = "MASCOTA";
    public final static String ID_MASC= "id_masc";
    public final static String NOM_MASC = "nom_masc";
    public final static String EDAD_MASC = "edad_masc";
    public final static String PESO_MASC = "peso_masc";

    //crear las tablas creando script SQL
    public static final String TABLE_MASCOTA = "CREATE TABLE " +
            ""+ TABLA_MASCOTA +" ("+ID_MASC+" " +
            "INTEGER PRIMARY KEY, "+NOM_MASC+" TEXT, "+EDAD_MASC+" TEXT, "+PESO_MASC+" TEXT)";
}
