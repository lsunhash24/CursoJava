package cltalento.desafiolatam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysDinamicos {

    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList<String>();
        //List<String> alumnosList = new ArrayList<String>();

        System.out.println(alumnos.size());//the number of elements in this list
        
        // add(); agrega un elemento al final de la lista, 
        alumnos.add("Alexandra");//0
        alumnos.add("Andres");//1
        alumnos.add("Desiree");//2
        alumnos.add("Israel");//3
        
        System.out.println(alumnos.size());
        System.out.println(alumnos);
        
        //add(indice,elemento); agrega en la posicion especifica, se deplazan a la derecha
        alumnos.add(0, "German");
        System.out.println(alumnos);
        System.out.println(alumnos.get(1));
        
        //set Reemplezar un elemento del arreglo
        
        //alumnos.set(4, "Alexis");//reemplaza
        String alumnoModificado = alumnos.set(4, "Alexis");//reemplazar y devolver el dato a eliminar
        System.out.println(alumnoModificado);
        System.out.println(alumnos);
        //ordenar asc
        Collections.sort(alumnos);
        //lista ordenada
        System.out.println(alumnos);
        //orden inverso
        Collections.reverse(alumnos);
        //lista ordenada descendentemente
        System.out.println(alumnos);
        
        ArrayList<String> alumnos2 = new ArrayList<String>();
        alumnos2.add("Alexandra");
        alumnos2.add("Andres");
        alumnos.removeAll(alumnos2);
        
        System.out.println(alumnos);
        
        
    }

}
