package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class Norma extends DocumentoAdministrativo {

    private int responsaveis;
    private boolean valido;
    private String texto;

    public Norma(String criador, CodigoCurso codigoCurso, int paginas, int numero, boolean valido, String texto) {
        super(criador, codigoCurso, paginas);
        this.responsaveis = numero;
        this.valido = valido;
        this.texto = texto;
    }

    public int getNumero() {
        return responsaveis;
    }

    public boolean getValido() {
        return valido;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public boolean equals(Object o) {
        if (super.equals(o)) {
            Norma n = (Norma)o;
            return this.responsaveis == n.responsaveis && this.valido == n.valido && this.texto.equals(n.texto);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + responsaveis;
        result = 31 * result + (valido ? 1231 : 1237);
        result = 31 * result + (texto != null ? texto.hashCode() : 0);
        return result;
    }
}
