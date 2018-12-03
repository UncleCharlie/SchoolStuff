/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_verseny;

import java.io.*;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author H23488221
 */
public class ProgVerseny extends TanulmanyiVerseny implements Comparable{
    
    private ArrayList<String> prognyelvek;

    public ArrayList<String> getPrognyelvek() {
        return prognyelvek;
    }
    
    //2
    public ProgVerseny(String megnevezes, String tantargy, LocalDate datum, LocalTime kezdesiIdo, LocalTime befejezesiIdo, String prognyelvek) {
        super(megnevezes, tantargy, datum, kezdesiIdo, befejezesiIdo);
        tantargy = "informatika";
        
        try {
        Scanner progNyelv = new Scanner(prognyelvek);
        if(!progNyelv.hasNext())
            throw new RuntimeException();

        
        while(progNyelv.hasNext()){
            this.prognyelvek.add(progNyelv.next());
        }
        } catch (RuntimeException e){
            e.toString();
        }
    }

    @Override
    public String toString() {
        String progNyelvekTmp = "";
        
        for(int i = 0; i < prognyelvek.size() ; i++)
        {
            progNyelvekTmp += prognyelvek.get(i);
            if(i < prognyelvek.size() - 1)
                progNyelvekTmp += ", ";
        }
        return super.toString() + ", támogatott nyelvek: " + progNyelvekTmp; //To change body of generated methods, choose Tools | Templates.
    }
    //3
    @Override
    public int compareTo(Object o) {
        if(this.prognyelvek.size() != ((ProgVerseny)o).prognyelvek.size())
            return this.prognyelvek.size() - ((ProgVerseny)o).prognyelvek.size();
        else if(this.datum.compareTo(((ProgVerseny)o).datum) != 0)
            return this.datum.compareTo(((ProgVerseny)o).datum);
        else
            return this.kezdesiIdo.compareTo(((ProgVerseny)o).kezdesiIdo);
    }
    
    
    
    
}
