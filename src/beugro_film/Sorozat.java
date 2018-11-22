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
public class Sorozat extends Film {
    int epizodokSzama;
    //6
    public Sorozat(String cim, int hossz, boolean korhataros, int epizodokSzama) {
        super(cim, hossz, korhataros);
        this.epizodokSzama = epizodokSzama;
    }
   //7 
    @Override
    public String toString() {
        String korhataros;
        if(this.korhataros)
            korhataros = "korhataros";
        else
            korhataros = "nem korhataros";
        
        return cim + ": " + hossz + " perces, " + korhataros + ", " + epizodokSzama + " reszes";
    }
    //10
    public Boolean sokreszes(){
        return this.epizodokSzama > 1000;
    }
    
}
