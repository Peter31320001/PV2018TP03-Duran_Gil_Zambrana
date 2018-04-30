/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author PC-Gamer
 */
public class Rectangulo {
    private int b;
    private int per;
    private int h;
    private int sup;

    public Rectangulo() {
    }

    public Rectangulo(int base, int perimetro, int altura, int superficie) {
        this.b = base;
        this.per = perimetro;
        this.h = altura;
        this.sup = superficie;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the per
     */
    public int getPer() {
        return per;
    }

    /**
     * @param per the per to set
     */
    public void setPer(int per) {
        this.per = per;
    }

    /**
     * @return the h
     */
    public int getH() {
        return h;
    }

    /**
     * @param h the h to set
     */
    public void setH(int h) {
        this.h = h;
    }

    /**
     * @return the sup
     */
    public int getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(int sup) {
        this.sup = sup;
    }


}
