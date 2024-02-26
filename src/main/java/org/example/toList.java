package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class toList {
    private ArrayList<String> tasks;

    public toList(){
        tasks = new ArrayList<>();
    }
    public void addTask(String task){
        tasks.add(task);
        System.out.println("Tarefa adicionada: " + tasks);
    }
    public void removeTask(int index){
        if (index >= 0 && index < tasks.size()){
            String removeTask = tasks.remove(index);
            System.out.println("Tarefa removida: " + removeTask);
        }else {
            System.out.println("Indice invalido!");
        }
    }
    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("Não há tarefas na lista");
        }else {
            System.out.println("Lista de Tarefas:");
            for (int i=0;i<tasks.size();i++){
                System.out.println((i+1) + ". " + tasks.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        toList toDoList = new toList();

        while (true) {
            System.out.println("\n Escolha uma opção:");
            System.out.println("1. Adicionar tarefa.");
            System.out.println("2. Remover tarefa.");
            System.out.println("3. Mostrar tarefa.");
            System.out.println("4. Sair.");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Digite a tarefa a ser adicionada");
                    String taskToAdd = scanner.nextLine();
                    toDoList.addTask(taskToAdd);
                    break;
                case 2:
                    if (toDoList.tasks.isEmpty()){
                        System.out.println("Não há tarefas para remover.");
                    }else {
                        System.out.println("Digite o numero da tarefa a ser removida: ");
                        int indexToRemove = scanner.nextInt();
                        toDoList.removeTask(indexToRemove -1);
                    }
                    break;
                case 3:
                    toDoList.displayTasks();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção Inválida.");
            }
        }
    }
}
