package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public class Plano extends DocumentoAcademico {

    private String responsavel;
    private String[] planejamento;

    public Plano(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao, String responsavel, String[] planejamento) {
        super(criador, codigoCurso, paginas, autenticacao);
        this.responsavel = responsavel;
        this.planejamento = planejamento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public String[] getPlanejamento() {
        return planejamento;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Plano p = (Plano) o;
            return this.responsavel.equals(p.responsavel) && Arrays.equals(this.planejamento, p.planejamento);
        } else {
            return false;
        }
    }
}
