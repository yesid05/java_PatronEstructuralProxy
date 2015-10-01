/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.proxy;

import modelo.entity.Imagen;
import modelo.metodos.Iimagen;

/**
 *
 * @author yesid caicedo
 */
public class ProxyImagen implements Iimagen{
    
    Iimagen imagen = new Imagen();

    @Override
    public void dibujar() {
        imagen.dibujar();
    }

    @Override
    public void guardar() {
       imagen.guardar();
    }

    @Override
    public void cargar() {
        imagen.cargar();
    }
    
}
