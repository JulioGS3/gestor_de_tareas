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
        
    System.out.println("elixe unha opcion");
    System.out.println("a) " + "crear unha tarea");
    System.out.println("b) " + "listar tareas ");
    System.out.println("c) " + "borrar tarea");
    System.out.println("d) " + "agregar comentario");
    System.out.println("f) " + "sair");

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
               System.out.println(listaTareas.get(i).getId() + " " + listaTareas.get(i).getNome() + " " + listaTareas.get(i).getDescripcion() + " " + listaTareas.get(i).getComentario());
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

        case "e":

            System.out.println("adios");

            break;

        }


    }while(!opcion.equals("e")); 
}
}


 