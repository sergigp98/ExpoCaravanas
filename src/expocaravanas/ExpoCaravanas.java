/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expocaravanas;

/**
 *
 * @author Sergio
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExpoCaravanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        int opcion2;
        int ventaentradas;
        String opcionSTR;

        Scanner sc = new Scanner(System.in);

        Zona salaPrincipal = new Zona(1000);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);

        //Elijo opcion del menu que quiero
        while (opcion != 3) {
            System.out.println("1. Mostrar número entradas libres");
            System.out.println("2. Vender entradas");
            System.out.println("3. Salir\n");

            try {

                opcionSTR = sc.nextLine();
                opcion = Integer.parseInt(opcionSTR);
            } catch (NumberFormatException e) {
                System.out.println("INTRODUCE UN NÚNMERO DEL 1 AL 3");//Capturo la opcion introducida por si acaso no introduce un numero
            }

            if (opcion == 1) {//Muestra entradas que quedan
                
                System.out.println("Entradas disponibles sala principal : " + salaPrincipal.getNumeroentradas());
                System.out.println("Entradas disponibles zona de Compra-Venta : " + zonaCompraVenta.getNumeroentradas());
                System.out.println("Entradas disponibles en zona Vip : " + zonaVip.getNumeroentradas());
                
            } else if (opcion == 2) {//Elijo la zona de entradas que quiero comprar
                
                System.out.println("Elige la zona deseada");
                System.out.println("1. Sala principal");
                System.out.println("2. Zona Compra-Venta");
                System.out.println("3. Zona VIP\n");

                opcion2 = sc.nextInt();

                if (opcion2 == 1) {
                    
                    System.out.println("¿Cuántas entradas quiere?");
                    ventaentradas = sc.nextInt();
                    salaPrincipal.ventaEntradas(ventaentradas);
                    System.out.println("Quedan : " + salaPrincipal.getNumeroentradas() + "\n");

                } else if (opcion2 == 2) {
                    
                    System.out.println("¿Cuántas entradas quiere?");
                    ventaentradas = sc.nextInt();
                    zonaCompraVenta.ventaEntradas(ventaentradas);
                    System.out.println("Quedan : " + zonaCompraVenta.getNumeroentradas() + "\n");

                } else if (opcion2 == 3) {
                    System.out.println("¿Cuántas entradas quiere?");
                    ventaentradas = sc.nextInt();
                    zonaVip.ventaEntradas(ventaentradas);
                    System.out.println("Quedan : " + zonaVip.getNumeroentradas() + "\n");
                }
            }
        }
    }

}
