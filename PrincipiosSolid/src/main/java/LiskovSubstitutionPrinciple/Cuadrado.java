package LiskovSubstitutionPrinciple;

import LiskovSubstitutionPrinciple.FormaGeometrica;

public class Cuadrado extends FormaGeometrica {
    public Cuadrado(double lado) {
        super(lado, lado);
    }
}
