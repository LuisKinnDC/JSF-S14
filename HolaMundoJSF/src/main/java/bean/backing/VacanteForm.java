package bean.backing;

import bean.model.Candidato;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

/**
 *
 * @autor Alumnos
 */
@Named
@RequestScoped
public class VacanteForm {

    @Inject
    private Candidato candidato;

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String enviar() {
        if (this.candidato.getNombre().equals("Luis")) {
            return "exito";
        } else {
            return "fallo";
        }
    }
}
