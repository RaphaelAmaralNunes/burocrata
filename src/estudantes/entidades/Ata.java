package estudantes.entidades;

import professor.entidades.CodigoCurso;

import java.util.Arrays;

public class Ata extends Documento {
    private int numero;
    private String texto;
    private String[] presentes;

    public Ata(String criador, CodigoCurso codigoCurso, int paginas, int numero, String texto, String[] presentes) {
        super(criador, codigoCurso, paginas);
        this.numero = numero;
        this.texto = texto;
        this.presentes = presentes;
    }

    public int getNumero() {
        return numero;
    }

    public String getTexto() {
        return texto;
    }

    public String[] getPresentes() {
        return presentes;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Ata a = (Ata) o;
            return this.numero == a.numero && this.texto.equals(a.texto) && Arrays.equals(this.presentes, a.presentes);
        } else
            return false;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numero;
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(presentes);
        return result;
    }
}
