/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elektronika;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author guthk
 */
//6

public class TeveTeszt {
    //8
    public static double atlagTulajdonsag(Collection<Teve> teveKollekcio)
    {
        double tulajdonsagAtlag = 0;
        for(Teve T : teveKollekcio)
        {
            tulajdonsagAtlag +=T.getTulajdonsagok().length;
        }
        tulajdonsagAtlag /= teveKollekcio.size();
        
        return tulajdonsagAtlag;
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<Teve> tesztKollekcio = new ArrayList();
        try{
        File inputfile = new File(args[0]);
        Scanner inputLines = new Scanner(inputfile);
        while(inputLines.hasNextLine()){
            Scanner inputTokens = new Scanner(inputLines.nextLine());
            inputTokens.useDelimiter("[;,\n]");
            String TeveFajta = new String(inputTokens.next());
            String TeveMarka = new String(inputTokens.next());
            String TeveTipus = new String(inputTokens.next());
            int TeveAr = Integer.parseInt(inputTokens.next());
            boolean TeveExtra = false;
            if(TeveFajta.contentEquals("L") || TeveFajta.contentEquals("S") )
                TeveExtra = inputTokens.next().contentEquals("+");
            ArrayList<String> TeveTul = new ArrayList<String>();
            while(inputTokens.hasNext())
                TeveTul.add(inputTokens.next());
                    
            if(TeveFajta.contentEquals("L"))
            {
                LEDTeve TmpTeve = new LEDTeve(TeveMarka,TeveTipus,TeveTul,TeveAr,TeveExtra);
                tesztKollekcio.add(TmpTeve);
            }
            else if(TeveFajta.contentEquals("S"))
            {
                SmartTeve TmpTeve = new SmartTeve(TeveMarka,TeveTipus,TeveTul,TeveAr,TeveExtra);
                tesztKollekcio.add(TmpTeve);
            }else
            {
                Teve TmpTeve = new Teve(TeveMarka,TeveTipus,TeveTul,TeveAr);
                tesztKollekcio.add(TmpTeve);
            }
        }
        }catch(FileNotFoundException ioex){
            System.out.println("A fajl nem talalhato");
            System.exit(0);
        }
        //(String nev, String cim, Teve[] Kinalat)
        //7
        String piacNev;
        String piacCim;

        if(args.length < 2)
            piacNev = "Debreceni Médiapiac";
        else
            piacNev = args[1];
        if(args.length < 3)
            piacCim = "Debrecen, Piac u.";
        else
            piacCim = args[2];
        
        MediaPiac localPiac = new MediaPiac(piacNev, piacCim, tesztKollekcio.toArray(new Teve[0]));
        localPiac.kiir("tevek.txt");
        
        Scanner userInput = new Scanner(System.in);
        String keresettTulajdonsag = userInput.nextLine();
        ArrayList<Teve> keresettTevek = new ArrayList();
        keresettTevek.addAll(localPiac.adottTulajdonsaguTevek(keresettTulajdonsag));
        for(Teve T : keresettTevek)
            System.out.println(T.toString());
        
        //8
        for(Teve T : tesztKollekcio)
            if(T.getTulajdonsagok().length < atlagTulajdonsag(tesztKollekcio))
            System.out.println(T.toString());
    }
}
