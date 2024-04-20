package Articulo;
public abstract class Articulo{
    //atributos
    private String nombre;
    private String modelo;
    private String descripcion;
    private double precio;

    //constructores


    public Articulo() {
    }

    public Articulo(String nombre, String modelo, String descripcion, double precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //gettersa y setters
    public String getNombre(String next) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract void ObtenerPrecio();

    //metodos
}
