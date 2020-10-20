
package inventario;

import java.util.ArrayList;
import java.util.Scanner;


public class Inventario {

static ArrayList<Producto> productos =new ArrayList(); 
static Scanner sc = new Scanner(System.in);
   
public static void main(String[] args) {
     
    leerProducto();
    mostrarProducto();
    }

    private static void leerProducto() {
        
        int contador;
        String nombreP,marcaP;
        int cantidadP;
        double precioP;
        
        Producto aux;
        
        do{
            System.out.println("Ingrese cantidad de productos: ");
            contador = sc.nextInt();
        }while(contador <= 0);
        
        sc.nextLine();
        
        for(int i=0; i<contador; i++){
            
            sc.nextLine();
            
            System.out.println("Ingresar Producto"+i);
            System.out.print("Ingrese Nombre: ");
            nombreP=sc.nextLine();
            System.out.print("Ingrese Marca ");
            marcaP=sc.nextLine();
            System.out.print("Ingrese Stock ");
            cantidadP=sc.nextInt();
            System.out.print("Ingrese Precio por Unidad: ");
            precioP=sc.nextDouble();
            
            aux=new Producto();
            
            aux.setID(i);
            aux.setNombre(nombreP);
            aux.setMarco(marcaP);
            aux.setCantidad(cantidadP);
            aux.setPrecio(precioP);
            
            productos.add(aux);
        }
    }

    private static void mostrarProducto() {
        
        for(int i=0; i<productos.size(); i++){
            System.out.println(productos.get(i));
        }
    }
    
}
