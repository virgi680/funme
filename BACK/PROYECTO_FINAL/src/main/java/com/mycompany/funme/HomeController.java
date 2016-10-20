package com.mycompany.funme;

import java.sql.DriverManager;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.DriverManager;
import java.sql.*;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	int check=0;

	@RequestMapping(value="/crearEvento")
	public @ResponseBody void formularioPeticiones(@RequestParam(value="dia",required=false) String dia,@RequestParam(value="hora",required=false) String hora,@RequestParam(value="lugar",required=false) String lugar,@RequestParam(value="nombre",required=false) String nombre) {
        System.out.println(":   "+dia+" "+hora+" "+lugar+" "+nombre);
        
    	MySQL my= new MySQL();
        check = my.escribirDatosMySQL_EVENTOS(dia,hora,lugar,nombre);
	}
	@RequestMapping(value="/guardarRegistro")
    public @ResponseBody void guardarRegistro(@RequestParam(value="email",required=false) String email, @RequestParam(value="password",required=false) String password, @RequestParam(value="nombre",required=false) String nombre, @RequestParam(value="apellidos",required=false) String apellidos, @RequestParam(value="fechaNacimiento",required=false) String fechaNacimiento, @RequestParam(value="genero",required=false) String genero) {
		System.out.println(email+"  "+password+"  "+nombre+"  "+apellidos+"  "+fechaNacimiento+"  "+genero);
	
    	MySQL my= new MySQL();
        check = my.escribirDatosMySQL_REGISTRO(email,password,nombre,apellidos,fechaNacimiento,genero);
        
        /*Usuario u = new Usuario();
        u = my.leerDatosUsuario(email);
        System.out.println(u.getNombre()+u.getApellido()+u.getEmail()+u.getFechaNacimiento());   */
	}
}
