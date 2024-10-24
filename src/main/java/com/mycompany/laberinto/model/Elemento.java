/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberinto.model;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Paula
 */

//ubicar al personaje
public class Elemento {
    private int fila; 
    private int columna; 
    private int x; 
    private int y; 
    private ImageIcon image; 

    public Elemento(int fila, int columna, int x, int y, ImageIcon image) {
        this.fila = fila;
        this.columna = columna;
        this.x = x;
        this.y = y;
        this.image = image;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }
    
    public void show (Graphics g){
    image.paintIcon(null, g, x, y);
    }
    
}
