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
public class Oktato extends Szemely{
    private boolean ferfi;
    String tanszek;
    
    
    public Oktato(String n, int e, boolean f, String t){
        super(n,e,f);
        this.tanszek = t;
    }
}
