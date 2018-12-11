package beugro_osleny;


import java.util.ArrayList;
import beugro_osleny.Oshullo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guthk
 */
public class JurassicPark implements OslenyPark{
    private ArrayList<Oshullo> allomany;
    private String nev;

    public JurassicPark(Collection<Oshullo> allomany, String nev) {
        this.allomany = new ArrayList<Oshullo>();
        this.allomany.addAll(allomany);
        this.nev = nev;
    }

    @Override
    public String toString() {
        String oshullok = "";
        for(Oshullo S : allomany)
        {
            oshullok += S.toString() + "\n";
        }
        return nev + "\n" + oshullok;
    }

    @Override
    public void felvesz(Oshullo oshullo) {
        allomany.add(oshullo);
    }

    /**
     *
     * @param minHossz
     * @return
     */
    @Override
    public List<Dino> nagyDinok(double minHossz) {
        ArrayList<Dino> nagyDinokLista = new ArrayList<>();
        
        for(Oshullo D : allomany)
        {
            if(D instanceof Dino)
            {
                if(((Dino) D).getTesthossz() >= minHossz)
                {
                    nagyDinokLista.add((Dino) D);
                }
            }
        }
        Collections.sort(nagyDinokLista);
        return nagyDinokLista;
    }

    @Override
    public int allatokSzama(boolean csakDinok) {
        int allatokSzama = 0;
        for(Oshullo T : allomany){
            if(!csakDinok)
                allatokSzama++;
            else if(csakDinok && T instanceof Dino)
                allatokSzama++;
        }
        
        return allatokSzama;
    }

    @Override
    public void kiir(String fajlnev) {
        try {
            File inputFile = new File(fajlnev);
            FileWriter fwriter = new FileWriter(inputFile); 
            for(Oshullo T : allomany){
                fwriter.write(T.toString()+ "\n");
            }
            fwriter.flush();
            fwriter.close();
        } catch (IOException ex) {
            Logger.getLogger(JurassicPark.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
}
