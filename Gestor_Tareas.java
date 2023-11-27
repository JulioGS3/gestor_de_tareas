package Tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestor_Tareas {

public static void main(String[] args) {
    
    String opcion = "";
    Scanner entrada = new Scanner(System.in);
    ArrayList<Tarea> listaTareas = new ArrayList<Tarea>();
    String nome = "";
    String descripcion = "";
    int indice = 0;
   
    do {
        
    System.out.println("elixe unha opcion");
    System.out.println("a) " + "crear unha tarea");
    System.out.println("b) " + "listar tareas ");
    System.out.println("c) " + "borrar tarea");
    System.out.println("d) " + "sair");

    opcion = entrada.nextLine();
    
    switch (opcion) {

        case "a":

            System.out.println("como queres que se chame a tarea?");
            nome = entrada.nextLine();

            System.out.println("en que consiste a tarea");
            descripcion = entrada.nextLine();
            Tarea tarea = new Tarea();

            tarea.setId(indice);
            tarea.setNome(nome);
            tarea.setDescripcion(descripcion);

            listaTareas.add(indice, tarea);
            indice = indice+1;
          
            break;
    
        case "b":

            for (int i = 0; i < listaTareas.size(); i++) {
               System.out.println(listaTareas.get(i).getId() + " " + listaTareas.get(i).getNome() + " " + listaTareas.get(i).getDescripcion());
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
        case "d":

            System.out.println("adios");

            break;

        }


    }while(!opcion.equals("d")); 
}
}


 