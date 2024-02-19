package SingleResponsabilityPrinciple;

import java.util.ArrayList;

public class GestorUsuarios {
    private ArrayList<Usuario> listaUsuarios;
    public GestorUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    public void agregarUsuario(Usuario usuario) {
            listaUsuarios.add(usuario);
    }
    public void eliminarUsuario(Usuario usuario) {
        listaUsuarios.remove(usuario);
    }
}
