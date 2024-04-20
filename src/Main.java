import Articulo.Articulo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList <Articulo> Articulos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op = 0;

        System.out.print("Bienvenido a la gestion de inventario");
        System.out.println("");
        System.out.println("1. Agregar articulo");
        System.out.println("2. Moificar articulo");
        System.out.println("3. mostrar articulos");
        System.out.println("4. Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion");
        op = sc.nextInt();

        do {
            switch (op){

                case 1:
                    String nombre;
                    String modelo;
                    String descripcion;
                    double precio;

                    System.out.println("Ingrese el nombre del articulo");
                    
                    System.out.println("Ingrese el model del articulo");

                    System.out.println("Ingrese la descripcion");

                    System.out.println("Ingrese el precio");

                    System.out.println("Ingrese el tipo de articulo q desee");
                    System.out.println("1. laptop");
                    System.out.println("2. telefono");
                    sc.nextInt(op);
                    do {
                        switch (op){
                            case 1:

                            case 2:

                        }

                    }while(op != 3);


                    break;
                case 2:

                    break;
                case 3:
                    for (int i = 0; i < Articulos.size(); i++) {
                        System.out.println("Nombre del articulo");

                    }
                    break;


            }
        }while (op != 4);
        System.out.println("Bye bye");
        }
    }


