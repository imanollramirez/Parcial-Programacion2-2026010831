package Implementaciones;
import Interfaces.EstrategiaComision;

public class ComisionEstandar implements EstrategiaComision {
    @Override
    public double calcularComision(double montoVenta) {
        // Alessandro (10 letras): 5 + 10 = 15% (0.15)
        int letrasPrimerNombre = 10;
        double porcentaje = (5 + letrasPrimerNombre) / 100.0;
        return montoVenta * porcentaje;
    }
}
