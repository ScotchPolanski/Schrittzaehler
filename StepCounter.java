/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schrittzähler.kw.pkg09;

/**
 *
 * @author Admin
 */
public class StepCounter {
    private String datum;
    private int schritte;                                      
    
    public void incrementSteps()
    {
        this.schritte = this.schritte +1;
    }
    
    public StepCounter(String datum)
    {
        this.datum = datum;
        this.schritte = 29;
    }
    
    public String toString()
    {
       String ausgabe = "Am " + datum + " bin ich " + schritte + " Schritte gegangen.";
       return ausgabe;                                                              // String -> muss was zurückgeben
    }
}
