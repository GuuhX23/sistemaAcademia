package entities;

public class Aluno {

    private String name;
    private Integer idade;

    private Pagamento pagamento;


    public Aluno() {
    }

    public Aluno(String name, Integer idade, Pagamento pagamento) {
        this.name = name;
        this.idade = idade;
        this.pagamento = pagamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
}