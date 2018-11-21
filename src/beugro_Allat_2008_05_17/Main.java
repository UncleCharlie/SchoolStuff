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

public static String youngestMammalSandPr(List<Allat> inputList ){
    List<Emlos> MammalsWithFootpr = new ArrayList<Emlos>();
    double youngest = 0;
    for(Allat E : inputList){
        if(E instanceof Emlos && ((Emlos) E).labNyom()){
            MammalsWithFootpr.add((Emlos)E);
        }
    }
    if(MammalsWithFootpr.isEmpty())
        return "No Big Animals :(";
    else if(MammalsWithFootpr.size() == 1){
        return MammalsWithFootpr.get(0).faj;
    }else
    {
        youngest = MammalsWithFootpr.get(0).kor;
        int youngestAt = 0;
        for(int i = 1; i < MammalsWithFootpr.size(); i++){
            if(MammalsWithFootpr.get(i).kor < youngest){
                youngest = MammalsWithFootpr.get(i).kor;
                youngestAt = i;
            }
        }
    return MammalsWithFootpr.get(youngestAt).faj;
    }
}
    
    public static void main(String Args[]){
        Scanner userIn = new Scanner(System.in);
        Allat elefant = new Allat("Elefánt", 3.5, 870);
        Allat[] allatTomb = new Allat[4];
        List<Allat> AllatLista = new ArrayList<Allat>();
        
        //get animals:
        for(int i = 0; i < 4; i++){
            String[] params = new String[4];
            params = userIn.nextLine().split("[ ]+");
            
            if(i < 2){
            allatTomb[i] = new Madar(
                params[0],
                Double.parseDouble(params[1]),
                Double.parseDouble(params[2]),
                Boolean.parseBoolean(params[3])
            );}
            else{
            allatTomb[i] = new Emlos(
                params[0],
                Double.parseDouble(params[1]),
                Double.parseDouble(params[2]),
                Integer.parseInt(params[3])
            );
            ((Emlos) allatTomb[i]).labNyom();
            }
            
        AllatLista.add(allatTomb[i]);
        }
        System.out.println(youngestMammalSandPr(AllatLista));
    }
    
}
