package DependencyInversionPrinciple;

public class ServicioEmail implements ServicioNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando correo electrónico: " + mensaje);
    }
}
