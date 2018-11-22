/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_Allat_2008_05_17;
import java.util.*;

/**
 *
 * @author guthk
 */
public class Allatkert {
    ArrayList<Allat> allatkertLakoi = new ArrayList<Allat>();

    public Allatkert() {
        
    }
    
    public void addToAllatkert(Allat ujAllat) {
        this.allatkertLakoi.add(ujAllat);
    }
    public void removeFromAllatkert(Allat toroltAllat) {
        this.allatkertLakoi.remove(toroltAllat);
    }
    
    public void printThreeLargest(){
        ArrayList<Allat> sortedAllatkert = new ArrayList<Allat>();
        sortedAllatkert.addAll(allatkertLakoi);
        int counter = 0;
        
        Collections.sort(sortedAllatkert);
        
        for( Allat A : sortedAllatkert){
            System.out.println(A.toString());
            counter++;
            if(counter == 3)
                break;
        }
    }

    public void madarify(){
        for(Allat A : allatkertLakoi)
        {
            if( A instanceof Madar)
                A.faj += "madar";
        }
    }
    
}
