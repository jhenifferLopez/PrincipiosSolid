package LiskovSubstitutionPrinciple;

public class FormaGeometrica {
    protected double ancho;
    protected double altura;

    public FormaGeometrica(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    // Método para obtener el área de la forma
    public double obtenerArea() {
        return ancho * altura;
    }
}
