/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fundamentos;

/**
 *
 * @author washi
 */
public class SCops {

    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }

        d = 0;

        if (d != 0 && (n % d) == 0) {
            System.out.println(d + " is a factor of " + n);
        }
//erro de divisão abaixo
        if (d != 0 & (n % d) == 0) {
            // Bloco vazio (não recomendado, mas compila)
            System.out.println(d + " is a factor of " + n);
        }

    }

}
