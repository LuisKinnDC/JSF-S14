package bean.model;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 *
 * @autor USUARIO
 */
@Named
@RequestScoped
public class Candidato {

    private String nombre = "";

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
