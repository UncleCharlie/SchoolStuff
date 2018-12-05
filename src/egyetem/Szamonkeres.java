/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package egyetem;
import java.util.*;
import java.time.*;
/**
 *
 * @author H23488221
 */
public abstract class Szamonkeres {
 
    //1
    private String megnevezes;
    private LocalDateTime kezdes;

    public Szamonkeres(String megnevezes, LocalDateTime kezdes, Boolean isIrasbeli, Boolean isSzobeli, int[] pontszamok) {
        this.megnevezes = megnevezes;
        this.kezdes = kezdes;
        this.isIrasbeli = isIrasbeli;
        this.isSzobeli = isSzobeli;
        this.pontszamok = pontszamok;
    }
    
    private Boolean isIrasbeli;
    private Boolean isSzobeli;
    
    private String tipus = isIrasbeli ? "Irasbeli" : "Szobeli" ;
    
    int[] pontszamok;

    public String getMegnevezes() {
        return megnevezes;
    }

    public void setMegnevezes(String megnevezes) {
        this.megnevezes = megnevezes;
    }

    public LocalDateTime getKezdes() {
        return kezdes;
    }

    public void setKezdes(LocalDateTime kezdes) {
        this.kezdes = kezdes;
    }

    public Boolean getIsIrasbeli() {
        return isIrasbeli;
    }

    public void setIsIrasbeli(Boolean isIrasbeli) {
        this.isIrasbeli = isIrasbeli;
    }

    public Boolean getIsSzobeli() {
        return isSzobeli;
    }

    public void setIsSzobeli(Boolean isSzobeli) {
        this.isSzobeli = isSzobeli;
    }

    public int[] getPontszamok() {
        return pontszamok;
    }

    public void setPontszamok(int[] pontszamok) {
        this.pontszamok = pontszamok;
    }
    
    public String getDateOfExam(){
        return "Date of exam: " + kezdes.getYear() + " " + kezdes.getMonth() + ". ho " + kezdes.getDayOfMonth() + " - " + kezdes.getHour() + ":" + kezdes.getMinute();
    }
    
    public int maxPontszam(){
        int maxPontszam = 0;
        for(int i = 0; i < pontszamok.length; i++)
            maxPontszam += pontszamok[i];
        
        return maxPontszam;
    } 

    public boolean equals(Szamonkeres obj) {
        return this.megnevezes.contentEquals(obj.megnevezes);
    }

    @Override
    public String toString() {
        return megnevezes + "megnevezes=" + megnevezes + ", kezdes=" + kezdes + ", isIrasbeli=" + isIrasbeli + ", isSzobeli=" + isSzobeli + ", pontszamok=" + pontszamok + '}';
    }
    
    
}
