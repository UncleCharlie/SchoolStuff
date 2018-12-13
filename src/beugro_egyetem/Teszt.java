/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author guthk
 */
public class Teszt {
    public static void main(String[] args) {
        Zh tesztZh = new Zh("mittomenmi", LocalDateTime.parse("2007-12-15T13:30"), new int[] { 1, 3, 5, 6});
        Vizsga tesztVizsga = new Vizsga("mittomenmi", LocalDateTime.parse("2007-10-15T13:30"),false, new int[] { 1, 3, 5, 6});
        ArrayList<Szamonkeres> tesztKollekcio = new ArrayList<>();
        tesztKollekcio.add(tesztZh);
        tesztKollekcio.add(tesztVizsga);
        FelevesTesztek tesztTanulnivalok = new FelevesTesztek(tesztKollekcio, "Faszomebbeazegeszbe");
        
        tesztTanulnivalok.hozzaad(tesztZh);
        tesztTanulnivalok.hozzaad(tesztVizsga);
        try{
        System.out.println(tesztTanulnivalok.atlagPontszam());
        }catch(NincsTesztException nte){
            System.out.println(nte.getMessage());
        }
        
        System.out.println(tesztZh.toString());
        System.out.println(tesztVizsga.toString());
        System.out.println(tesztZh.maxPontszam());
    }
}
