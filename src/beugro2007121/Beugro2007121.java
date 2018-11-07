/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro2007121;
import java.util.*;
/**
 *
 * @author guthk
 */
public class Beugro2007121 {
    
        public static ArrayList<Auto> provideAbove20Tons(Auto[] inputArray){

            ArrayList<Auto> Above20Tons = new ArrayList<Auto>();
            for(int i = 0; i < inputArray.length; i++){
                if(inputArray[i] instanceof TeherAuto && inputArray[i].getTeljesitmeny() > 20){
                    Above20Tons.add(inputArray[i]);
                }
            }
            return Above20Tons;
        }
    
        public static void provide3Strongest(ArrayList<Auto> InputCollection){
            ArrayList<Auto> strongest = new ArrayList<Auto>(InputCollection);
            Collections.sort(strongest);
            for(int i = 0; i < strongest.size(); i++){
                System.out.println(strongest.get(i).toString());
                if(i==2){
                    break;
                }
            }
            System.out.println(Auto.getNumOfInstances());
        }
    /**
     * @param args the command line arguments
     */
    
        
    public static void main(String[] args) {
        // TODO code application logic here
        Auto tesztauto1 = new Auto("lll155", 100, true);
        System.out.println(tesztauto1.toString());
        
        Scanner sc = new Scanner(System.in);
        Auto[] autoTomb = new Auto[5];
        String[] params = new String[4];
        
        autoTomb[0] = new Auto("lll155", 100, true);
        autoTomb[1] = new Auto("Illinois", 200, false);
        autoTomb[2] = new TeherAuto("lezerkard", 200, true, 345);
        autoTomb[3] = new TeherAuto("kuttyabaszo", 340, false, 456);
        autoTomb[4] = new TeherAuto("blh", 540, false, 456);
        /*
        for(int i=0;i<4;i++){
            System.out.println("Adja meg az auto tulajdonsagait szokozzel elvalasztva");
            params = sc.nextLine().split("[ ]+");
            
            if(i < 2){ 
                autoTomb[i] = new Auto(params[0], Integer.parseInt(params[1]), Boolean.valueOf(params[2]));
            }else{      
               autoTomb[i] = new TeherAuto(params[0], Integer.parseInt(params[1]), Boolean.valueOf(params[2]),Integer.parseInt(params[3]));
            } 
            System.out.println(autoTomb[i].toString());
        }
        */
            Auto[] sortedAutoArray = autoTomb.clone();
            autoTomb[0].toString();
            autoTomb[1].toString();
            autoTomb[2].toString();
            autoTomb[3].toString();
        ;
        provide3Strongest(provideAbove20Tons(autoTomb));
    }   
}
