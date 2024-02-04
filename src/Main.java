import java.util.Scanner;

class Calculadora {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Função para ler o que o Usuario irá colocar e interpretar

        int valor1, valor2, resultado = 0;
        char operador;

        System.out.println("CALCULADORA\n");

        System.out.print("Informe o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Informe a operação (+, -, *, /): ");
        operador = input.next().charAt(0);

        System.out.print("Informe o segundo valor: ");
        valor2 = input.nextInt();

        switch(operador) {
            //Switch uma forma de colocar varias condições sem precisar criar diversos IF & ELSE

            case '+':
                resultado =  valor1 + valor2;
                break;

            case '-':
                resultado =  valor1 - valor2;
                break;

            case '*':
                resultado =  valor1 * valor2;
                break;

            case '/':
                if(valor2 !=0) {
                    resultado =  valor1 / valor2;
                }else {
                    System.out.println("Não é possível dividir por 0");
                    System.exit(0);
                }
                break;

            default:
                System.out.println("Operador Inválido, use somente (+, -, *, /)");
                //Condição caso o Usuario coloque algo que não está dentro do objetivo do programa
        }
        System.out.println("O resultado do seu cálculo é: " + resultado);

        input.close();
    }
}