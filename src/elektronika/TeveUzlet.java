/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronika;

/**
 *
 * @author guthk
 */

public interface TeveUzlet
{
 // visszaadja az uzletben kaphato olyan tevek listajat a termeszetes
 // rendezettseguk sorrendjeben, amelyek tulajdonsagai között szerepel a
 // parameterkent megkapott tulajdonsag
 public java.util.List<Teve> adottTulajdonsaguTevek(String tulajdonsag);
 // visszaadja az uzletben kaphato olyan modern tevek listajat a termeszetes
 // rendezettseguk sorrendjeben, amelyek tulajdonsagai között szerepel a
 // parameterkent megkapott tulajdonsag; egy teve modern, ha OLED technologiaval
 // keszult LED-teve, vagy olyan smart teve, amelyre lehet uj alkalmazasokat
 // telepíteni
 public java.util.List<Teve> adottTulajdonsaguModernTevek(String tulajdonsag);
 // kiírja a megadott nevu allomanyba a tevek listajat (mindegyiket kulön
 // sorba), harom felcímkezett csoportban: először a LED-teveket („LED-tevek”
 // címkevel), aztan a smart teveket („Smart tevek” címkevel), vegul a többit
 // („Egyeb tevek” címkevel), a csoportokon belul a termeszetes rendezettseguk
 // sorrendjeben
 public void kiir(String fajlnev);
}
