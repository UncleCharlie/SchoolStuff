/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_jatek;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author H23488221
 */
public class JatekTeszt {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Tarsasjatek> jateklista = new ArrayList<>();
        
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
        }
        
        for(Tarsasjatek T : jateklista)
            System.out.println(T.toString());
        
    }
}
