/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author relic
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        boolean imprimirPares = LocalDate.now().getDayOfMonth() % 2 == 0;

        while (numeroInicio <= numeroFin) {
            if (imprimirPares == true) {
                if (numeroInicio % 2 == 0) {

                    System.out.println(numeroInicio);
                }
            } else {
                if (numeroInicio % 2 != 0) {

                    System.out.println(numeroInicio);
                }
            }
            numeroInicio = numeroInicio + 1;
        }
        for (int i = 10; i > 0; i--)
    { if (i%2==0){
            System.out.println(i);}
        }

    }
}
