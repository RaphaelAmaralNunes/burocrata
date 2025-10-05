package estudantes.entidades;

import professor.entidades.CodigoCurso;

public class DocumentoAdministrativo extends Documento {

    public DocumentoAdministrativo(String criador, CodigoCurso codigoCurso, int paginas) {
        super(criador, codigoCurso, paginas);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
