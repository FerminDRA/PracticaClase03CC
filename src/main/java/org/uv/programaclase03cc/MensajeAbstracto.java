/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programaclase03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fermin
 */
public abstract class MensajeAbstracto {
    //metodo concreto
    public void imprimir(){
        Logger.getLogger(MensajeAbstracto.class.getName()).log(Level.INFO, "Hola mundo abstracto");
    }
    
    //Metodo abstracto
    public abstract void msg();
}
