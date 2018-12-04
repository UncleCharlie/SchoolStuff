/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_jatek;

/**
 *
 * @author guthk
 */
public class Tarsasjatek implements Comparable<Tarsasjatek>{
    
    //1
    protected String nev;
    protected int korhatar;
    protected int minFo;
    protected int maxFo;
    
    //1
    public Tarsasjatek(String nev, int korhatar, int minFo, int maxFo) {
        try {
            this.nev = nev;
            this.korhatar = korhatar;
            this.minFo = minFo;
            this.maxFo = maxFo;
                 
            
            
            if(minFo < 0 || maxFo < 0 || korhatar < 0)
                throw new IllegalArgumentException();
            
        }catch(IllegalArgumentException iaex){
            System.out.println("Negativ ertek!");
        }
    }
    //1
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKorhatar() {
        return korhatar;
    }

    public void setKorhatar(int korhatar) {
        this.korhatar = korhatar;
    }

    public int getMinFo() {
        return minFo;
    }

    public void setMinFo(int minFo) {
        this.minFo = minFo;
    }

    public int getMaxFo() {
        return maxFo;
    }

    public void setMaxFo(int maxFo) {
        this.maxFo = maxFo;
    }

    @Override
    public String toString() {
            String toString;
            toString = nev;
            if(korhatar > 0)
                toString += " (" + korhatar  +  " eves kortol)";
            toString += ", Jatekosok szama: ";
            if(minFo > 0)
                toString += minFo;
            toString += "-";
            if(maxFo > 0)
                toString += maxFo;  
        
        
        return toString;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Tarsasjatek))
            return false;
        
        Tarsasjatek other = (Tarsasjatek) obj;
        
        return this.nev.equals(other.nev);
    }
    //2
    @Override
    public int compareTo(Tarsasjatek o) {
        if(this.korhatar != o.korhatar)
            return this.korhatar - o.korhatar;
        else
            return this.nev.compareToIgnoreCase(o.nev) * -1;
    }
    
    //4
    public void jatekosSzamCsere(){
        int swap;
        if(this.minFo != 0 && this.maxFo != 0)
        {
            if(minFo > maxFo)
            {
                swap = minFo;
                minFo = maxFo;
                maxFo = swap;
            }
        }
    
    }
}
