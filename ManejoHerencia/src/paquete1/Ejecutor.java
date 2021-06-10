/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;
import paquete2.Persona;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        int salir;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una opción: \n"
                    + "Ingrese 1 para Prestamo Automovil\n"
                    + "Ingrese 2 para Prestamo Educativo\n");
            op = entrada.nextInt();
            if (op == 1) {
                prestamoAutomovil();
            } else {
                if (op == 2) {
                    prestamoEducativo();
                } else {
                    System.out.println("Opción incorrecta");
                }
            }
            System.out.println("Ingresar 2 para dejar de ingresar más datos ");
            salir = entrada.nextInt();
            if (salir == 2) {
                bandera = false;
            }
        }
    }

    public static void prestamoAutomovil() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String nombreGarante;
        String apellido;
        String apellidoGarante;
        String ciudad;
        String tipo;
        String marca;
        int meses;
        double valorAuto;

        System.out.println("Ingrese el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido de la persona");
        apellido = entrada.nextLine();

        System.out.println("Ingrese el nombre del Garante");
        nombreGarante = entrada.nextLine();
        System.out.println("Ingrese el apellido del Garante");
        apellidoGarante = entrada.nextLine();

        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese el tipo de automóvil");
        tipo = entrada.nextLine();
        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el número de meses del prestamo");
        meses = entrada.nextInt();
        System.out.println("Ingrese el valor del automóvil");
        valorAuto = entrada.nextDouble();

        Persona p = new Persona(nombre, apellido);

        Persona g1 = new Persona(nombreGarante, apellidoGarante);

        PrestamoAutomovil pA = new PrestamoAutomovil(p, meses, ciudad,
                tipo, marca, g1, valorAuto);

        pA.calcularValorMensual();
        System.out.println(pA);
    }

    public static void prestamoEducativo() {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        String ciudad;
        String nivel;
        String centro;
        int meses;
        double valorCarrera;

        System.out.println("Ingrese el nombre de la persona");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el apellido de la persona");
        apellido = entrada.nextLine();
        System.out.println("Ingrese la ciudad");
        ciudad = entrada.nextLine();

        System.out.println("Ingrese el nivel del estudio");
        nivel = entrada.nextLine();
        System.out.println("Ingrese el nombre del centro educativo");
        centro = entrada.nextLine();
        System.out.println("Ingrese el número de meses del prestamo");
        meses = entrada.nextInt();
        System.out.println("Ingrese el valor de la carrera");
        valorCarrera = entrada.nextDouble();

        Persona p = new Persona(nombre, apellido);

        PrestamoEducativo pE = new PrestamoEducativo(p, meses, ciudad,
                nivel, centro, valorCarrera);

        pE.calcularValorMensual();
        System.out.println(pE);
    }
}
