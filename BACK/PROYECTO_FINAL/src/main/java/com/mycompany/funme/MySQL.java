package com.mycompany.funme;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class MySQL{
	
   public MySQL(){}

   public int escribirDatosMySQL_EVENTOS(String dia,String hora, String lugar, String nombre_evento){
   
      Connection conexion=null;
   
      try{
         Class.forName("com.mysql.jdbc.Driver");
         conexion =  DriverManager.getConnection("jdbc:mysql://localhost/funme","root","1234");
         
         java.sql.Statement s = conexion.createStatement(); 
      
         int rs_update = s.executeUpdate("INSERT INTO eventos (lugar,hora,dia,nombre_evento) VALUES ('"+lugar+"','"+hora+"','"+dia+"','"+nombre_evento+"')");
         conexion.close();
	    }
		catch(ClassNotFoundException e2){
			  System.out.println("1");
			  return -1;
		}       
	    catch(Exception e){
	    	 System.out.println("2");
	    	 return -2;
	}
      
      return 0;
   }
   public int escribirDatosMySQL_REGISTRO(String email, String password, String nombre, String apellido,String fechaNacimiento, String genero){
	   
       Connection conexion=null;

       try{
           Class.forName("com.mysql.jdbc.Driver");
           conexion =  DriverManager.getConnection("jdbc:mysql://localhost/funme","root","1234");
           
           java.sql.Statement s = conexion.createStatement(); 
        
           int rs_update = s.executeUpdate("INSERT INTO usuario (email,nombre,apellido,contraseña,f_nacimiento,sexo) VALUES ('"+email+"','"+nombre+"','"+apellido+"','"+password+"','"+fechaNacimiento+"','"+genero+"')");
           conexion.close();
      }
      catch(ClassNotFoundException e2){
            System.out.println("1");
            return -1;
      }       
      catch(Exception e){
           System.out.println("2");
           return -2;
      }
       return 0;
  }
   
   
   public Usuario leerDatosUsuario(String email){  
       
       //Vector vectorDatos = new Vector();
       Connection conexion = null;
       //boolean primeraVez = true;
       Usuario user = new Usuario ();
       
       try{
          Class.forName("com.mysql.jdbc.Driver"); 
          conexion = DriverManager.getConnection("jdbc:mysql://localhost/funme","root","1234");
                      
          java.sql.Statement s = conexion.createStatement();  
          
          //obtenemos la información del usuario de la base de datos.
          ResultSet rs = s.executeQuery ("select * from usuario where email like "+email);
          System.out.println("llega?");
          
          //Guardamos los campos en los atributos de la clase usuario.
         
           user.setEmail(rs.getString(2));
           user.setPassword(rs.getString(3));
           user.setNombre(rs.getString(4));
           /*user.setApellido(rs.getString(5));
           user.setFechaNacimiento(rs.getString(6));
           user.setGenero(rs.getString(7));*/
                     
           
           conexion.close();
       }
       
       catch(Exception e){
              System.out.println("ERROR");
       }
     return user;
       
    }
   
}
