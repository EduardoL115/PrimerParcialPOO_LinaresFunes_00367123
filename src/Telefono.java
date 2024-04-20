import Articulo.Articulo;
public class Telefono extends Articulo{
    //atributos
    private String marca;

    private double tamanio;

    //constructores


    public Telefono() {
    }

    public Telefono(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public Telefono(String nombre, String modelo, String descripcion, double precio, String marca, double tamanio) {
        super(nombre, modelo, descripcion, precio);
        this.marca = marca;
        this.tamanio = tamanio;
    }


    //getters y setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }


    //metodos
    @Override
    public void ObtenerPrecio() {

    }
}
