package entities;

public class Instrutor {

    private String name;

    private TipoExercicio especialidade;

    public Instrutor() {
    }

    public Instrutor(String name, TipoExercicio especialidade) {
        this.name = name;
        this.especialidade = especialidade;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoExercicio getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(TipoExercicio especialidade) {
        this.especialidade = especialidade;
    }
}