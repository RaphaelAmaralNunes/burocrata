package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Diploma extends Certificado {

    private String habilitacao;

    public Diploma(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao, String estudante, long matricula, String descricao, String habilitacao) {
        super(criador, codigoCurso, paginas, autenticacao, estudante, matricula, descricao);
        this.habilitacao = habilitacao;
    }

    public String getHabilitacao() {
        return habilitacao;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Diploma d = (Diploma) o;
            return this.habilitacao.equals(d.habilitacao);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (habilitacao != null ? habilitacao.hashCode() : 0);
        return result;
    }
}
