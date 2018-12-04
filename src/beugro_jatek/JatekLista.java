/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_jatek;

/**
 *
 * @author guthk
 */
public interface JatekLista {
 // új játékot vesz fel a listára
 public void felvesz(Tarsasjatek jatek);
 // visszaadja azoknak a kártyajátékoknak a rendezett listáját (a természetes
 // rendezettség sorrendjében), amelyeket a paraméterként megkapott fajtájú
 // paklival kell játszani
 public java.util.List<KartyaJatek> kartyajatekok(String paklifajta);
 // visszaadja azoknak a játékoknak a rendezett listáját (a természetes
 // rendezettség sorrendjében), amelyeket játszhat egy paraméterként megkapott
// életkorú személy
 public java.util.List<Tarsasjatek> megfeleloJatekok(int eletkor);
 // kiírja a megadott állományba a játékok listáját (mindegyiket külön sorba)
 public void kiir(String fajlnev);
 
}
