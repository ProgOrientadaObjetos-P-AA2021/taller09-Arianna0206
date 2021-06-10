/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudad;

    public Prestamo(Persona b, int t) {
        beneficiario = b;
        tiempoPrestamo = t;
        
    }

    public void establecerBeneficiario(Persona n) {
        beneficiario = n;
    }

    public void establecerTiempoPrestamo(int n) {
        tiempoPrestamo = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiario:\nNombre: %s\n"
                + "Apellido: %s\nTiempo del préstamo: %d\n"
                + "Ciudad del préstamo: %s\n",
                beneficiario.nombre,
                beneficiario.apellido,
                obtenerTiempoPrestamo(),
                obtenerCiudad());

        return cadena;
    }
}
