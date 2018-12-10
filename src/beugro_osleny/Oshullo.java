/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_osleny;

/**
 *
 * @author guthk
 */
public class Oshullo implements Comparable<Oshullo>{
    String faj;
    String eletter;
    boolean novenyevo;

    public Oshullo(String faj, String eletter, boolean novenyevo) {
        this.faj = faj;
        this.eletter = eletter;
        this.novenyevo = novenyevo;
    }
    
    public Oshullo(String faj, boolean novenyevo) {
        this.faj = faj;
        this.novenyevo = novenyevo;
        this.eletter = "";
    }
    
    public String getFaj() {
        return faj;
    }

    public String getEletter() {
        return eletter;
    }

    public boolean isNovenyevo() {
        return novenyevo;
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Oshullo))
            return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
        else
            return this.faj.contentEquals(((Oshullo) obj).faj);
        }

    @Override
    public String toString() {
        String novenyevoString = novenyevo ? "novenyevo" : "nem novenyevo";
        return this.faj + ": " + this.eletter + ", " +  novenyevoString;
    }

    @Override
    public int compareTo(Oshullo o) {
        return this.faj.compareTo(o.faj);
    }
    //4
    public void DinoToUpper(Oshullo D, double maxTomeg){
        String tmpString = " ";
        if(D instanceof Dino && ((Dino) D).getTestTomeg() > maxTomeg)
            ((Dino) D).faj.toUpperCase();
        else{
            tmpString = this.faj.substring(0,1).toUpperCase();
            tmpString += this.faj.substring(1,this.faj.length()).toLowerCase();
            this.faj = tmpString;
        }
    }
} 
    

    
