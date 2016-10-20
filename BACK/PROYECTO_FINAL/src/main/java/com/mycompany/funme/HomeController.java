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

	//Pantalla de inicio
	/*@RequestMapping(value = "/")
	public String home() {	
		//return "home";
		//return "vista_buscarEvento";
		return "vista_crearEvento";
		//return "crearEvento";
        ///System.out.println("primera pagina");
        //return "redirect:/./crearEvento.html";
	}*/
	

	
	@RequestMapping(value="/crearEvento")
	public @ResponseBody void formularioPeticiones(@RequestParam(value="dia",required=false) String dia,@RequestParam(value="hora",required=false) String hora,@RequestParam(value="lugar",required=false) String lugar,@RequestParam(value="nombre",required=false) String nombre) {
        System.out.println(":   "+dia+" "+hora+" "+lugar+" "+nombre);
	}

	
	/*@RequestMapping(value="/buscarEvento", method = RequestMethod.GET)
	public @ResponseBody String formularioPeticiones(Model modelo,@RequestParam(value="localizacion",required=false) String localizacion, @RequestParam(value="interes",required=true) String interes) {
        System.out.println("hola");
		return "redirect:/alberto";
	}

	
	
	
	@RequestMapping(value = "/")
	public @ResponseBody String formularioPeticiones(/*HttpServletRequest request, Model model) {
	//	return "vista_registro";
	//}
	
	

	
	//@RequestMapping(value="/crearEvento")
	//public @ResponseBody String formularioPeticiones(Model modelo,@RequestParam(value="dia",required=false) String dia,@RequestParam(value="hora",required=false) String hora,@RequestParam(value="lugar",required=false) String lugar,@RequestParam(value="nombre",required=false) String nombre) {
    //    System.out.println("adios");

	//	MySQL my= new MySQL();
    //    my.escribirDatosMySQL_EVENTOS(dia,hora,lugar,nombre);
        
	//	return "Evento creado el dia: "+dia+" hora: "+hora+" lugar: "+lugar+" nombre evento: "+nombre;        
	//}
	
	//@RequestMapping(value="/crearRegistro")
	//public @ResponseBody String formularioPeticiones(Model modelo,@RequestParam(value="email",required=false) String email,@RequestParam(value="password",required=false) String password,@RequestParam(value="rpassword",required=false) String rpassword,@RequestParam(value="nombre",required=false) String nombre,@RequestParam(value="apellidos",required=false) String apellidos,@RequestParam(value="fecha",required=false) String fecha,@RequestParam(value="genero",required=false) String genero) {

	//	return "Registro creado email: "+email+" nombre: "+nombre+" apellido: "+apellidos;        
	//}*
	
/*	@RequestMapping(value="/crearEvento")
	public @ResponseBody String formularioPeticiones(@RequestBody String jsonEntrada) {
        System.out.println("adios");

//		MySQL my= new MySQL();
//        my.escribirDatosMySQL_EVENTOS(dia,hora,lugar,nombre);
        
		return null;        
	}*/
}
