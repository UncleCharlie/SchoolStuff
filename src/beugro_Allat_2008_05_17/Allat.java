/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_Allat_2008_05_17;

/**
 *
 * @author H23488221
 */
public class Allat implements Comparable<Allat>
{
 protected String faj;
 protected double kor;
 protected double suly;

    public Allat(String faj, double kor, double suly) {
        this.faj = faj;
        this.kor = kor;
        this.suly = suly;
    }

    public String getFaj() {
        return faj;
    }

    public void setFaj(String faj) {
        this.faj = faj;
    }

    public double getKor() {
        return kor;
    }

    public void setKor(double kor) {
        this.kor = kor;
    }

    public double getSuly() {
        return suly;
    }

    public void setSuly(double suly) {
        this.suly = suly;
    }

    @Override
    public String toString() {
        return faj + ": " + kor + " év, " + suly + " kg";
    }

    @Override
    public int compareTo(Allat o) {
        
        if(this.suly > o.suly)
            return -1;
        if(this.suly < o.suly)
            return 1;       
        else
            return 0;
    }

}

