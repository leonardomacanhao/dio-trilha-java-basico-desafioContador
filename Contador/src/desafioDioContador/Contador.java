package desafioDioContador;

import java.util.Scanner;

/**
 * Esta classe implementa um contador que imprime números incrementados com base em dois parâmetros fornecidos pelo usuário.
 * Se o segundo parâmetro for menor ou igual ao primeiro, uma exceção é lançada.
 *
 * @author João Leonardo Macanhão
 */
public class Contador {

    /**
     * Método principal para iniciar o programa.
     *
     * @param args os argumentos de linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Exceção capturada, imprime a mensagem de erro
            System.out.println(e.getMessage());
        }

        sc.close();
    }

    /**
     * Realiza a contagem e imprime números incrementados com base nos parâmetros fornecidos.
     *
     * @param parametroUm   o primeiro parâmetro fornecido
     * @param parametroDois o segundo parâmetro fornecido
     * @throws ParametrosInvalidosException se o segundo parâmetro for menor ou igual ao primeiro
     */
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se parametroUm é MAIOR que parametroDois e lança a exceção se necessário
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;

        // Realiza o loop para imprimir os números incrementados
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

/**
 * Exceção personalizada para indicar que os parâmetros fornecidos são inválidos.
 */
class ParametrosInvalidosException extends Exception {
    /**
     * Construtor que recebe a mensagem de erro.
     *
     * @param message a mensagem de erro
     */
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
