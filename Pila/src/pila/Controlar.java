/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

import java.util.Scanner;

/**
 *
 * @author braya
 */
public class Controlar {

    Scanner sc = new Scanner(System.in);
    Operaciones op = new Operaciones();
    int opc = -1;

    public Controlar() {

        while (opc != 0) {
            System.out.println("Elija una opción");
            System.out.println("1. Insertar");
            System.out.println("2. Modificar");
            System.out.println("3. Borrar");
            System.out.println("4. Listar");
            System.out.println("5. Escribir en archivo");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.println("Insertar");
                    int num = sc.nextInt();
                    sc.nextLine();
                    op.insertar(num);
                    break;
                case 2:
                    System.out.println("Modificar");
                    System.out.println("Posición a modificar");
                    int posmod = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Dato nuevo");
                    int datomod = sc.nextInt();
                    sc.nextLine();
                    op.modificar(posmod, datomod);
                    break;
                case 3:
                    System.out.println("Borrar");
                    System.out.println("Posición a borrar");
                    int posbor = sc.nextInt();
                    sc.nextLine();
                    op.borrado(posbor);
                    break;
                case 4:
                    System.out.println("Listar");
                    op.listar();
                    break;
                case 5:
                    System.out.println("Escribir en archivo");
                    op.archivo();
                default:
                    break;
            }

        }
    }

}
