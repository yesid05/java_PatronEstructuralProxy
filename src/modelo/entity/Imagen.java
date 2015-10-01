/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.entity;

import modelo.metodos.Iimagen;

/**
 *
 * @author yesid caicedo
 */
public class Imagen implements Iimagen{

    @Override
    public void dibujar() {
        System.out.println("Dibujando imagen");
    }

    @Override
    public void guardar() {
        System.out.println("Guardando...!");
    }

    @Override
    public void cargar() {
        System.out.println("Cargando imagen...!");
    }
    
}
