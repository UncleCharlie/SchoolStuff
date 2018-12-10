/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronika;

import java.util.ArrayList;

//4
public class SmartTeve extends Teve {
    
    boolean alkalmazasTelepitheto;
    public SmartTeve(String marka, String tipus, ArrayList<String> tulajdonsagok, int ar, boolean alkalmazasTelepitheto) {
        super(marka, tipus, tulajdonsagok, ar);
        this.alkalmazasTelepitheto = alkalmazasTelepitheto;
    }
    
}
