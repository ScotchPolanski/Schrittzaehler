//   $$\      $$\                 $$\                 $$\                       $$\      $$\                     $$\                     
//   $$$\    $$$ |                $$ |                $$ |                      $$$\    $$$ |                    $$ |                    
//   $$$$\  $$$$ | $$$$$$\   $$$$$$$ | $$$$$$\        $$$$$$$\  $$\   $$\       $$$$\  $$$$ | $$$$$$\   $$$$$$\  $$ | $$$$$$\  $$$$$$$\  
//   $$\$$\$$ $$ | \____$$\ $$  __$$ |$$  __$$\       $$  __$$\ $$ |  $$ |      $$\$$\$$ $$ | \____$$\ $$  __$$\ $$ |$$  __$$\ $$  __$$\ 
//   $$ \$$$  $$ | $$$$$$$ |$$ /  $$ |$$$$$$$$ |      $$ |  $$ |$$ |  $$ |      $$ \$$$  $$ | $$$$$$$ |$$ |  \__|$$ |$$ /  $$ |$$ |  $$ |
//   $$ |\$  /$$ |$$  __$$ |$$ |  $$ |$$   ____|      $$ |  $$ |$$ |  $$ |      $$ |\$  /$$ |$$  __$$ |$$ |      $$ |$$ |  $$ |$$ |  $$ |
//   $$ | \_/ $$ |\$$$$$$$ |\$$$$$$$ |\$$$$$$$\       $$$$$$$  |\$$$$$$$ |      $$ | \_/ $$ |\$$$$$$$ |$$ |      $$ |\$$$$$$  |$$ |  $$ |
//   \__|     \__| \_______| \_______| \_______|      \_______/  \____$$ |      \__|     \__| \_______|\__|      \__| \______/ \__|  \__|
//                                                              $$\   $$ |                                                               
//                                                              \$$$$$$  |                                                               
package schrittzähler.kw.pkg09;

import java.util.Scanner;

public class SchrittzählerKW09 {
    
    public static void drueckeEnter()                       // Funktion die wartet auf Enter Eingabe
    {
        System.out.println("Druecke ENTER zum Fortfahren");
        try
        {
            System.in.read();
            System.in.skip(System.in.available());
        }
        catch(Exception e) {e.printStackTrace();}
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true)
        {
        System.out.println("=== Menu ===");
        System.out.println("1) Einfache Ausgabe ohne Testprogramm");
        System.out.println("2) Einfache Ausgabe mit simulierten Schritten");
        System.out.println("3) Programm schliessen");
        
        Scanner scanner = new Scanner(System.in);
        int eingabe = scanner.nextInt();
        
        
        System.out.println("=== Schrittzähler ===");
        System.out.println();
        if(eingabe == 1)
        {
            
        StepCounter stepcounter = new StepCounter("29.11.2003");
        System.out.println(stepcounter.toString());
        drueckeEnter();
        }
        System.out.println();
        
        if(eingabe == 2)
        {
        
        System.out.println("Nach 'Testprogramm'");
        
        // === Testprogramm ===
        StepCounter stepcounter = new StepCounter("29.11.2003");

        for(int i = 0; i<=56; i++)
        {
            stepcounter.incrementSteps();
            i++;
        }
        System.out.println(stepcounter.toString());
        drueckeEnter();
        }
        
        if(eingabe == 3)
        {
            System.exit(0);
        }
        
        if(eingabe < 1 || eingabe > 3)
        {
            System.out.println(eingabe + " ist eine ungueltige Eingabe!");
            drueckeEnter();
        }
        
        }
    }
}
