package gestor_tareas;

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
    String comentario="";

   
    do {
        

        System.out.println("Elixe unha opcion");
        System.out.println("a) " + "Crear unha tarea");
        System.out.println("b) " + "Listar tareas ");
        System.out.println("c) " + "Borrar tarea");
        System.out.println("d) " + "Filtrar por prioridad");
        System.out.println("e) " + "Cambiar la prioridad");
        System.out.println("f  " + "agregar comentarios");
        System.out.println("g) " + "Sair");


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

                System.out.println("ID: " + listaTareas.get(i).getId() + ", prioridade: "+ listaTareas.get(i).getPrioridad() + ", nome: " + listaTareas.get(i).getNome() + ", descripción: " + listaTareas.get(i).getDescripcion() + " " + listaTareas.get(i).getComentario());

                }


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

            String opcion2 = "";
            System.out.println("elige entre 1 - agregar comentario. 2 -modificalo ou 3 -borralo");

                opcion2 = entrada.nextLine();

            switch (opcion2){

                case "1":
                        
                    Scanner ent = new Scanner(System.in);
                    int eligeIndice = 0;
                    System.out.println("elige en que tarea queres facer un comentario");
                    eligeIndice = entrada.nextInt();
                    System.out.println("inserta comentario");
                    listaTareas.get(eligeIndice).setComentarios(ent.nextLine());
                break;

                case "2":
                    Scanner ent1 = new Scanner(System.in);
                    System.out.println("elige en que tarea queres modificar un comentario");
                    eligeIndice = entrada.nextInt();
                    System.out.println("modifica comentario");
                    listaTareas.get(eligeIndice).setComentarios(ent1.nextLine());
                  break;

                case "3":
                    
                    System.out.println("elige en que tarea queres borrar o comentario");
                    eligeIndice = entrada.nextInt();
                    listaTareas.get(eligeIndice).setComentarios("");
                    break;
            }
            break;

            case "g":

                System.out.println("Adios");

                break;
        
        }
            

    }while(!opcion.equals("g")); 


}
}


 