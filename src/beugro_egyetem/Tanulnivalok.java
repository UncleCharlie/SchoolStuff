/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

/**
 *
 * @author guthk
 */
public interface Tanulnivalok
{
 // uj szamonkerest ad hozza a tanulnivalokhoz
 public void hozzaad(Szamonkeres teszt);
 // visszaadja a szamonkeresek atlagos pontszamat; kivetelt dob, ha egyetlen
 // szamonkeres sincs a nyilvantartasban
 public double atlagPontszam() throws NincsTesztException;
 // visszaadja a szamonkeresek listajat a termeszetes rendezettseguk sorrendjeben;
 // ha az elso parameter igaz, akkor csak a vizsgakat, ha hamis, akkor csak a
 // zh-kat, ha null, akkor mindegyiket; ha a masodik parameter igaz, akkor csak az
 // irasbeliket, ha hamis, akkor csak a szobeliket, ha null, akkor mindegyiket
 public java.util.List<Szamonkeres> tesztek(Boolean vizsgak, Boolean irasbelik);
}
