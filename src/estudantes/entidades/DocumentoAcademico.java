package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class DocumentoAcademico extends Documento {

    private long autenticacao;

    public DocumentoAcademico(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao) {
        super(criador, codigoCurso, paginas);
        this.autenticacao = autenticacao;
    }

    public long getAutenticacao() {
        return autenticacao;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            DocumentoAcademico da = (DocumentoAcademico)o;
            return this.autenticacao == da.autenticacao;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int)(autenticacao ^ (autenticacao >>> 32));
        return result;
    }
}