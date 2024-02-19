package OpenClosedPrinciple;

public class CalculadoraRegular implements CalcularBonificacion {
    @Override
    public double calcularBonificacion(double salario) {
        return salario * 0.1; // Bonificación del 10% para empleados regulares
    }
}
