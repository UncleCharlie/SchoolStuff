/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_auto;

/**
 *
 * @author guthk
 */
public class Auto implements Comparable<Auto>{
    String rendszam;
    int teljesitmeny;
    boolean automata;
    private static int counter;
    
    public Auto(String rendszam, int teljesitmeny, boolean automata){
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
        this.automata = automata;
        counter++;
    }
    
    public String getRendszam(){
        return rendszam;
    }
    public int getTeljesitmeny(){
        return teljesitmeny;
    }
    public boolean getAutomata(){
        return automata;
    }
    public String toString(){
        return rendszam + " " + teljesitmeny + " " + automata + "\n" ;
    }
    
    public boolean equals(Auto compCar){
        return rendszam == compCar.rendszam;
    }
    
    public int compareTo(Auto otherCar) {
        // usually toString should not be used,
        // instead one of the attributes or more in a comparator chain
        return (otherCar.getTeljesitmeny() - this.getTeljesitmeny());
    }
    
    public boolean isCompliant(){
        int isCompliant = 0;
        int i = 0;
        for(i = 0; i < this.rendszam.length(); i++){
            switch(i){
                case 0: isCompliant = (Character.isLetter(this.rendszam.charAt(i))) ? isCompliant + 1 : isCompliant;
                break;
                case 1: isCompliant = (Character.isLetter(this.rendszam.charAt(i))) ? isCompliant + 1 : isCompliant;
                break;
                case 2: isCompliant = (Character.isLetter(this.rendszam.charAt(i))) ? isCompliant + 1 : isCompliant;
                break;
                case 3: isCompliant = (Character.isDigit(this.rendszam.charAt(i))) ? isCompliant + 1 : isCompliant;
                break;
                case 4: isCompliant = (Character.isDigit(this.rendszam.charAt(i))) ? isCompliant + 1 : isCompliant;
                break;
                case 5: isCompliant = (Character.isDigit(this.rendszam.charAt(i))) ? isCompliant + 1 : isCompliant;
                break;
            }

        }
        return isCompliant == 6 && i == 6;
    }
    public static int getNumOfInstances() {
        return counter;
    }
}
