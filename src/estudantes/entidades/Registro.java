package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Registro extends DocumentoAcademico {

    private String estudante;
    private long matricula;

    public Registro(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao, String estudante, long matricula) {
        super(criador, codigoCurso, paginas, autenticacao);
        this.estudante = estudante;
        this.matricula = matricula;
    }

    public String getEstudante() {
        return estudante;
    }

    public long getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Registro r = (Registro) o;
            return this.estudante.equals(r.estudante) && this.matricula == r.matricula;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (estudante != null ? estudante.hashCode() : 0);
        result = 31 * result + (int) (matricula ^ (matricula >>> 32));
        return result;
    }
}
