/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import conexion.ConexionBD;
import java.sql.*;
import java.util.Date;
import modelo.Film;

/**
 *
 * @author Miguel
 */
 public class FilmDAO extends Film{
    
     
   
public boolean modificarfilm(Film a) {
                    String sql = "UPDATE film SET title='"+a.getTitulo()+"',"
                                         +"description='"+a.getDesc()
                                         +"',release_year='"+a.getFehca()
                                         +"',language_name='"+a.getLengName()
                                         +"', original_language_name='"+a.getLengOri()
                                         +"',length='"+a.getDuracion()
                                         +"',cost= '"+a.getCosto()
                                         +"', rating='"+a.getRating()
                                         +"', category_name='"+a.getCat()
                                         +"' WHERE film_id ='"+a.getId()+"'";
                    boolean res = new ConexionBD().ejecutarInstruccion1(sql);

                    return res; 

}         
 
      public boolean eliminarFilm(String a) {
    	//DELETE FROM Alumnos WHERE Num_Control = '3';
    			String sql = "DELETE FROM film WHERE film_id = '"+a+"'";
    			return new ConexionBD().ejecutarInstruccion(sql);
		
	}
      
      public static void EliminarPelis(int id)throws SQLException{
   
        CallableStatement del =conexion.ConexionBD.getConnection().prepareCall("select ef(?)");
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
