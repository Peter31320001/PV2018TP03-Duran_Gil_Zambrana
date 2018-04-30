/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class DiezNumeros {
    private int[] diezNumeros;

    public DiezNumeros() {
    }

    public DiezNumeros(int[] diezNumeros) {
        this.diezNumeros = diezNumeros;
    }

    public void ingresoNumeros(){
        diezNumeros = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<10;i++){
            System.out.println("Ingrese un numero");
            getDiezNumeros()[i]= in.nextInt();
        }   
    }
    public void mostrarArreglo(){
        int p = getDiezNumeros().length;
        for(int i=0;i<p;i++){
            System.out.print(getDiezNumeros()[i]+", ");
        }
    }
    public void obtenerMayMen(){
        int p = getDiezNumeros().length;
        int m,n;
        m=n=getDiezNumeros()[0];
        for(int i=1;i<p;i++){
            if(getDiezNumeros()[i]>m){
                m=getDiezNumeros()[i];
            }
            if(getDiezNumeros()[i]<n){
                n=getDiezNumeros()[i];
            }
        }
        System.out.println("El numero mayor en el arreglo es:"+m);
        System.out.println("El numero menor en el arreglo es:"+n);
    }
    public void obtenerPromedio(){
        int p = getDiezNumeros().length;
        int prom = 0;
        int i;
        int suma = 0;
        for(i=0;i<p;i++){
            suma= suma +getDiezNumeros()[i];
            prom = suma/p;
        }
        System.out.println("El promedio del arreglo es: "+prom);
    }
    /**
     * @return the diezNumeros
     */
    public int[] getDiezNumeros() {
        return diezNumeros;
    }

    /**
     * @param diezNumeros the diezNumeros to set
     */
    public void setDiezNumeros(int[] diezNumeros) {
        this.diezNumeros = diezNumeros;
    }
    
}
