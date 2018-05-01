/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal04;

import controlador.RectanguloBean;
import java.util.Scanner;

/**
 *
 * @author PC-Gamer
 */
public class Principal04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        RectanguloBean unBean = new RectanguloBean();
        unBean.llenarListado();
        unBean.visualizarListado();
        System.out.println("Elija que rectangulo sacar: ");
        System.out.println("0.- Primer rectangulo");
        System.out.println("1.- Segundo rectangulo");
        System.out.println("2.- Tercero rectangulo");
        int i = r.nextInt();
        unBean.eliminarRectanguloDeListado(i);
        System.out.println("");
        unBean.visualizarListado();
    }
    
}
