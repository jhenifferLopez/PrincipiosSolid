package DependencyInversionPrinciple;

public class ServicioMensajeTexto implements ServicioNotificacion {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje de texto: " + mensaje);
    }
}
