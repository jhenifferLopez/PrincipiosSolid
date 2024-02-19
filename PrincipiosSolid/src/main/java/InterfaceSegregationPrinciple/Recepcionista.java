package InterfaceSegregationPrinciple;

public class Recepcionista implements TrabajadorConDescanso {
    @Override
    public void trabajar() {
        System.out.println("El recepcionista está atendiendo...");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("El recepcionista está tomando un descanso...");
    }
}