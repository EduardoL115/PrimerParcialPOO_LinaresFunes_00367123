import Articulo.Articulo;
public class Laptop extends Articulo{
    //atributos
    private String marca;
    private double tamanio;

    //constructores


    public Laptop() {
    }

    public Laptop(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public Laptop(String nombre, String modelo, String descripcion, double precio, String marca, double tamanio) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public void ObtenerPrecio() {

    }
}
