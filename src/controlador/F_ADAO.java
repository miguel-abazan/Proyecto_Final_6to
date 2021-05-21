/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.CallableStatement;
import java.sql.SQLException;

/**
 *
 * @author Miguel
 */
public class F_ADAO {
    
public static void EntradaAF(int a,int b)throws SQLException{
        CallableStatement agr =conexion.ConexionBD.getConnection().prepareCall("select insertaaf(?,?)");
        agr.setInt(1, a);
        agr.setInt(2, b);
        agr.execute();
        
    }

public static void EliminarAF(int c, int b)throws SQLException{
        CallableStatement a =conexion.ConexionBD.getConnection().prepareCall("select el_af(?,?)");
        a.setInt(1, c);
        a.setInt(2, b);
        a.execute();
        
    }
    
    
}
