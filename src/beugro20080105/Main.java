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
        /*
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
        */
        
        Egyetem uniDeb = new Egyetem();

        
        Hallgato H1 = new Hallgato("H1", 23, true, 4.4);
        Hallgato H2 = new Hallgato("H2", 25, false, 4.3);
        Hallgato H3 = new Hallgato("H3", 24, true, 4.3);
        Hallgato H4 = new Hallgato("H4", 26, false, 4.3);
        Oktato O1 = new Oktato("O1", 58, true, "IK");
        Oktato O2 = new Oktato("O2", 38, false, "TTK");
        Oktato O3 = new Oktato("O3", 55, true, "ZMK");
        Oktato O4 = new Oktato("O4", 33, false, "EK");
    
    
        uniDeb.storePeople(H1);
        uniDeb.storePeople(H2);
        uniDeb.storePeople(H3);
        uniDeb.storePeople(H4);
        uniDeb.storePeople(O1);
        uniDeb.storePeople(O2);
        uniDeb.storePeople(O3);
        uniDeb.storePeople(O4);
        
        uniDeb.printYoungestStudents();
        
        uniDeb.appendExclamationMark();
        
        System.out.println(uniDeb.egyetemPolgarok.toString());
        
    }}

