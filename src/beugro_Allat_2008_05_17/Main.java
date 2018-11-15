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
public class Main {
    
    
    public static void main(String Args[]){
        Scanner userIn = new Scanner(System.in);
        Allat elefant = new Allat("Elefánt", 3.5, 870);
        Allat[] allatTomb = new Allat[4];
        
        //get animals:
        for(int i = 0; i < 4; i++){
            String[] params = new String[4];
            params = userIn.nextLine().split("[ ]+");
            
            if(i < 2){
            allatTomb[i] = new Madar(
                params[0],
                Double.parseDouble(params[1]),
                Integer.parseInt(params[2]),
                Boolean.parseBoolean(params[3])
            );}
            else{
            allatTomb[i] = new Emlos(
                params[0],
                Double.parseDouble(params[1]),
                Integer.parseInt(params[2]),
                Integer.parseInt(params[3])
            );}
        }
    }
}
