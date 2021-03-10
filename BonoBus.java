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
public abstract class BonoBus {

    protected int id;
    protected int saldo = 0;
    protected Calendar fCreacion;
    protected Calendar fValidez;
    protected static int precio = 4;
    protected boolean subir = true;
    protected static int nBono = 0;

    Calendar c = Calendar.getInstance();

    public BonoBus(Calendar fCreacion) {
        nBono++;
        this.fCreacion = Calendar.getInstance();
        c.add(Calendar.YEAR, +2);
    }

    public boolean pagarUnViaje() {
        if (saldo <= 0) {
            saldo -= precio;
            subir = false;
        } else if (this.getClass() == BonoJoven.class) {
            saldo -= precio / 2;
            System.out.println(saldo);
        } else if (this.getClass() == BonoBusJubilado.class) {
            float calcu = saldo -= precio / 3;
            System.out.println(calcu);
        }
        return subir;
    }

    public boolean pagarMultiplesViajes(int numViajes) {
        saldo -= numViajes;
        if (saldo <= 0) {
            subir = false;
        }
        return subir;
    }

    public int recargarSaldo(int recarga) {
        saldo += saldo + recarga;
        return saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public Calendar getfValidez() {
        return fValidez;
    }

}
