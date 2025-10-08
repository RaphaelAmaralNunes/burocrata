package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public class Edital extends Norma {

    private String[] responsaveis;

    public Edital(String criador, CodigoCurso codigoCurso, int paginas, int numero, boolean valido, String texto, String[] responsaveis) {
        super(criador, codigoCurso, paginas, numero, valido, texto);
        this.responsaveis = responsaveis;
    }

    public String[] getResponsaveis() {
        return responsaveis;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Edital e = (Edital) o;
            return Arrays.equals(this.responsaveis, e.responsaveis);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + responsaveis.hashCode();
        return result;
    }
}
