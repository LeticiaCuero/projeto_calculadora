package calculadora;

/**
 * Classe responsável por testar o funcionamento da classe Calculadora.
 *
 * Esta classe executa testes simples para verificar se as operações
 * matemáticas básicas estão funcionando corretamente.
 *
 * Também são testadas situações de erro, como divisão por zero
 * e operação inválida.
 *
 * @author Leticia Cuero
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Método principal responsável por executar os testes da calculadora.
     *
     * Neste método é criado um objeto da classe Calculadora e são chamadas
     * as operações de soma, subtração, multiplicação e divisão.
     *
     * Também são utilizados blocos try/catch para capturar possíveis erros
     * durante a execução, como divisão por zero e operador inválido.
     *
     * @param args argumentos da linha de comando
     */
    public static void main(String[] args) {

        // Cria um objeto da classe Calculadora
        Calculadora calc = new Calculadora();

        // Teste de soma: resultado esperado 5
        System.out.println(calc.calc(2, 3, "+"));

        // Teste de subtração: resultado esperado 6
        System.out.println(calc.calc(10, 4, "-"));

        // Teste de multiplicação: resultado esperado 15
        System.out.println(calc.calc(3, 5, "*"));

        // Teste de divisão: resultado esperado 4
        System.out.println(calc.calc(8, 2, "/"));

        // Teste de divisão por zero
        try {
            System.out.println(calc.calc(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de operação inválida
        try {
            System.out.println(calc.calc(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}