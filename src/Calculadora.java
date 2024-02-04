public class Calculadora
    {
        private double valor1;
        private double valor2;

        public Calculadora(double valor1, double valor2) {
            this.valor1 = valor1;
            this.valor2 = valor2;
        }

        private double soma() {
            return valor1 + valor2;
        }

        private double subtracao() {
            return valor1 - valor2;
        }

        private double multiplicacao() {
            return valor1 * valor2;
        }

        private double divisao() {
            if (valor2 != 0) {
                return valor1 / valor2;
            } else {
                System.out.println("Erro: Divisão por zero.");
                return Double.NaN;
            }
        }

        public double calcular(char operacao) {

            switch (operacao) {
                case '+':
                    return soma();
                case '-':
                    return subtracao();
                case '*':
                    return multiplicacao();
                case '/':
                    return divisao();
                default:
                    System.out.println("Operação inválida.");
                    return Double.NaN;
            }
        }
    }