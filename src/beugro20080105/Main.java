/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro20080105;
import java.util.*;
/**
 *
 * @author guthk
 */
public class Main {
        
    public static double getAgeOfExcelents(ArrayList<Szemely> inputCollection){
            double sum = 0;
            int counter = 0;
            for(Szemely E : inputCollection){
                if(E instanceof Hallgato){
                   Hallgato TempHallgato = new Hallgato();
                   TempHallgato = (Hallgato) E;
                   sum = TempHallgato.isJoKepessegu() ? sum : sum + E.eletkor;
                   counter++;
                }
            }
            return sum / counter;
    }
    
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Szemely monaLiza = new Szemely("Mona Liza", 20, false);
        Szemely[] SzemelyTomb = new Szemely[4];
        Scanner userInput = new Scanner(System.in);
        String[] holdUserInput = new String[4];
        
        for(int i = 0; i < 4; i++){
            System.out.println("Adja meg a kovetkezo szemely adatait:");
            holdUserInput = userInput.nextLine().split("[ ]+");
            
            if(i < 2){
            SzemelyTomb[i] = new Hallgato(
                    holdUserInput[0], 
                    Integer.parseInt(holdUserInput[1]),
                    Boolean.valueOf(holdUserInput[2]),
                    Float.parseFloat(holdUserInput[3]));
            }else{
                    SzemelyTomb[i] = new Oktato(
                    holdUserInput[0], 
                    Integer.parseInt(holdUserInput[1]),
                    Boolean.valueOf(holdUserInput[2]),
                    holdUserInput[3]);
            }
        }
        
        ArrayList<Szemely> SzemelyKollekcio = new ArrayList<Szemely>();
        for(Szemely Sz : SzemelyTomb){
            SzemelyKollekcio.add(Sz);
        }
        
        System.out.println(monaLiza.toString());
        System.out.println(getAgeOfExcelents(SzemelyKollekcio));
       
}}

