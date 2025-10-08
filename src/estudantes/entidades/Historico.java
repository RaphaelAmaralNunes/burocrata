package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public class Historico extends Registro {

    private double coeficiente;
    private String[] componentes;

    public Historico(String criador, CodigoCurso codigoCurso, int paginas, long autenticacao, String estudante, long matricula, double coeficiente, String[] componentes) {
        super(criador, codigoCurso, paginas, autenticacao, estudante, matricula);
        this.coeficiente = coeficiente;
        this.componentes = componentes;
    }

    public double getCoeficiente() {
        return coeficiente;
    }

    public String[] getComponentes() {
        return componentes;
    }

    @Override
    public boolean equals(Object o) {
        final double epsilon = 0.000001;
        if (super.equals(o)) {
            Historico h = (Historico) o;
            return Math.abs(this.coeficiente - h.coeficiente) < epsilon && Arrays.equals(this.componentes, h.componentes);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Double.hashCode(coeficiente);
        result = 31 * result + Arrays.hashCode(componentes);
        return result;
    }
}
