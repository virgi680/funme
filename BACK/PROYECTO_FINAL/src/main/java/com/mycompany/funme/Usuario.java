package com.mycompany.funme;

public class Usuario {
    
    
    private String email, password, nombre, apellido, fechaNacimiento, genero;
    
    
    public void setEmail(String n){
        email=n;
    }
    public void setPassword(String n){
        password=n;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public void setApellido(String n){
        apellido=n;
    }
    public void setFechaNacimiento(String n){
        fechaNacimiento=n;
    }
    public void setGenero(String n){
        genero=n;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }
}
