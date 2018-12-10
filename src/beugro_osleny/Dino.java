/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_osleny;


public class Dino extends Oshullo {
    private double testhossz;
    private int testTomeg;

    public double getTesthossz() {
        return testhossz;
    }

    public int getTestTomeg() {
        return testTomeg;
    }
    
    public Dino(String faj, boolean novenyevo,double testhossz,int testTomeg) {
        super(faj, novenyevo);
        this.eletter = "szarazfold";
        this.testhossz = testhossz;
        this.testTomeg = testTomeg;
    }


    @Override
    public String toString() {
        return super.toString() + " (" + this.testhossz + ", " + this.testTomeg + "kg)"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
