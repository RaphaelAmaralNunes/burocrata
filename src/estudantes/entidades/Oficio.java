package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public class Oficio extends Deliberacao {

    private String destinario;

    public Oficio(String criador, CodigoCurso codigoCurso, int paginas, String texto, String destinario) {
        super(criador, codigoCurso, paginas, texto);
        this.destinario = destinario;
    }

    public String getDestinatario() {
        return destinario;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Oficio of = (Oficio) o;
            return this.destinario.equals(of.destinario);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (destinario != null ? destinario.hashCode() : 0);
        return result;
    }
}