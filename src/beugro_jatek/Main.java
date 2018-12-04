/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_jatek;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author guthk
 */
public class Main {
    public static void main(String[] args) {
        Collection<Tarsasjatek> lista = new ArrayList<Tarsasjatek>();
        
        Tarsasjatek macska = new Tarsasjatek("Macska", 5, 8, 15);
        Tarsasjatek KutyaEgyJatek = new Tarsasjatek("Oacska", 6, 321, 60);
        KartyaJatek zsir = new KartyaJatek("francia", 23, "Oacska", 7, 0, 0);
        KartyaJatek LKutya = new KartyaJatek("francia", 23, "LKutya", 8, 0, 0);
        KartyaJatek RKuttya = new KartyaJatek("francia", 23, "RKuttya", 9, 0, 0);
        KartyaJatek pfadar = new KartyaJatek("francia", 23, "pfadar", 10, 0, 0);
        
        lista.add(macska);
        lista.add(zsir);
        lista.add(LKutya);
        lista.add(RKuttya);
        lista.add(pfadar);
        lista.add(KutyaEgyJatek);
        
        KivansagLista ujlista = new KivansagLista("Belae", lista);
        Collection<Tarsasjatek> megujabblista = new ArrayList<>();
        megujabblista = ujlista.megfeleloJatekok(8);
        
        
        for(Tarsasjatek T : megujabblista)
            System.out.println(T.nev);
        /*
        System.out.println(KutyaEgyJatek.compareTo(macska));
        System.out.println(zsir.toString());
        System.out.println(KutyaEgyJatek.toString());
        KutyaEgyJatek.jatekosSzamCsere();
        System.out.println(KutyaEgyJatek.toString());
        */
        
        
    }
}
