package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Objects;

/**
 * Classe que representa um documento genérico.
 * <br><br>
 * <strong>Seu trabalho começa aqui...</strong>
 *
 * @author coloque os nomes dos autores aqui
 */
public abstract class Documento {

    private String criador;
    private CodigoCurso codigoCurso;
    private int paginas;

    public Documento(String criador, CodigoCurso codigoCurso, int paginas) {
        this.criador = criador;
        this.codigoCurso = codigoCurso;
        this.paginas = paginas;
    }

    public String getCriador() {
        return criador;
    }

    public CodigoCurso getCodigoCurso() {
        return codigoCurso;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null)
            return false;
        if (this.getClass() != o.getClass())
            return false;
        Documento d = (Documento) o;
        return this.criador.equals(d.criador) && this.codigoCurso == d.codigoCurso && this.paginas == d.paginas;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (criador != null ? criador.hashCode() : 0);
        result = 31 * result + (codigoCurso != null ? codigoCurso.hashCode() : 0);
        result = 31 * result + paginas;
        return result;
    }
}
