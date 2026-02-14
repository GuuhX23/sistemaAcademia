package application;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Instrutor> ListaInstrutores = new ArrayList<>();

        Instrutor instrutor1 = new Instrutor("Alexandre", TipoExercicio.MUSCULACAO);
        Instrutor instrutor2 = new Instrutor("Beto", TipoExercicio.CORRIDA);

        ListaInstrutores.add(instrutor1);
        ListaInstrutores.add(instrutor2);



        System.out.println("BEM-VINDO À ACADEMIA.  ");
        System.out.print("Digite se nome: ");
        String name = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println();

        System.out.println("A mensalidade esta no valor de R$150,00, qual sera sua forma de pagamento:");
        System.out.println("PIX = (P)");
        System.out.println("BOLETO = (B)");
        System.out.println("CARTAO = (C)");
        char pagamento = sc.next().toUpperCase().charAt(0);
        if (pagamento == 'B') {
            System.out.println("Aviso: Boleto demora 3 dias. Deseja continuar? (S/N)");
            char confirma = sc.next().toUpperCase().charAt(0);
            if (confirma == 'S') {
                System.out.println("Seja muito bem vindo, daqui 3 dias voce ja podera iniciar conosco!");
            }
            else {
                System.out.println("Qual a forma de pagamento que deseja: ");
                System.out.println("PIX = (P)");
                System.out.println("CARTAO = (C)");
                pagamento = sc.next().toUpperCase().charAt(0);


            }


        }

        Pagamento pagamentoFinal;

        if (pagamento == 'P') {
            pagamentoFinal = Pagamento.PIX;
        } else if (pagamento == 'C') {
            pagamentoFinal = Pagamento.CARTAO;
        } else {
            pagamentoFinal = Pagamento.BOLETO;
        }
        Aluno aluno = new Aluno(name, idade, pagamentoFinal);

        sc.nextLine();

        System.out.println();
        System.out.println("Seja muito bem vindo!");
        System.out.println("Qual treino deseja hoje? ");
        String nameExercicio = sc.nextLine();
        System.out.println("Qual categoria se encaixa: ");
        System.out.println("MUSCULACAO = (M)");
        System.out.println("CORRIDA = (C)");
        System.out.println("NATACAO = (N)");
        char tipoExercicio = sc.next().toUpperCase().charAt(0);

        TipoExercicio exercicio;

        if (tipoExercicio == 'M') {
            exercicio = TipoExercicio.MUSCULACAO;
        } else if (tipoExercicio == 'C') {
            exercicio = TipoExercicio.CORRIDA;
        } else {
            exercicio = TipoExercicio.NATACAO;
        }

        Exercicios treino = new Exercicios(name, exercicio);

        boolean encontrou = false;

        for (Instrutor i : ListaInstrutores) {
            if (i.getEspecialidade() == treino.getCategoria()) {
                System.out.println("Match encontrado!");
                System.out.println("Para o treino de " + treino.getNomeExercicio() +
                        ", seu instrutor será: " +
                        i.getName());
                encontrou = true;
                break; // Para a busca assim que encontrar o primeiro
            }
        }

        if (!encontrou) {
            System.out.println("Desculpe, não temos instrutores disponíveis para essa categoria no momento.");
        }

        sc.close();
    }
}
