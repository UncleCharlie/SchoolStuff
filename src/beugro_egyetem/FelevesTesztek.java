/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author guthk
 */
public class FelevesTesztek implements Tanulnivalok{

    ArrayList<Szamonkeres> tanulnivalokLista;
    String azonosito;

    public FelevesTesztek(Collection<Szamonkeres> tanulnivalokLista, String azonosito) {
        this.tanulnivalokLista.addAll(tanulnivalokLista);
        this.azonosito = azonosito;
    }

    @Override
    public String toString() {
        String outputString = "";
        return outputString;
    }
    
    @Override
    public void hozzaad(Szamonkeres teszt) {
        this.tanulnivalokLista.add(teszt);
    }

    @Override
    public double atlagPontszam () throws NincsTesztException {
        int osszPontszam = 0;

        if(tanulnivalokLista.isEmpty())
            throw new NincsTesztException();

        for(Szamonkeres T : tanulnivalokLista)
        {
            osszPontszam += T.maxPontszam();
        }
        return osszPontszam / tanulnivalokLista.size();
        
    }

    @Override
    public List<Szamonkeres> tesztek(Boolean vizsgak, Boolean irasbelik) {
        ArrayList<Szamonkeres> tesztekLista = new ArrayList<Szamonkeres>();
        for(Szamonkeres Sz : tanulnivalokLista)
        {
            if(vizsgak == true && Sz instanceof Vizsga){
                if(irasbelik == true && Sz.isIsIrasbeli())
                    tesztekLista.add(Sz);
                else if(irasbelik == false && !Sz.isIsIrasbeli())
                    tesztekLista.add(Sz);
                else if(irasbelik == null)
                    tesztekLista.add(Sz);
            }
            else if(!vizsgak == false && Sz instanceof Zh && (irasbelik == true || irasbelik == null))
                tesztekLista.add(Sz);
            else if(vizsgak == null)
                tesztekLista.add(Sz);
        }
        

        
        Collections.sort(tesztekLista);
        return tesztekLista;
    }
    
}
