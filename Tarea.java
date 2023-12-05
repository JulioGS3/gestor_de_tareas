package Tareas;

import java.sql.Date;
import java.util.ArrayList;

public class Tarea {

    public int id;
    public String nome_Tarea;
    public String descripcion;
    public String comentarios;
    public String fecha_limite;
    public Tarea(){

    }

    public Tarea (int identificador, String nombre, String nova_descripcion){
        id = identificador;
        nome_Tarea = nombre;
        descripcion = nova_descripcion;
    }
    
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome_Tarea;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public String getFechaLimite(){
        return fecha_limite;
    }

    public void setId(int identificador){

        id = identificador;
    }
    public void setNome(String nombre){
        nome_Tarea = nombre;
    }
    public void setDescripcion(String nova_descripcion){
        descripcion = nova_descripcion;
    }
    public void setFechaLimite(String fecha){
        fecha_limite = fecha;
    }

    


    

    
}