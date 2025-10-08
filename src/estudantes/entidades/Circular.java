package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public class Circular extends Deliberacao {

    private String[] destinarios;

    public Circular(String criador, CodigoCurso codigoCurso, int paginas, String texto, String[] destinarios) {
        super(criador, codigoCurso, paginas, texto);
        this.destinarios = destinarios;
    }

    public String[] getDestinatarios() {
        return destinarios;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Circular c = (Circular) o;
            return Arrays.equals(this.destinarios, c.destinarios);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(destinarios);
        return result;
    }
}
