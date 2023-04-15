/**
 * Classe principal dos exercícios da AUla 1 de Métodos
 */
public class Main {
    public static void main(String[] args) {
        //Calculadora
        System.out.println("---------------------");
        System.out.println("Exercício Calculadora");
        System.out.println("---------------------");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("\n------------------");
        System.out.println("Exercício Mensagem");
        System.out.println("------------------");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("\n--------------------");
        System.out.println("Exercício Empréstimo");
        System.out.println("--------------------");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }


}
