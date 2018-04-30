/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Scanner;

/**
 *
 * @author PC-Gamer
 */
public class Triangulo {
    private int[] l;

    public Triangulo() {
        
    }

    public void calcularPer() {
        ingreso();
        Boolean band = verifTriang();
        if (band == true) {
            System.out.println(getL()[0] + getL()[1] + getL()[2]);
        } else {
            System.out.println("Ingrese lados validos");
            calcularPer();
        }

    }

    public Boolean verifTriang() {
        if (getL()[0] + getL()[1] > getL()[2]) {
            if (getL()[0] + getL()[2] > getL()[1]) {
                if (getL()[2] + getL()[1] > getL()[0]) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public void ingreso() {
        setL(new int[3]);
        Scanner ingreso = new Scanner(System.in);
        for (int i = 0; i < getL().length; i++) {
            System.out.println("Ingrese lado ");
            getL()[i] = ingreso.nextInt();
        }
    }

    /**
     * @return the lados
     */
    public int[] getL() {
        return l;
    }

    /**
     * @param lados the lados to set
     */
    public void setL(int[] lados) {
        this.l = lados;
    }
}

