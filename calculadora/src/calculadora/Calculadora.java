package calculadora;

/**
 * Projeto Calculadora.
 *
 * Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão.
 *
 * A classe também possui tratamento para divisão por zero e operador inválido,
 * evitando que o programa seja finalizado de forma inesperada.
 *
 * @author Leticia Cuero
 * @version 1.0
 */
public class Calculadora {

    /**
     * Armazena o resultado da operação matemática realizada.
     */
	
    public int r = 0;

    /**
     * Realiza uma operação matemática entre dois números inteiros.
     *
     * O método recebe dois valores inteiros e um operador em formato de texto.
     * De acordo com o operador informado, executa a operação correspondente.
     *
     * Operadores aceitos:
     * + para soma
     * - para subtração
     * * para multiplicação
     * / para divisão
     *
     * @param a primeiro número da operação
     * @param b segundo número da operação
     * @param op operador matemático informado
     * @return resultado da operação matemática
     */
    public int calc(int a, int b, String op) {

        // Verifica se o operador informado é de soma
        if (op.equals("+")) {
            r = a + b;

        // Verifica se o operador informado é de subtração
        } else if (op.equals("-")) {
            r = a - b;

        // Verifica se o operador informado é de multiplicação
        } else if (op.equals("*")) {
            r = a * b;

        // Verifica se o operador informado é de divisão
        } else if (op.equals("/")) {

            // Impede a divisão por zero
            if (b != 0) {
                r = a / b;
            } else {
                System.out.println("Erro divisão por zero");
                r = 0;
            }

        // Caso o operador não seja válido
        } else {
            System.out.println("Operação inválida");
            r = 0;
        }

        // Exibe o resultado no console
        System.out.println("Resultado: " + r);

        return r;
    }
}