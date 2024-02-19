package DependencyInversionPrinciple;

public class ServicioNotificacionCliente {
    private ServicioNotificacion servicioNotificacion;

    // Constructor que recibe una implementación concreta del servicio de notificación
    public ServicioNotificacionCliente(ServicioNotificacion servicioNotificacion) {
        this.servicioNotificacion = servicioNotificacion;
    }

    // Método para enviar un mensaje utilizando el servicio de notificación
    public void enviarMensaje(String mensaje) {
        servicioNotificacion.enviarMensaje(mensaje);
    }

}
