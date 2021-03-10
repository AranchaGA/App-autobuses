/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacroherencia;

import java.util.Calendar;

/**
 *
 * @author aranc
 */
public class wefewfwfwfaefwef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BonoJoven b1 = new BonoJoven(Calendar.getInstance(),18,"isidoro","guerrero", "258936l");
        b1.recargarSaldo(10);
        System.out.println(b1.getSaldo());
        b1.pViajeBjoven("258936l");
        System.out.println(b1.getSaldo());
        
        
        BonoBusJubilado j1 = new BonoBusJubilado(Calendar.getInstance(),66,"isidoro","guerrero", "258936l");
        j1.recargarSaldo(10);
         System.out.println(j1.getSaldo());
        j1.pViajeJuvilado("258936l");
        System.out.println(j1.getSaldo());
        
        
        
    }
    
}
