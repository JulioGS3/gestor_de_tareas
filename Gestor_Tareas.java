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
        
        System.out.println("Elixe unha opcion");
        System.out.println("a) " + "Crear unha tarea");
        System.out.println("b) " + "Listar tareas ");
        System.out.println("c) " + "Borrar tarea");
        System.out.println("d) " + "Filtrar por prioridad");
        System.out.println("e) " + "Cambiar la prioridad");
        System.out.println("f) " + "Sair");

        opcion = entrada.nextLine();
        
        switch (opcion) {

            case "a":

                System.out.println("Como queres que se chame a tarea?");
                nome = entrada.nextLine();

                System.out.println("En que consiste a tarea");
                descripcion = entrada.nextLine();
                Tarea tarea = new Tarea();

                tarea.setId(indice);
                tarea.setNome(nome);
                tarea.setDescripcion(descripcion);

                System.out.println("Establece a prioridade");
                System.out.println("Elixe entre (A) alta, (M) media, (B) baixa");
                tarea.setPrioridad(entrada.nextLine());

                listaTareas.add(indice, tarea);
                indice = indice+1;
            
                break;
        


            case "b":

                for (int i = 0; i < listaTareas.size(); i++) {

                System.out.println("ID: " + listaTareas.get(i).getId() + ", prioridade: "+ listaTareas.get(i).getPrioridad() + ", nome: " + listaTareas.get(i).getNome() + ", descripción: " + listaTareas.get(i).getDescripcion());

                }
                    
                break;



            case "c":
                
                System.out.println("Elixe polo índice cal queres eliminar");

                    int indice1 = entrada.nextInt();

                for (int i = 0; i < listaTareas.size(); i++){

                    if(indice1 == i){

                        listaTareas.remove(i);

                    }
                }

                break;



            case "d":

                System.out.println("Que prioridade queres visualizar? [(A)lta, (M)edia, (B)aixa]");
                String res = entrada.nextLine();
                System.out.println("Tareas de prioridade " + res);

                for (int i = 0; i < listaTareas.size(); i++){

                    if(listaTareas.get(i).getPrioridad().equals(res)){

                        System.out.println("ID: " + listaTareas.get(i).getId() + ", nome: " + listaTareas.get(i).getNome() + ", descripción: " + listaTareas.get(i).getDescripcion());

                    }

                }

                break;



            case "e":

                System.out.println("Introduce o ID da tarea da que queres cambiar a prioridade");
                int ord = entrada.nextInt();


                System.out.println("Elixe a nova prioridade [(A)lta, (M)edia, (B)aixa]");
                Scanner scan = new Scanner(System.in);
                listaTareas.get(ord).setPrioridad(scan.nextLine());

                break;



            case "f":

                System.out.println("Adios");

                break;

        }
            


    }while(!opcion.equals("f")); 

}
}


 