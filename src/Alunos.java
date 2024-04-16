import java.util.Scanner;

public class Alunos {

    public static void main(String args[]){
        System.out.println("Lista de Alunos!");
        alunosSexoMasculino();
        alunosSexoFeminino();
        pesquisaAluno();

    }

    private static void pesquisaAluno() {

        Scanner s = new Scanner(System.in);
        System.out.println("\nDeseja fazer uma consulta ?");
        System.out.println("\n Digite Sim para continuar.");
        System.out.println(" Digite Não para Finalizar.");
        String resposta  = s.next();

        while (resposta.equals("sim")) {
            System.out.println("Digite o id do aluno?");
            int result = s.nextInt();




            result = result;
            if (result >= 5 && result <= 5) {
                System.out.println("Nome: Carlos Herique ");
                System.out.println("Sexo: Masculino");
                System.out.println("Idade: 35 anos");
            }
            if (result >= 6 && result <= 6) {
                System.out.println("Nome: Daniel Paiva ");
                System.out.println("Sexo: Masculino");
                System.out.println("Idade: 30 anos");
            }
            if (result >= 7 && result <= 7) {
                System.out.println("Nome: Sabrina souza ");
                System.out.println("Sexo: Feminino");
                System.out.println("Idade: 26 anos");
            }
            if (result >= 8 && result <= 8) {
                System.out.println("Nome: Tais de melo ");
                System.out.println("Sexo: Feminino");
                System.out.println("Idade: 18 anos");
            } else if (result >= 5 && result <= 8) {
                System.out.println("");
            } else {
                System.out.println("Aluno inexistente");
            }
            System.out.println("Dseja fazer uma nova consulta ?");
            resposta = s.next();
        }
        System.out.println("Obrigado");


    }

    private static void alunosSexoFeminino() {

        String aluno1 = "Sabrina Souza sexo  F ";
        String aluno2 = "Tais Melo sexo  F ";
        String[] alunos1 = aluno1.split(" ", 5);
        System.out.println(("\nNome: " + alunos1[0]));
        System.out.println("id: " +7);

        String[] alunos2 = aluno2.split(" ", 5);
        System.out.println(("\nNome: " + alunos2[0]));
        System.out.println("id: " +8);
    }

    private static void alunosSexoMasculino() {

        String aluno1 = "Carlos Hnrrique sexo  M ";
        String aluno2 = "Daniel Paiva sexo  M ";

        String[] alunos2 = aluno2.split(" ", 5);
        System.out.println(("\nNome: " + alunos2[0]));
        System.out.println("id: " +6);

        String[] alunos1 = aluno1.split(" ", 5);
        System.out.println(("\nNome: " + alunos1[0]));
        System.out.println("id: " +5);
    }



}
