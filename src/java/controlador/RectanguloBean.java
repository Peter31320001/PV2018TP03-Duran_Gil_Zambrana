/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelos.ListaRectangulo;
import modelos.ListaRectangulo;
import modelos.Rectangulo;
import modelos.Rectangulo;

/**
 *
 * @author PC-Gamer
 */
public class RectanguloBean {
    Rectangulo rectangulo;
    ListaRectangulo listaRectangulo;

    public RectanguloBean() {
        listaRectangulo=new ListaRectangulo();
    }
    public Rectangulo crearRectangulos(int base, int altura){
        Rectangulo unRectangulo=new Rectangulo();
        unRectangulo.setH(altura);
        unRectangulo.setB(base);
        unRectangulo.setPer(base*2+altura*2);
        unRectangulo.setSup(base*altura);
        return unRectangulo;
    }
    public void llenarListado(){
        listaRectangulo.getListadoRectangulo().add(crearRectangulos(2,4));
        listaRectangulo.getListadoRectangulo().add(crearRectangulos(3,6));
        listaRectangulo.getListadoRectangulo().add(crearRectangulos(4,9));
    }
    public void visualizarListado(){
        System.out.println("Rectangulos: ");
        for(Rectangulo cadaRectangulo:listaRectangulo.getListadoRectangulo())
            System.out.println("Rectangulo - Base: "+cadaRectangulo.getB()+" - Altura: "+cadaRectangulo.getH());
    }
    public void eliminarRectanguloDeListado(int indice){
        listaRectangulo.getListadoRectangulo().remove(indice);
    }
}
