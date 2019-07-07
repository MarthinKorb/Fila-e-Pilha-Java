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
public class Pilha {

    String[] pilha = new String[15];
    int aux;
    int topo = -1;

    public void IsEmpty() {

        if (topo == -1) {
            System.out.println("\nA pilha está vazia!");
        } else {
            //Zerando a variável aux para que quando for chamado o método, o aux comece do zero
            aux = 0;

            for (int i = 0; i < pilha.length; i++) {
                //Se a posição do vetor é diferente de null o aux é incrementado
                if (pilha[i] != null) {
                    aux ++;
                }
            }
            if (aux == 1) {
                System.out.println("\nA pilha não está vazia e tem " + aux + " posição ocupada!");
            } else {
                System.out.println("\nA pilha não está vazia e tem " + aux + " posições ocupadas!");
            }
        }
    }

    public void ListarElementos() {

        if (topo < 0) {
            System.out.println("");
            System.out.println("Pilha vazia! Insira valores para poder listar!");
        } else {
            for (int i = 0; i < pilha.length; i++) {
                if (pilha[i] != null) {
                    System.out.println("Posição [" + i + "] = " + pilha[i]);
                } else {
                    System.out.println("Posição [" + i + "] está vazia!");
                }
            }
        }
    }

    public void Empilhar(String nome) {

        if (nome.equals("")) {
            System.out.println("");
            System.out.println("Erro ao ler o valor!");
        } else {
            //O topo é incrementado
            topo++;
            //a posição topo recebe o parâmetro nome 
            pilha[topo] = nome;
            System.out.println("");
            System.out.println(nome + " inserido na pilha com sucesso!");
            System.out.println("");
        }
    }

    public void Desempilhar() {

        if (topo == -1) {
            System.out.println("");
            System.out.println("Pilha vazia! Não há como desempilhar!");
        } else {
            //Salvando na variável "excluído" o valor excluído
            String excluido = pilha[topo];
            //Atribuindo o valor null para a posição que foi desocupada
            pilha[topo] = null;
            //decrementando o topo
            topo--;
            System.out.println("");
            System.out.println(excluido + " foi excluído da pilha!");
            System.out.println("");
        }
    }

    public void VisualizarTopo() {

        if (topo == -1) {
            System.out.println("");
            System.out.println("A pilha está vazia. Não há topo!!!");
        } else {
            System.out.println("");
            System.out.println("O topo está na posição [" + topo + "], e o valor que está no topo é: " + pilha[topo]);
        }
    }
}
