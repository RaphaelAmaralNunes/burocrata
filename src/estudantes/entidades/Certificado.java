package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Certificado extends Registro {

    private String descricao;

    public Certificado(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao, String estudante, long matricula, String descricao) {
        super(criador, codigoCurso, paginas, autenticacao, estudante, matricula);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Certificado c = (Certificado) o;
            return this.descricao.equals(c.descricao);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        return result;
    }
}
