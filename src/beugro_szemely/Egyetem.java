/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_szemely;
import java.util.*;
/**
 *
 * @author guthk
 */
public class Egyetem {
    public ArrayList<Szemely> egyetemPolgarok = new ArrayList<Szemely>();
    static int hallgatoCounter = 0;
    
    public void storePeople(Hallgato newEntry){
        egyetemPolgarok.add(newEntry);
        hallgatoCounter++;
        Collections.sort(egyetemPolgarok);
    }
    public void storePeople(Oktato newEntry){
        egyetemPolgarok.add(newEntry);
        Collections.sort(egyetemPolgarok);
    }
    
    public void printYoungestStudents(){
        int counter = 0;
        for(Szemely Y : egyetemPolgarok){
            if(Y instanceof Hallgato){
                System.out.println(Y.nev);
                counter++;
            }
        if(counter == hallgatoCounter || counter == 3)
            break;
        }
    }
    
    public void printAll(){
        for(Szemely E : egyetemPolgarok){
            E.toString();
        }
    }
    
    public void appendExclamationMark(){
        for(Szemely N : egyetemPolgarok){
            if(N instanceof Oktato && N.getFerfi() == false)
            {
                N.nev += "!";
            }
        }
    }
    
}
