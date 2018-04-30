/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal01;

import modelos.DiezNumeros;

/**
 *
 * @author Ezequiel
 */
public class Principal01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiezNumeros unDiezNumeros = new DiezNumeros();
        unDiezNumeros.ingresoNumeros();
        unDiezNumeros.mostrarArreglo();
        unDiezNumeros.obtenerMayMen();
        unDiezNumeros.obtenerPromedio();
        // TODO code application logic here
    }
    
}
