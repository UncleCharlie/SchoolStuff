/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_verseny;
import java.util.*;
import java.time.*;
/**
 *
 * @author H23488221
 */
public class TanulmanyiVerseny {
    //1
    protected String megnevezes;
    protected String tantargy;
    protected LocalDate datum;
    protected LocalTime kezdesiIdo;

    public String getMegnevezes() {
        return megnevezes;
    }

    public void setMegnevezes(String megnevezes) {
        this.megnevezes = megnevezes;
    }

    public String getTantargy() {
        return tantargy;
    }

    public void setTantargy(String tantargy) {
        this.tantargy = tantargy;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public LocalTime getKezdesiIdo() {
        return kezdesiIdo;
    }

    public void setKezdesiIdo(LocalTime kezdesiIdo) {
        this.kezdesiIdo = kezdesiIdo;
    }

    public LocalTime getBefejezesiIdo() {
        return befejezesiIdo;
    }

    public void setBefejezesiIdo(LocalTime befejezesiIdo) {
        this.befejezesiIdo = befejezesiIdo;
    }

    public TanulmanyiVerseny(String megnevezes, String tantargy, LocalDate datum, LocalTime kezdesiIdo, LocalTime befejezesiIdo) {
        this.megnevezes = megnevezes;
        this.tantargy = tantargy;
        this.datum = datum;
        this.kezdesiIdo = kezdesiIdo;
        this.befejezesiIdo = befejezesiIdo;
    }
    protected LocalTime befejezesiIdo;

    @Override
    public String toString() {
        return megnevezes + " " + tantargy + ", " + datum + " " + kezdesiIdo + "-" + befejezesiIdo;
    }

    @Override
    public boolean equals(Object obj) {
        return this.megnevezes.equals(((TanulmanyiVerseny)obj).megnevezes) && this.tantargy.equals(((TanulmanyiVerseny)obj).tantargy) && this.datum.equals(((TanulmanyiVerseny)obj).datum);
    }
    
    //4
    public void kezdesiIdoCsere(){
        if(befejezesiIdo.compareTo(kezdesiIdo) < 0)
        {
            LocalTime swap = kezdesiIdo;
            kezdesiIdo = befejezesiIdo;
            befejezesiIdo = swap;
        }
    }
    
    
}
