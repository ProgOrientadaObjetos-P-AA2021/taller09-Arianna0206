/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensual;

    public PrestamoAutomovil(Persona b, int t, String c,
            String tA, String mA, Persona g1, double vA) {
        super(b, t);
        establecerCiudad(c);
        tipoAutomovil = tA;
        marcaAutomovil = mA;
        garante1 = g1;
        valorAutomovil = vA;
       
    }

    public void establecerGarante1(Persona n) {
        garante1 = n;
    }

    public void establecerTipoAutomovil(String n) {
        tipoAutomovil = n;
    }

    public void establecerMarcaAutomovil(String n) {
        marcaAutomovil = n;
    }

    public void establecerValorAutomovil(double n) {
        valorAutomovil = n;
    }

    public void calcularValorMensual() {
        valorMensual = valorAutomovil / tiempoPrestamo;
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toLowerCase();
    }

    public Persona obtenerGarante1() {
        return garante1;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcaAutomovil() {
        return marcaAutomovil;
    }

    public double obtenerValorAutomovil() {
        return valorAutomovil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%sTipo de automovil: %s\n"
                + "Marca del automovil: %s\n"
                + "Garante: \n\tNombre: %s\n\tApellido: %s\n"
                + "Valor del Automóvil: %.2f\n"
                + "Valor Mensual del pago: %.2f\n",
                cadena,
                obtenerTipoAutomovil(),
                obtenerMarcaAutomovil(),
                obtenerGarante1().obtenerNombre(),
                obtenerGarante1().obtenerApellido(),
                obtenerValorAutomovil(),
                obtenerValorMensual());
        return cadena;
    }

}
