/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patronproxy;

import modelo.proxy.ProxyImagen;


/**
 *
 * @author yesid caicedo
 */
public class PatronProxy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProxyImagen pi = new ProxyImagen();
        pi.cargar();
        pi.dibujar();
        pi.guardar();
    }
    
}
