/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_szemely;

/**
 *
 * @author guthk
 */
public class Hallgato extends Szemely{
    private boolean ferfi;
    double atlag;
    private static double elvaras = 4;
        
    Hallgato() { super(); }
    
    public Hallgato(String n, int e, boolean f, double a){
        super(n,e,f);
        this.atlag = a;
    }

    public static void setJoKepessegu(double elvarasBeallit){
        elvaras = elvarasBeallit;
    }

    public boolean isJoKepessegu(){
        if(this.atlag >= elvaras){
            return true;
        }else{
            return false;
        }
    }
        
    public String toString(){
        return this.nev + "\n" + this.eletkor + "\n" + this.ferfi + "\n" + atlag;
    }
}
