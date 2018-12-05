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
public class KartyaJatek extends Tarsasjatek{
    //3
    private String paklifajta;
    private int paklimeret;

    public KartyaJatek(String nev, int korhatar, int minFo, int maxFo,String paklifajta, int paklimeret) {
        super(nev, korhatar, minFo, maxFo);
        this.paklifajta = paklifajta;
        this.paklimeret = paklimeret;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + paklimeret + " lapos " + paklifajta + " kartya"; //To change body of generated methods, choose Tools | Templates.
    }

   
    
    

    public String getPaklifajta() {
        return paklifajta;
    }

    public int getPaklimeret() {
        return paklimeret;
    }
    
}
