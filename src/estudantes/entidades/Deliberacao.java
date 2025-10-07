package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Deliberacao extends DocumentoAdministrativo {

    private String texto;

    public Deliberacao(String criador, CodigoCurso codigoCurso, int paginas, String texto) {
        super(criador, codigoCurso, paginas);
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Deliberacao d = (Deliberacao)o;
            return this.texto.equals(d.texto);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        return result;
    }
}
