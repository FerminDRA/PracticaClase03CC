/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.uv.programaclase03cc;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fermin
 */
public class ProgramaClase03CC {

    public static void main(String[] args) {
        IMensaje m=null;
        m=new MensajeSaludoI();
        m.msg();
        
        m=new MensajeDespedidaI();
        m.msg();
        
        //instancia anonima, asi se crea la dependencia
        m=new IMensaje() {
            @Override
            public void msg() {
                Logger.getLogger(ProgramaClase03CC.class.getName()).log(Level.INFO, "Otro..");
            }
        };
        m.msg();
    }
}
