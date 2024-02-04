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

        System.out.print("\nDigite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        Calculadora calculadora = new Calculadora(valor1, valor2);

        double resultado = calculadora.calcular(operacao);

        System.out.println("\nResultado da operação: " + resultado + "\n");

        main(null);

        scanner.close();
    }
}