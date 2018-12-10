/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronika;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author guthk
 */
public class Teve implements Comparable<Teve>{
    //1
    private String marka;
    private String tipus;
    private String[] tulajdonsagok;
    private int ar;

    public Teve(String marka, String tipus, ArrayList<String> tulajdonsagok, int ar) {
        this.marka = marka;
        this.tipus = tipus;
        this.tulajdonsagok = tulajdonsagok.toArray(new String[0]);
        this.ar = ar;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Teve)
            return this.marka.equals(((Teve) obj).marka) && this.tipus.equals(((Teve) obj).tipus) ;
        else
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String tulajdonsagokString = "";
        
        for(int i = 0; i < tulajdonsagok.length; i++){
            tulajdonsagokString += tulajdonsagok[i];
            if (i != (tulajdonsagok.length - 1))
                tulajdonsagokString += ", ";
            
        }

        return this.marka + " " + this.tipus + " (" + tulajdonsagokString + "), " + ar;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }

    public String getTipus() {
        return tipus;
    }

    public String[] getTulajdonsagok() {
        return tulajdonsagok;
    }

    public int getAr() {
        return ar;
    }
//3
    @Override
    public int compareTo(Teve o) {
        if(this.ar != o.ar)
            return this.ar - o.ar;
        else if(this.marka.compareTo(o.marka) != 0)
            return this.marka.compareTo(o.marka);
        else
            return this.tipus.compareTo(o.tipus);
    }
    
    
}
