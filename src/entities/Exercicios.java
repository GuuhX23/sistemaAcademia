package entities;

public class Exercicios {

    private String nomeExercicio;

    private TipoExercicio categoria;

    public Exercicios() {
    }

    public Exercicios(String nomeExercicio, TipoExercicio categoria) {
        this.nomeExercicio = nomeExercicio;
        this.categoria = categoria;
    }

    public String getNomeExercicio() {
        return nomeExercicio;
    }

    public void setNomeExercicio(String nomeExercicio) {
        this.nomeExercicio = nomeExercicio;
    }

    public TipoExercicio getCategoria() {
        return categoria;
    }

    public void setCategoria(TipoExercicio categoria) {
        this.categoria = categoria;
    }
}
