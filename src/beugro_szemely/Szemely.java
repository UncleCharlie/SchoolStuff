/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_szemely;

/**
 * @author guthk
 */
public class Szemely implements Comparable<Szemely>{
	protected String nev;
	protected int eletkor;
	private boolean ferfi;
        
        public Szemely(){};
        
        public Szemely(String n, int e, boolean f){
            this.nev = n;
            this.eletkor = e;
            this.ferfi = f;
        }
        
        
        
        public void setNev(String n){
            this.nev = n;
        }
        public String getNev(){
            return this.nev;
        }
        public void setEletkor(int e){
            this.eletkor = e;
        }
        public int getEletkor(){
            return this.eletkor;
        }
        public void setFerfi(boolean f){
            this.ferfi = f;
        }
        public boolean getFerfi(){
            return this.ferfi;
        }
        
        public String toString(){
            return this.nev + " " + this.eletkor + " " + this.ferfi;
        }
        
        public int compareTo(Szemely compareSzemely){
            return this.getEletkor() - compareSzemely.eletkor;
        }
        
}
