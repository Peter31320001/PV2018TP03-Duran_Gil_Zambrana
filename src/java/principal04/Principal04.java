/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal04;

import controlador.RectanguloBean;

/**
 *
 * @author PC-Gamer
 */
public class Principal04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloBean unBean = new RectanguloBean();
        unBean.llenarListado();
        unBean.visualizarListado();
        unBean.eliminarRectanguloDeListado(2);
        System.out.println("");
        unBean.visualizarListado();
    }
    
}
