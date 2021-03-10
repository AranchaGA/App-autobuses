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
public class BonoBusJubilado extends BonoJoven {

    public BonoBusJubilado(Calendar fCreacion, int edad, String nombre, String apellidos, String dni) {
        super(fCreacion, edad, nombre, apellidos, dni);
    }

    public void pViajeJuvilado(String dniJ){
        this.dniJ=dniJ;
        if (dniJ.equals(dni)) {
            super.pagarUnViaje();
        }else{
            System.out.println("Dni no coincide");
        }
    }
    
}
