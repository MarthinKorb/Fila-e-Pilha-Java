/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarefa_2_Est_Dados;

import java.util.Scanner;

/**
 *
 * @author marth
 */
public class Programa_FIla_Pilha {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Scanner lt = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        Pilha objPilha = new Pilha();
        Fila objFila = new Fila();

        int opMainMenu, opFila;

        do {
            System.out.println("****Programa para trabalhar com Fila e Pilha****");
            System.out.println("");
            System.out.println("\nMENU DE OPÇÕES\n");
            System.out.println("");
            System.out.println("1 - Trabalhar com Fila");
            System.out.println("2 - Trabalhar com Pilha");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");

            opMainMenu = leitura.nextInt();
            System.out.println("");

            switch (opMainMenu) {
                case 1:
                    do {
                        System.out.println("");
                        System.out.println("***FILA***");
                        System.out.println("");
                        System.out.println("1 - Inserir na Fila");
                        System.out.println("2 - Excluir da Fila");
                        System.out.println("3 - Visualizar a Fila");
                        System.out.println("4 - Verificar se está cheia ou vazia");
                        System.out.println("5 - Visualizar 1° e último elementos");
                        System.out.println("6 - Sair");
                        System.out.print("Opção: ");
                        System.out.println("");

                        opFila = l.nextInt();

                        switch (opFila) {
                            case 1:
                                System.out.println("");
                                System.out.println("Informe o valor a ser inserido na fila: ");
                                objFila.Enfilar(lt.nextLine());
                                System.out.println("");
                                break;

                            case 2:
                                objFila.Desenfilar();
                                System.out.println("");
                                break;

                            case 3:
                                objFila.ListarFila();
                                System.out.println("");
                                break;

                            case 4:
                                objFila.isFull();
                                System.out.println("");
                                break;

                            case 5:
                                objFila.mostrarFisrtAndLast();
                                System.out.println("");
                                break;

                        }
                    } while (opFila != 6);

                    break;//break do case 1

                case 2: {
                    int opPilha;
                    do {
                        System.out.println("");
                        System.out.println("***Pilha***");
                        System.out.println("");
                        System.out.println("1 - Inserir na Pilha");
                        System.out.println("2 - Excluir da Pilha");
                        System.out.println("3 - Visualizar a Pilha");
                        System.out.println("4 - Verificar se está cheia ou vazia");
                        System.out.println("5 - Visualizar o topo");
                        System.out.println("6 - Sair");
                        System.out.print("Opção: ");
                        opPilha = l.nextInt();
                        System.out.println("");

                        switch (opPilha) {
                            case 1:
                                System.out.println("");
                                System.out.println("***Informe o nome a ser inserido: ");
                                objPilha.Empilhar(lt.nextLine());
                                System.out.println("");
                                break;

                            case 2:
                                objPilha.Desempilhar();
                                System.out.println("");
                                break;

                            case 3:
                                objPilha.ListarElementos();
                                System.out.println("");
                                break;

                            case 4:
                                objPilha.IsEmpty();
                                System.out.println("");
                                break;

                            case 5:
                                objPilha.VisualizarTopo();
                                System.out.println("");
                                break;

                        }

                    } while (opPilha != 6);

                }

                break;//break case 2//break case 2
            }

        } while (opMainMenu != 3);

    }

}
