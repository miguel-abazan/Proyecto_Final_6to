/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import conexion.ConexionBD;
import java.sql.*;
import modelo.Actor;
import modelo.Film;

/**
 *
 * @author Miguel
 */
public class ActorDAO extends Actor{
    
    public static void EntradaActor(String nom,String cat)throws SQLException{
        CallableStatement agr =conexion.ConexionBD.getConnection().prepareCall("select insertaactor(?,?)");
        agr.setString(1, nom);
        agr.setString(2, cat);
        agr.execute();
        
    }
    
    
    public boolean modificarActor(Actor a) {
    			String sql = "UPDATE actor SET actor_name='"+a.getNombre()+"',"
                                             +"actor_last_name='"+a.getApellido()
    					     +"' WHERE actor_id ='"+a.getId()+"'";
    			boolean res = new ConexionBD().ejecutarInstruccion1(sql);
    			
    			return res; 
                        
    }         
    
    public static void EliminarActor(int id)throws SQLException{
        CallableStatement a =conexion.ConexionBD.getConnection().prepareCall("select ea(?)");
        a.setInt(1, id);
        a.execute();
        
    }
    
}
