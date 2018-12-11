/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_osleny;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author guthk
 */
public class Teszt {
    
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Oshullo> dinoLista = new ArrayList<>();
        
        try{
            String FileName = args[0];
            System.out.println(FileName);
            if(args.length == 0)
                throw new FileNotFoundException();
            File inputFile = new File(FileName);
            Scanner fileSc = new Scanner(inputFile);
            
            
            
            while(fileSc.hasNextLine()){
                Scanner lineSc = new Scanner(fileSc.nextLine());
                lineSc.useDelimiter("[;\n]");
                
                
                //String faj, String eletter, boolean novenyevo
                String tipus, faj,eletter;
                boolean novenyevo;
                double testhossz;
                int testtomeg;
                
                if(lineSc.next().contentEquals("H"))
                    tipus = "Oshullo";
                else
                    tipus = "Dino";
                faj = lineSc.next();
                eletter = lineSc.next();
                if(lineSc.next().contentEquals("N"))
                    novenyevo = true;
                else
                    novenyevo = false;
                
                
                
                
            }
            
            
            
        }catch(FileNotFoundException fnfex){
            System.err.println(fnfex.getMessage());
            System.exit(0);
        }
    }
}
