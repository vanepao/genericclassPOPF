package po.pductos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Artículos art1 = new Artículos("23A015", "Milk", "$10", "23/03/19");
        Artículos art2 = new Artículos("24A014", "Jam", "$15", "24/02/19");
        Artículos art3 = new Artículos("25A013", "Yogurt", "$11", "23/02/19");
        Artículos art4 = new Artículos("26A011", "Cream", "$15", "24/02/19");
        Artículos art5 = new Artículos("27A010", "Ice-cream", "$19", "30/04/19");

        Elemento<Artículos> first = new Elemento<>(art1);
        Elemento<Artículos> second = new Elemento<>(art2);
        Elemento<Artículos> third = new Elemento<>(art3);
        Elemento<Artículos> fourth = new Elemento<>(art4);
        Elemento<Artículos> fifth = new Elemento<>(art5);

        List<Artículos> ListaA = new List<>(first);
        ListaA.insertar(second);
        ListaA.insertar(third);
        ListaA.insertar(fourth);
        ListaA.insertar(fifth);

//Elimina el Artículo 1, en este caso "Milk"
        System.out.println(ListaA.eliminar());
    System.out.println(art1.getDescription());

//Método para buscar por clave, se empleo un array con los números de clave
        String[] keys = {"23A015", "24A014", "25A013", "26A011", "27A010"};
        String nombre = "";
        boolean found = false;
        System.out.println("Looking for a product?" + "\n Type it here: ");
        Scanner teclado = new Scanner(System.in);
        nombre = teclado.nextLine();

        //  while (found = true) {
        for (String element : keys) {
            if (element.equals(nombre)) {
                found = true;
                System.out.println("The product your looking for is: " + nombre);
                System.out.println("Looking for other one? \n Type here: ");
                nombre=teclado.nextLine();
            } else System.out.println("The product " + nombre + " isn't in our database");
            System.out.println("TRY AGAIN");
            nombre=teclado.nextLine();
        }

    }
}


