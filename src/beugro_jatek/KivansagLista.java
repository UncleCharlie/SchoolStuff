/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_jatek;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author guthk
 */
//5
public class KivansagLista implements JatekLista{

    HashSet<Tarsasjatek> lista = new HashSet<>();
    String tulajdonos;
    Collection<Tarsasjatek> CopyInputCollection = new ArrayList<>();
    
    public KivansagLista(String tulajdonos, Collection<Tarsasjatek> lista) {
        this.tulajdonos = tulajdonos;
        this.lista.addAll(lista);
        CopyInputCollection.addAll(lista);
    }

    @Override
    public String toString() {
        String toString = tulajdonos + "\n\n";
        for(Tarsasjatek T : lista)
            toString += T.toString() + "\n";
        
        return toString;
    }

    @Override
    public void felvesz(Tarsasjatek jatek) {
        lista.add(jatek);
    }

    @Override
    public List<KartyaJatek> kartyajatekok(String paklifajta) {
        List<KartyaJatek> kartyaJatekokRendezettListaja = new ArrayList<>() ;
        
        for(Tarsasjatek T : lista)
        {
            if(T instanceof KartyaJatek && ((KartyaJatek) T).getPaklifajta().equalsIgnoreCase(paklifajta))
            {
                kartyaJatekokRendezettListaja.add((KartyaJatek) T);
            }
        }
        Collections.sort(kartyaJatekokRendezettListaja);
        return kartyaJatekokRendezettListaja;
    }

    @Override
    public List<Tarsasjatek> megfeleloJatekok(int eletkor) {
        List<Tarsasjatek> jatekokRendezettListaja = new ArrayList<>();
        for(Tarsasjatek T : lista)
        {
            if(T.korhatar <= eletkor)
                jatekokRendezettListaja.add(T);
        }   
        
        Collections.sort(jatekokRendezettListaja);
        return jatekokRendezettListaja;
    }

    @Override
    public void kiir(String fajlnev) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //10
    public ArrayList<String> ennyiFoAltalJatszhato(int fokszama){
        ArrayList<String> k = new ArrayList<>();
        for(Tarsasjatek T : lista)
        {
            if(T instanceof KartyaJatek && T.minFo <= fokszama && (T.maxFo >= fokszama || T.maxFo == 0)){
             k.add(T.nev);
                System.out.println("Bingo");
            }
        }
        
        return k;
    }
}
