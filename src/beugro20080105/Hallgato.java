/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro20080105;

/**
 *
 * @author guthk
 */
public class Hallgato extends Szemely{
    private boolean ferfi;
    float atlag;
    
    public Hallgato(String n, int e, boolean f, float a){
        super(n,e,f);
        this.atlag = a;
    }
    
    public boolean isJoKepessegu(){
        if(this.atlag >= 4){
            return true;
        }else{
            return false;
        }
    }
    
    public String toString(){
        return this.nev + "\n" + this.eletkor + "\n" + this.ferfi + "\n" + atlag;
    }
}
