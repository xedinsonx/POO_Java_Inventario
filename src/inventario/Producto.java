
package inventario;


public class Producto {
    
    int ID,cantidad;
    double precio;
    String nombre,marco;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID: " + ID + ", cantidad: " + cantidad + ", precio: " + precio + ", nombre: " + nombre + ", marco: " + marco + '}';
    }
    
    
    
}
