/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_film;
import java.util.*;
/**
 *
 * @author H23488221
 */
public class Main {
    
    //8
    public static void main(String[] args){
        
    Film hegylako = new Film("Hegylako", 112, true);
    Scanner userInput = new Scanner(System.in);

    System.out.println(hegylako.toString());

    //9
    String[] params = new String[4];
    
    Film[] filmTomb = new Film[4];
    for(int i = 0; i < 4 ; i++){
    params = userInput.nextLine().split("[ ]+");
    if(i < 2){
        filmTomb[i] = new Film(
            params[0], 
            Integer.parseInt(params[1]), 
            Boolean.parseBoolean(params[2])
    );}else{
        filmTomb[i] = new Sorozat(
            params[0], 
            Integer.parseInt(params[1]), 
            Boolean.parseBoolean(params[2]),
            Integer.parseInt(params[3])
            );    
            }
        }
    }
}
