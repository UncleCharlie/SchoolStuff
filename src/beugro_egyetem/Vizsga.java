/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.time.LocalDateTime;

//******************4******************
public class Vizsga extends Szamonkeres {

    public Vizsga(String nev, LocalDateTime kezdesiIdo, boolean isIrasbeli, int[] pontszamok) {
        super(nev, kezdesiIdo, isIrasbeli, pontszamok);
    }

    @Override
    public String toString() {
        return super.toString().replace("szamonkeres", "vizsga"); //To change body of generated methods, choose Tools | Templates.
    }
    
}
