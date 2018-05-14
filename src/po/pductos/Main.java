package po.pductos;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Artículos art1 = new Artículos("23A015", "Milk", 10, "23/03/19");
        Artículos art2 = new Artículos("24A014", "Jam", 15, "24/02/19");
        Artículos art3 = new Artículos("25A013", "Yogurt", 11, "23/02/19");
        Artículos art4 = new Artículos("26A011", "Cream", 15, "24/02/19");
        Artículos art5 = new Artículos("27A010", "Ice-cream", 19, "30/04/19");

        Artículos c1 = new Artículos(10);
        Artículos c2= new Artículos(20);
        Artículos c3= new Artículos(50);
        Artículos c4= new Artículos(15);
        Artículos c5= new Artículos(60);




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


    Listatickets<Artículos> ListaTA=new Listatickets<>();



        //Clientes que quieren un ticket ticket=cliente
        ;



//Elimina el Artículo 1, en este caso "Milk"
        System.out.println("Just 4 elements");
        System.out.println(ListaA.eliminar());


//Buscar por clave de producto, hay 10 intentos.



        //Ticket<Articulos> listaT= new Ticket<>();
        //				Elemento<Articulos> ticket1 = new Elemento<>(a2);
        //				listaT.insertarT(ticket1);
        //				System.out.print("Importe total de: $ " + total + " Gracias por su compra \n");
        //				System.out.print("LISTA ACTUAL: ");
        //				System.out.print(listaT.recorrerT());


        for (int num = 0; num <= 9; num++) {

            System.out.println("\n Looking for a product?" + "\n Type it here: ");
            Scanner teclado = new Scanner(System.in);
            String key = teclado.nextLine();
            int variable, var,TOTAL;

            if (ListaA.recorrer().contains(key)) {
                if (key.equals(art1.getKeyproduct())) {
                    System.out.print("The product you are lookig for is: " + art1.toString() + " \n");
                    num++;
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art1.getPrice();
                    if(variable<c1.getCantidad()){
                        int total1 = var * variable;
                        System.out.print("Monto $" + total1); }
                        else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }





                } else if (key.equals((art2.getKeyproduct()))) {
                    System.out.print("The product you are lookig for is: " + art2.toString() + " \n");
                    num++; variable= art2.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art2.getPrice();
                    if(variable<c2.getCantidad()){
                        int total2 = var * variable;
                        System.out.print("Monto $" + total2); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }


                } else if (key.equals((art3.getKeyproduct()))) {
                    System.out.print("The product you are lookig for is: " + art3.toString() + " \n");
                    num++; variable= art3.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art3.getPrice();
                    if(variable<c3.getCantidad()){
                        int total3 = var * variable;
                        System.out.print("Monto $" + total3); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }

                } else if (key.equals((art4.getKeyproduct()))) {
                    System.out.print("The product you are lookig for is: " + art4.toString() + " \n");
                    num++; variable=art4.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art4.getPrice();
                    if(variable<c4.getCantidad()){
                        int total4 = var * variable;
                        System.out.print("Monto $" + total4); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }
                } else if ((key.equals((art5.getKeyproduct())))) {
                    System.out.print("The product you are lookig for is: " + art5.toString() + " \n");
                    num++; variable=art5.getPrice();
                    System.out.println("Number of elements required ? ");
                    variable=teclado.nextInt();
                    var=art5.getPrice();
                    if(variable<c5.getCantidad()){
                        int total5 = var * variable;
                        System.out.print("Monto $" + total5); }
                    else {
                        System.out.println("NO HAY DISPONIBILIDAD");                }


                } }else
                    System.out.print("NOT FOUNDED \n");
            }



//Método para buscar por clave, se empleo un array con los números de clave
// String[] keys = {"23A015", "24A014", "25A013", "26A011", "27A010"};
// String nombre = "";
// boolean found = false;
// System.out.println("Looking for a product?" + "\n Type it here: ");
// nombre = teclado.nextLine();

            //  while (found = true) {
            // for (String element : keys) {
            // if (element.equals(nombre)) {
            // found = true;
            // System.out.println("The product your looking for is: " + nombre);
            // System.out.println("Looking for other one? \n Type here: ");
            // nombre=teclado.nextLine();
            // } else System.out.println("The product " + nombre + " isn't in our database");
            // System.out.println("TRY AGAIN");
            // nombre=teclado.nextLine();
            // }
        }
    }





