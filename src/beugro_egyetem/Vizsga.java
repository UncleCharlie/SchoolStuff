/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.time.LocalDateTime;


public class Vizsga extends Szamonkeres {

    public Vizsga(String nev, LocalDateTime kezdesi_ido, boolean isIrasbeli, int[] pontszamok) {
        super(nev, kezdesi_ido, isIrasbeli, pontszamok);
    }
    
}
