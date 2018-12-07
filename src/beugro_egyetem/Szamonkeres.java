/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.time.LocalDateTime;

/**
 *
 * @author H23488221
 */
public abstract class Szamonkeres implements Comparable<Szamonkeres>{


    private String nev;
    private LocalDateTime kezdesi_ido;
    private boolean isIrasbeli;
    private int[] pontszamok;

    public Szamonkeres(String nev, LocalDateTime kezdesi_ido, boolean isIrasbeli, int[] pontszamok) {
        this.nev = nev;
        this.kezdesi_ido = kezdesi_ido;
        this.isIrasbeli = isIrasbeli;
        this.pontszamok = pontszamok;
    }
    public Szamonkeres(String nev, LocalDateTime kezdesi_ido, int[] pontszamok) {
        this.nev = nev;
        this.kezdesi_ido = kezdesi_ido;
        this.pontszamok = pontszamok;
    }
    public String getNev() {
        return nev;
    }

    public LocalDateTime getKezdesi_ido() {
        return kezdesi_ido;
    }

    public boolean isIsIrasbeli() {
        return isIrasbeli;
    }


    public int[] getPontszamok() {
        return pontszamok;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }
    
    public String printKezdes() {
        return kezdesi_ido.getYear() + "." + kezdesi_ido.getMonth() + "." + kezdesi_ido.getDayOfMonth() + " " + kezdesi_ido.getHour() + ":" + kezdesi_ido.getMinute();
    }
    //2
    public int MaxPontszam(){
        int maxpontszam = 0;
        for(int i : pontszamok)
            maxpontszam +=i;
        
        return maxpontszam;
    }

    @Override
    public String toString() {
        String szamonkeresTipusa = isIrasbeli ? "Szobeli" : "Irsabeli";
        return nev + " " + szamonkeresTipusa + " Szamonkeres " + " " + this.printKezdes();
    }

    
    public boolean equals(Szamonkeres obj) {
        return this.nev.equalsIgnoreCase(obj.nev); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Szamonkeres o) {
        if(!this.kezdesi_ido.equals(o.kezdesi_ido))
            return this.kezdesi_ido.compareTo(o.kezdesi_ido);
        else
            return this.nev.compareTo(o.nev);    }   
    
    
    
}
