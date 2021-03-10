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
public class BonoJoven extends BonoBus {

    protected int edad;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String dniJ;

    public BonoJoven(Calendar fCreacion, int edad, String nombre, String apellidos, String dni) {
        super(fCreacion);
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.dni=dni;
        this.edad=edad;
        
        if (edad<25) {
            int calculo = 25-edad;
            System.out.println("Te quedan " +calculo+ " años");
        }else if (edad>65){
            System.out.println("Eres mayor de 65 ");
        }
    }

    @Override
    public boolean pagarUnViaje() {
        return super.pagarUnViaje(); 
    }
    
    public void pViajeBjoven(String dniJ){
        this.dniJ=dniJ;
        if (dniJ.equals(dni)) {
            super.pagarUnViaje();
        }else{
            System.out.println("Dni no coincide");
        }
    }
    
    

}
