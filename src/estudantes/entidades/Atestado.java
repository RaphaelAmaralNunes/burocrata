package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Atestado extends Registro {

    private String descricao;
    private String categoria;

    public Atestado(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao, String estudante, long matricula, String descricao, String categoria) {
        super(criador, codigoCurso, paginas, autenticacao, estudante, matricula);
        this.descricao = descricao;
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Atestado a = (Atestado) o;
            return this.descricao.equals(a.descricao) && this.categoria.equals(a.categoria);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (descricao != null ? descricao.hashCode() : 0);
        result = 31 * result + (categoria != null ? categoria.hashCode() : 0);
        return result;
    }
}
