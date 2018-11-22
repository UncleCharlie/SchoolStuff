/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_allatok;

/**
 *
 * @author H23488221
 */
public class Madar extends Allat{
    
    boolean ropKepes;
    
    public Madar(String faj, double kor, double suly, boolean ropKepes) {
        super(faj, kor, suly);
        this.ropKepes = ropKepes;
    }

    @Override
    public String toString() {
        return kor + " éves " + suly + " kg-os " + ropKepes + " " + faj;
    }
    
    
    
}
