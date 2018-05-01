/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelo.Libro;
import modelo.ListaLibro;

/**
 *
 * @author Judith Aldonate
 */
@ManagedBean
@RequestScoped
public class LibrosFormBeans {
    private Libro unLibro;
    private ListaLibro listaLibro;
    private String isbn;
    private String titulo;
    private String autor;
    private double precio;
    
    public LibrosFormBeans() {
        listaLibro =new ListaLibro();
    }
    public void verLista(){
        int i=0;
        for (Libro cdLibro: listaLibro.getListadoLibro()){
            System.out.println("ISBN: "+cdLibro.getIsbn()+" Titulo: "+cdLibro.getTitulo()+" Autor:"+cdLibro.getAutor()+ "  Precio: "+cdLibro.getPrecio());
        i++;}
    }   
     
    public void guardarLibro(){
        unLibro=new Libro (getIsbn(),getAutor(),getTitulo(),getPrecio());
        getListaLibro().getListadoLibro().add(getUnLibro());
    }
 
    /**
     * @return the unLibro
     */
    public Libro getUnLibro() {
        return unLibro;
    }

    /**
     * @param unLibro the unLibro to set
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }

    /**
     * @return the listaLibro
     */
    public ListaLibro getListaLibro() {
        return listaLibro;
    }

    /**
     * @param listaLibro the listaLibro to set
     */
    public void setListaLibro(ListaLibro listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
