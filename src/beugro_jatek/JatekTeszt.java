/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_jatek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



/**
 *
 * @author H23488221
 */
public class JatekTeszt {
    //8
    public static void jatekJelleg(){
    
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Tarsasjatek> jateklista = new ArrayList<>();
        //6
        try         
        {
        File fajl = new File(args[0]);
        Scanner sc=new Scanner(fajl);
        
        while(sc.hasNextLine()){
            Scanner sor = new Scanner(sc.nextLine());
            sor.useDelimiter("[;\n]");
            String firstLetter = sor.next();
                if(firstLetter.equals("T"))
                {
                    Tarsasjatek tmpJatek = new Tarsasjatek(sor.next(),sor.nextInt(),sor.nextInt(),sor.nextInt());
                    jateklista.add(tmpJatek);
                }else if(firstLetter.equals("K"))
                {
                    KartyaJatek tmpJatek = new KartyaJatek(sor.next(),sor.nextInt(),sor.nextInt(),sor.nextInt(),sor.next(),sor.nextInt());
                    jateklista.add(tmpJatek);
                }
        }
                    
        }catch(FileNotFoundException iobe){
            System.err.println("File not found");
            return;
        }
        
        for(Tarsasjatek T : jateklista)
            T.jatekosSzamCsere();
        
        //7
        String tulajdonos;
        tulajdonos = args.length > 1 ? args[1] : "Petike";
        
        KivansagLista kivansaglista1 = new KivansagLista(tulajdonos, jateklista);
        
        Scanner line = new Scanner(System.in);
        System.out.println("Adja meg egy paklifajtat:");
        String paklifajta = line.next();
        
        for (KartyaJatek T : kivansaglista1.kartyajatekok(paklifajta))
            System.out.println(T.toString());
        
        
    }   
}
