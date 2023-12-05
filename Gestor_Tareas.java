package Tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestor_Tareas {

public static void main(String[] args) {
    
    String opcion = "";
    Scanner entrada = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);
    ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
    String nome = "";
    String descripcion = "";
    int indice = 0;
    String fecha_filtro;
    String opcion_fecha;
    
   
    do {
        
    System.out.println("elixe unha opcion");
    System.out.println("a) " + "crear unha tarea");
    System.out.println("b) " + "listar tareas ");
    System.out.println("c) " + "borrar tarea");
    System.out.println("d) " + "asignar fecha limite");
    System.out.println("e) " + "sair");

    opcion = entrada.nextLine();
    
    switch (opcion) {

        case "a":

            System.out.println("como queres que se chame a tarea?");
            nome = entrada.nextLine();

            System.out.println("en que consiste a tarea");
            descripcion = entrada.nextLine();
            

            System.out.println("Introduce a data limite");
            fecha_filtro = entrada.nextLine();
            Tarea tarea = new Tarea();


            tarea.setId(indice);
            tarea.setNome(nome);
            tarea.setDescripcion(descripcion);
            tarea.setFechaLimite(fecha_filtro);

            listaTareas.add(indice, tarea);
            indice = indice+1;
          
            break;
    
        case "b":
            System.out.println("Quieres filtar por fechas o en general");
            opcion_fecha = entrada.nextLine();
            if (opcion_fecha.equals("fecha")){
                System.out.println("Introduce una fecha");
                    fecha_filtro = entrada.nextLine();
                for (int i = 0; i < listaTareas.size(); i++) {
                    if (fecha_filtro.equals(listaTareas.get(i).getFechaLimite())){
                    System.out.println(listaTareas.get(i).getId() + " " + listaTareas.get(i).getNome() + " " + listaTareas.get(i).getDescripcion() + " " + listaTareas.get(i).getFechaLimite());
                    }
                    }
                }
            else {
                for (int i = 0; i < listaTareas.size(); i++) {
                    System.out.println(listaTareas.get(i).getId() + " " + listaTareas.get(i).getNome() + " " + listaTareas.get(i).getDescripcion() + " " + listaTareas.get(i).getFechaLimite());
                    }
            }
                
            break;

        case "c":
            
            System.out.println("elixe polo indice cal queres eliminar");

                int indice1 = entrada.nextInt();

            for (int i = 0; i < listaTareas.size(); i++){

                if(indice1 == i){

                    listaTareas.remove(i);

                }
            }
                break;
        case "d":
            System.out.println("Elige el indice de la tarea en la que quieres poner fecha");
            indice = entrada.nextInt();
            System.out.println("Introduce la fecha");
            fecha_filtro = sc.nextLine();
            listaTareas.get(indice).setFechaLimite(fecha_filtro);
            break;
        case "e":

            System.out.println("adios");

            break;

        }


    }while(!opcion.equals("e")); 
}
}


 