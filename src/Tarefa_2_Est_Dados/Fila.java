/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_2_Est_Dados;

/**
 *
 * @author marth
 */
public class Fila {

    String[] fila = new String[15];

    int first = -1;//primeiro da fila
    int last = -1;//último da fila
    int aux;//auxiliar de contagem

    public void Enfilar(String nome) {
        if (nome.equals("")) {
            System.out.println("Erro ao fazer a leitura!");
        } else {
            //Testando se a fila está cheia
            if (aux == 15) {
                System.out.println("Fila cheia! Exclua alguém da fila para poder inserir outra pessoa! ");
            } else {
                    //Não estando cheia, executa as etapas de incremento e inserção no vetor
                    System.out.println("");

                    //Verificando se a fila ainda está vazia
                    if (first == -1) {
                        //incrementando o first para a posição [0] do Array *APENAS NA PRIMEIRA VEZ*
                        first = first + 1;
                    }
                    //incrementando o first para a posição [0] do Array
                    last++;
                    
                    //inserindo o nome ná última posição do Array
                    fila[last] = nome;
                    System.out.println("");
                    System.out.println(nome + " foi adicionado na fila com sucesso!");                 
            }
        }
    }

    public void Desenfilar() {
        if (first == -1 || fila[first] == null) {
            System.out.println("A fila está vazia!");
        } else {
            if (fila[first] != null) {

                //adicionando à String excluído o valor que será excluído da Fila
                String excluido = fila[first];
                //Salvando o valor da posição fila[1] na posição fila[0]
                fila[first] = fila[first + 1];
                last--;
                //iniciando o loop pela segunda posição do vetor
                for (int i = 1; i <= (fila.length - 1); i++) {
                    //testa se o i é igual a posição final-1 do vetor
                    if (i == (fila.length - 1)) {
                        //Insere o valor null na última posição que foi desocupada
                        fila[i] = null;
                    } else if (fila[i] != null) {
                        //Faz "Caminhar" a fila
                        fila[i] = fila[i + 1];
                    }
                }
                System.out.println("");
                System.out.println("O " + excluido + " foi excluído da fila!");
            }
        }
    }

    public void ListarFila() {

        if (first == -1) {
            System.out.println("Não há nomes na fila!");
        } else {
            for (int i = 0; i < fila.length; i++) {
                //testa se a posição do vetor está vazia
                if (fila[i] != null) {
                    //printa na tela a posição e o valor contido na posição
                    System.out.println("Posição [" + i + "] = " + fila[i]);
                } else {
                    //se a posição == null, printa na tela a posição e informação de "Posição vazia!"
                    System.out.println("Posição [" + i + "] está vazia!");
                }
            }
        }
    }

    public void isFull() {
        if (first == -1) {
            System.out.println("A fila está vazia! ");
        } else {
            //inicia a variável aux com o valor 0
            aux = 0;
            //Percorre o vetor para ver quais posições estão ocupadas
            for (int i = 0; i < fila.length; i++) {
                //Testa se a posição é nulla ou "aux" é menor que 15(posições do vetor)
                if (fila[i] != null && aux < 15) {
                    //incrementa a variável aux
                    aux++;
                }
            }
            if (aux == 0) {
                System.out.println("A fila está vazia! ");
            } else {
                if (aux == 1) {
                    System.out.println("A Fila tem " + aux + " nome.");
                } else {
                    System.out.println("A Fila tem " + aux + " nomes.");
                }
            }
        }
    }

    public void mostrarFisrtAndLast() {

        if (first == -1 || fila[first] == null) {
            System.out.println("A fila Está vazia! ");
            //Testa se o primeiro é igual ao último da fila
        } else if (first == last) {
            System.out.println("Só há um nome na fila - " + fila[first]);
        } else {
            //Printa o primeiro e o último da fila
            System.out.println("O primeiro nome da Fila é: " + fila[first]);
            System.out.println("O último nome da Fila é: " + fila[last]);
        }
    }
}
