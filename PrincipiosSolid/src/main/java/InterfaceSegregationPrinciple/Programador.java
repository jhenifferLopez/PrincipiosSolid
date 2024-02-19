package InterfaceSegregationPrinciple;

public class Programador implements Trabajador {
    @Override
    public void trabajar() {
        System.out.println("El programador está programando...");
    }
}
