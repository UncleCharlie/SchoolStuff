/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_film;

/**
 *
 * @author H23488221
 */
public class Film implements Comparable
{
   protected String cim;
   protected int hossz;
   protected boolean korhataros;
//1
    public Film(String cim, int hossz, boolean korhataros) {
        this.cim = cim;
        this.hossz = hossz;
        this.korhataros = korhataros;
    }
//2
    public String getCim() {
        return cim;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    public int getHossz() {
        return hossz;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

    public boolean isKorhataros() {
        return korhataros;
    }

    public void setKorhataros(boolean korhatáros) {
        this.korhataros = korhatáros;
    }
//3
    @Override
    public String toString() {
        String korhataros;
        if(this.korhataros)
            korhataros = "korhataros";
        else
            korhataros = "nem korhataros";
        
        return cim + ": " + hossz + " perces, " + korhataros;
    }
   //4

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Film)
            return this.cim.equalsIgnoreCase(((Film)obj).cim); //To change body of generated methods, choose Tools | Templates.
        else
            return false;
    }

    //5
    @Override
    public int compareTo(Object o) {
        return this.hossz - ((Film) o).hossz;
    }
   
}
