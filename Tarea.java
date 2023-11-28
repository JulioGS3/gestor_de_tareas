package Tareas;

import java.util.ArrayList;

public class Tarea {

    public int id;
    public String nome_Tarea;
    public String descripcion;
    public String comentarios;
    public String prioridad;

    public Tarea(){

    }

    public Tarea (int identificador, String nombre, String nova_descripcion, String coment, String prio){

        id = identificador;
        nome_Tarea = nombre;
        descripcion = nova_descripcion;
        comentarios = coment;
        prioridad = prio;

    }

    public String getComentario(){

        return comentarios;

    }

    public void setComentarios(String coment){

        comentarios = coment;
        
    }

    public void borraComentarios(String coment){

        comentarios = "";

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

    public void setId(int identificador){

        id = identificador;

    }

    public void setNome(String nombre){

        nome_Tarea = nombre;

    }

    public void setDescripcion(String nova_descripcion){

        descripcion = nova_descripcion;

    }

    public String getPrioridad(){

        return prioridad;

    }

    public void setPrioridad (String prio){

        prioridad = prio;

    }

    
}