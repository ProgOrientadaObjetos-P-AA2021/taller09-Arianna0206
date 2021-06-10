/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private String nombreCentro;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(Persona b, int t, String c,
            String nE, String nC, double vC) {
        super(b, t);
        establecerCiudad(c);
        nivelEstudio = nE;
        nombreCentro = nC;
        valorCarrera = vC;
        
    }

    public void establecerNivelEstudio(String n) {
        nivelEstudio = n;
    }

    public void establecerNombreCentro(String n) {
        nombreCentro = n;
    }

    public void establecerValorCarrera(double n) {
        valorCarrera = n;
    }

    public void calcularValorMensual() {
        valorMensual = ((valorCarrera / tiempoPrestamo) - 0.10);
    }

    @Override
    public void establecerCiudad(String n) {
        ciudad = n.toUpperCase();
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public String obtenerNombreCentro() {
        return nombreCentro;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.toString());
        cadena = String.format("%sNivel de estudio: %s\n"
                + "Nombre del centro educativo: %s\n"
                + "Valor de la carrera: %.2f\n"
                + "Valor Mensual del préstamo del valor de la carrera: %.2f\n",
                cadena,
                obtenerNivelEstudio(),
                obtenerNombreCentro(),
                obtenerValorCarrera(),
                obtenerValorMensual());
        return cadena;
    }

}
