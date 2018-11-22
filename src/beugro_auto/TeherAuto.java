/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_auto;

/**
 *
 * @author guthk
 */
public class TeherAuto extends Auto {

    int teherbiras;
    
    public TeherAuto(String rendszam, int teljesitmeny, boolean automata, int teherbiras){
        super(rendszam, teljesitmeny, automata); 
        this.teherbiras = teherbiras;
    }
    
    public String toString(){
        return rendszam + " " + teljesitmeny + " " + automata + " " + teherbiras + "\n" ;
    }    
    
}