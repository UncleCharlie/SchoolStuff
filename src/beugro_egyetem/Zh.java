/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.time.LocalDateTime;

//******************4******************
public class Zh extends Szamonkeres {

    public Zh(String nev, LocalDateTime kezdesiIdo, int[] pontszamok) {
        super(nev, kezdesiIdo, pontszamok);
    }
    
    @Override
    public String toString() {
        return super.toString().replace("szamonkeres", "zh"); //To change body of generated methods, choose Tools | Templates.
    }    
//******************/4******************
}
