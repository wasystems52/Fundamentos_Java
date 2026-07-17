/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.com.fundamentos;

/**
 *
 * @author washi
 */
public class RelLogOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int i, j;

        boolean b1, b2;

        i = 10;
        j = 11;

        if (i < j) {
            System.out.println("i < j");
        }
        if (i <= j) {
            System.out.println("i <= j");
        }
        if (i != j) {
            System.out.println("i !< j");
        }
        if (i == j) {
            System.out.println("i == j");
        }
        if (i >= j) {
            System.out.println("i >= j");
        } else {
            System.out.println("Not");
        }
        if (i > j) {
            System.out.println("i > j");
        } else {
            System.out.println("Not");
        }

        b1 = true;
        b2 = false;

        if (b1 & b2) {

        }
        if (!(b1 & b2)) {
            System.out.println("!(b1 & b2) is true");
        }
        if (b1 | b2) {
            System.out.println("(b1 | b2) is true");
        }
        if (b1 ^ b2) {
            System.out.println("(b1 ^ b2) is true");
        }
    }

}
