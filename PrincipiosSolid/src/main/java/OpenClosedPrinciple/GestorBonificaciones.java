package OpenClosedPrinciple;

import OpenClosedPrinciple.CalcularBonificacion;

public class GestorBonificaciones {
    public double calcularBonificacionEmpleado(double salario, CalcularBonificacion calculadoraBonificacion) {
        return calculadoraBonificacion.calcularBonificacion(salario);
    }
}
