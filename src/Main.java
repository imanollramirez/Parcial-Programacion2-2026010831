import Clases.Vendedor;
import Implementaciones.ComisionEstandar;

public class Main {
    public static void main(String[] args) {
        // En main usa por defecto ComisionEstandar
        Vendedor vendedor = new Vendedor("Alessandro", 1000.0, new ComisionEstandar());
        vendedor.mostrarDetalle();
    }
}