/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import conexion.ConexionBD;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Film;
import modelo.Film2;

/**
 *
 * @author Miguel
 */
public class Film2DAO extends Film2{
    public boolean modificarfilm(Film2 a) {
                    String sql = "UPDATE film2 SET title='"+a.getTitulo()+"',"
                                         +"description='"+a.getDesc()
                                         +"',release_year='"+a.getFehca()
                                         +"',language_name='"+a.getLengName()
                                         +"', original_language_name='"+a.getLengOri()
                                         +"',rental_duration='"+a.getDiaAl()
                                         +"',rental_rate= '"+a.getpAl()
                                         +"',length='"+a.getDuracion()
                                         +"',remplacement_cost= '"+a.getCosE()
                                         +"', rating='"+a.getRating()
                                         +"', s_f='"+a.getSpFe()
                                         +"' WHERE film_id ='"+a.getId()+"'";
                    boolean res = new ConexionBD().ejecutarInstruccion1(sql);

                    return res; 

}         
 
      public boolean eliminarFilm(String a) {
    	//DELETE FROM Alumnos WHERE Num_Control = '3';
    			String sql = "DELETE FROM film2 WHERE film_id = '"+a+"'";
    			return new ConexionBD().ejecutarInstruccion(sql);
		
	}
      
      public static void EliminarPelis(int id)throws SQLException{
   
        CallableStatement del =conexion.ConexionBD.getConnection().prepareCall("select ef2(?)");
        del.setInt(1,id );
        del.execute();
       
        
    }
      
      public static String buscarFolio(String folio) {
	Connection con;
	String msj = null;
	try {
		con = ConexionBD.getConnection();
		String cons = "SELECT film FROM Peliculas WHERE film_id = ?";
		PreparedStatement pst= con.prepareStatement(cons);
		pst.setString(1, folio);
		ResultSet rs= pst.executeQuery();
		if(rs.next()) {
			msj = "Existe Folio";
			
		}else {
			msj= "No Existe Folio";
		}
		
	} catch (SQLException e) {
		// TODO: handle exception
	}
	return msj;
}
}
