package OpenClosedPrinciple;

public class CalculadoraVentas implements CalcularBonificacion {
    @Override
    public double calcularBonificacion(double salario) {
        return salario * 0.15; // Bonificación del 15% para empleados de ventas
    }
}
