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

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        Calculadora calculadora = new Calculadora(valor1, valor2);

        double resultado = calculadora.calcular(operacao);

        System.out.println("Resultado da operação: " + resultado);

        scanner.close();
    }
}