/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.time.LocalDateTime;

/**
 *
 * @author guthk
 */
public abstract class Szamonkeres implements Comparable<Szamonkeres>{
//******************1******************
    private String nev;
    private LocalDateTime kezdesiIdo;
    private boolean isIrasbeli;
    private int[] pontszamok;

    public Szamonkeres(String nev, LocalDateTime kezdesiIdo, boolean isIrasbeli, int[] pontszamok) {
        this.nev = nev;
        this.kezdesiIdo = kezdesiIdo;
        this.isIrasbeli = isIrasbeli;
        this.pontszamok = pontszamok;
    }
//******************4******************
    public Szamonkeres(String nev, LocalDateTime kezdesiIdo, int[] pontszamok) {
        this.nev = nev;
        this.kezdesiIdo = kezdesiIdo;
        this.isIrasbeli = true;
        this.pontszamok = pontszamok;
    }
//******************/4******************
    public String datumToString(){
        return kezdesiIdo.getYear() + " " + kezdesiIdo.getMonth() + " " + kezdesiIdo.getDayOfMonth() + " " + kezdesiIdo.getHour() + " " + kezdesiIdo.getMinute();
    
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public LocalDateTime getKezdesiIdo() {
        return kezdesiIdo;
    }

    public boolean isIsIrasbeli() {
        return isIrasbeli;
    }

    public int[] getPontszamok() {
        return pontszamok;
    }
 //******************/1******************   
//******************2******************     
    public int maxPontszam(){
        int maxP = 0;
        for(int P : pontszamok)
            maxP += P;
        
        return maxP;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Szamonkeres)
            return nev.contentEquals(((Szamonkeres) obj).nev);
        else
            return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String tipus = "";
        tipus = isIrasbeli ? "Irasbeli" : "Szobeli";
        return nev + " " + tipus + " szamonkeres (" + this.datumToString() + ")";//To change body of generated methods, choose Tools | Templates.
    }
//******************/2******************      
//******************3******************      

    @Override
    public int compareTo(Szamonkeres o) {
        if(!this.kezdesiIdo.isEqual(o.getKezdesiIdo()))
            return this.kezdesiIdo.compareTo(o.getKezdesiIdo());
        else
            return this.nev.compareTo(o.getNev());
    }
//******************/3******************  
}
