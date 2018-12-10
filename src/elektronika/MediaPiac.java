/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronika;

import com.sun.xml.internal.ws.util.StringUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guthk
 */
public class MediaPiac implements TeveUzlet{
    String nev;
    String cim;
    ArrayList<Teve> Kinalat;

    public MediaPiac(String nev, String cim, Teve[] Kinalat) {
        this.nev = nev;
        this.cim = cim;
        this.Kinalat = new ArrayList<Teve>(Arrays.asList(Kinalat));
    }
    //5
    @Override
    public List<Teve> adottTulajdonsaguTevek(String tulajdonsag) {
        ArrayList<Teve> TmpList = new ArrayList<Teve>();
        String[] TmpTulajdonsagok;
        for(Teve T : this.Kinalat){
            TmpTulajdonsagok = T.getTulajdonsagok();
            
            for(int i = 0; i < TmpTulajdonsagok.length; i++)
            {

                if(TmpTulajdonsagok[i].contentEquals(tulajdonsag))
                {
                    TmpList.add(T);
                    break;
                }
            }
        }
        Collections.sort(TmpList);
        return TmpList;
    }

    @Override
    public List<Teve> adottTulajdonsaguModernTevek(String tulajdonsag) {
        ArrayList<Teve> TmpList = new ArrayList<Teve>();
        String[] TmpTulajdonsagok;
        
        for(Teve T : this.Kinalat){
        boolean isModern = false;    
            if(T instanceof LEDTeve)
            {
                if( ((LEDTeve) T).isOLED)
                    isModern = true;
            }
            if(T instanceof SmartTeve)
            {
                if( ((SmartTeve) T).alkalmazasTelepitheto)
                    isModern = true;
            }
            
            TmpTulajdonsagok = T.getTulajdonsagok();
            if(isModern){
                for(int i = 0; i < TmpTulajdonsagok.length; i++)
                {
                    if(TmpTulajdonsagok[i].contentEquals(tulajdonsag))
                    {
                        TmpList.add(T);
                        break;
                    }
                }
            }
        }
        Collections.sort(TmpList);
        return TmpList;
    }

    @Override
    public void kiir(String fajlnev) {
        String outputString = "";
        String LEDString = "";
        String SmartString = "";
        String OtherString = "";
        for(Teve T : Kinalat )
        {
            if(T instanceof LEDTeve)
                LEDString += T.toString() + "\n";
            else if(T instanceof SmartTeve)
                SmartString += T.toString() + "\n";
            else
                OtherString += T.toString() + "\n";
        }
        outputString += "LED-Tevek\n";
        outputString += LEDString + "\n";
        outputString += "Smart tevek\n";
        outputString += SmartString + "\n";
        outputString += "Egyeb tevek\n";
        outputString += OtherString + "\n";
        
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
           new FileOutputStream(fajlnev), "utf-8"))) {
           writer.write(outputString);
        } catch (IOException ex) {
            Logger.getLogger(MediaPiac.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }
    
    
    
}
