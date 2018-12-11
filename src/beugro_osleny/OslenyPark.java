/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_osleny;

/**
 *
 * @author guthk
 */
public interface OslenyPark
{
 // uj oshüllot vesz fel a parkba
 public void felvesz(Oshullo oshullo);
 // visszaadja azoknak a dinoknak a rendezett listajat (a termeszetes rendezettseg
 // sorrendjeben), amelyek testhossza legalabb a parameterben megkapott ertek
public java.util.List<Dino> nagyDinok(double minHossz);
 // visszaadja a parkban talalhato oshüllok szamat, ha a parameter hamis, illetve
 // csak a dinok szamat, ha igaz
 public int allatokSzama(boolean csakDinok);
 // kiirja a megadott allomanyba az oshüllok listajat (mindegyiket külon sorba)
 public void kiir(String fajlnev);
}
