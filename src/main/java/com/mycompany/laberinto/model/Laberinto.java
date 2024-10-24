/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberinto.model;

/**
 *
 * @author Paula
 */
public class Laberinto {
    //0 es la celda por donde puede pasar
    //1 es el espacio que no transita 
    // 2 es el enemigo
    private int [][] laberinto; 
    
    public void Laberinto(){
     int [][] laberinto= {
     //matriz//
     
     }; 
             
     this.laberinto = laberinto; 
    }
    public int getCelda(int fila, int columna){
    return laberinto[fila][columna]; 
    }
}
