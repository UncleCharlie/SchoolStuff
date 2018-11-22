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
public class Emlos extends Allat{
    
    int labakSzama;
    double sulyHatar = 10;
    
    public Emlos(String faj, double kor, double suly, int labakSzama) {
        super(faj, kor, suly);
        this.labakSzama = labakSzama;
    }
    
    public boolean labNyom(){
        if((this.suly / this.labakSzama) > sulyHatar )
            return true;
        else
            return false;
    }

    public void setSulyHatar(double sulyHatar) {
        this.sulyHatar = sulyHatar;
    }
    
    
    
}
