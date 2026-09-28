import Clases.Vendedor;
import Implementaciones.ComisionEstandar;
import Implementaciones.ComisionPersonalizada;

public class Main {
    public static void main(String[] args) {
        // Asignar ComisionPersonalizada
        Vendedor vendedor = new Vendedor("Alessandro", 1000.0, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}