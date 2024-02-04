/*
* Transformar a Calculadora em uma Classe
* Faça um sistema que possui duas classes: Uma Principal, que terá função de front-end, e uma classe Calculadora, que terá PELO MENOS os métodos de soma, subtração, multiplicação e divisão.
* Faça com que esses métodos sejam private, logo não poderão ser chamados diretamente pela classe Principal.
* Haverá apenas um método public chamado calcular, que receberá 2 valores double e 1 valor char, e retornará um valor double como resultado da operação escolhida.
* No interior desse método calcular estarão as chamadas para os métodos privados.
* É proibido entrada e saída na classe Calculadora. Todas as entradas e saídas devem ser feitas somente na classe Principal, e nela terá apenas 1 objeto calculadora.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        System.out.print("|-----------------------------|\n");
        System.out.println("     Menu da Calculadora:");
        System.out.print("|-----------------------------|\n");
        System.out.println("\n   1 - Iniciar Programa");
        System.out.println("   2 - Sair");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                entrarNaCalculadora();
                break;
            case 2:
                System.out.println("\nSaindo da Calculadora.");
                scanner.close();
                break;
            default:
                System.out.println("\nOpção inválida. Tente novamente.");
        }
    }

    private static void entrarNaCalculadora() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("|-----------------------------|\n");

        System.out.print("\nDigite a operação (+, -, *, /, r): ");
        char operacao = scanner.next().charAt(0);

        System.out.print("\nDigite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        // Valor padrão para a segunda entrada se ele entrar na operacao de Raiz Quadrada
        double valor2 = 0;

        //Caso a operação for diferente de R, ele seguirá lendo 2 entradas, diferente de quando com o R (Raiz quadrada) ele apenas lé o primeiro numero
        if (operacao != 'r') {
            System.out.print("Digite o segundo valor: ");
            valor2 = scanner.nextDouble();
        }

        Calculadora calculadora = new Calculadora(valor1, valor2);

        try {
            double resultado = calculadora.calcular(operacao);
            System.out.println("\nResultado da operação: " + resultado + "\n");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        main(null);

        scanner.close();
    }
}