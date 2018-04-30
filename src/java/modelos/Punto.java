/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class Punto {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double dist;

    public Punto() {
    }

    public Punto(int x1, int y1, int x2, int y2, double dist) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.dist = dist;
    }

    public void ingresoDatos(){
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese x1");
        x1 = ingreso.nextInt();
        System.out.println("Ingrese y1");
        y1 = ingreso.nextInt();
        System.out.println("Ingrese x2");
        x2 = ingreso.nextInt();
        System.out.println("Ingrese y2");
        y2 = ingreso.nextInt();
    }
    public void mostrarDistancia(){
        double d = Math.pow(x2-x1,2) + Math.pow(y2-y1, 2);
        dist= Math.sqrt(d);
        System.out.println("La distancia entre los puntos es: "+ dist);
        
    }
    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(int x1) {
        this.x1 = x1;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    /**
     * @param y1 the y1 to set
     */
    public void setY1(int y1) {
        this.y1 = y1;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(int x2) {
        this.x2 = x2;
    }

    /**
     * @return the y2
     */
    public int getY2() {
        return y2;
    }

    /**
     * @param y2 the y2 to set
     */
    public void setY2(int y2) {
        this.y2 = y2;
    }

    /**
     * @return the dist
     */
    public double getDist() {
        return dist;
    }

    /**
     * @param dist the dist to set
     */
    public void setDist(double dist) {
        this.dist = dist;
    }
    
}
