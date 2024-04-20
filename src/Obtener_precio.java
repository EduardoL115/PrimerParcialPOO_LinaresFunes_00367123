import java.util.Scanner;

public interface Obtener_precio{
    double precio = 0;
    Scanner sc = new Scanner(System.in);

    public default <precio> double ObtenerPrecio(double precio){
        System.out.println("Ingrese el precio del producto");
        precio = sc.nextDouble();
        return 0;
    }
}
