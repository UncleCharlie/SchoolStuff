/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronika;

import java.util.ArrayList;

//4
public class LEDTeve extends Teve {
    
    boolean isOLED;
    
    public LEDTeve(String marka, String tipus, ArrayList<String> tulajdonsagok, int ar, boolean isOLED) {
        super(marka, tipus, tulajdonsagok, ar);
        this.isOLED = isOLED;
    }
    
}
