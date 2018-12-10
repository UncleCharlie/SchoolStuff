/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_osleny;

/**
 *
 * @author guthk
 */
public class teszt {
    
    public static void main(String[] args) {
        Oshullo dino = new Oshullo("MMMcskaszaurusz", "szoba", true);
        Dino dino2 = new Dino("kuttyaszaurusz", true, 34,45);
        dino.DinoToUpper(dino, 5);
        System.out.println(dino.toString());
        System.out.println(dino2.toString());
        
    }
}
