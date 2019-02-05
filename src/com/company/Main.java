package com.company;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int size = 100;
    public static String[] task = new String[size];
    public static int currentTask = 0;

    public static void main(String[] args) {
        int chooseTask;
        do{
            System.out.println("Please choose an option:\n" +
                    "(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.\n");
            chooseTask = input.nextInt();
            input.nextLine();

            switch (chooseTask){
                case 1: addTask();
                    break;
                case 2: removeTask();
                    break;
                case 3: updateTask();
                    break;
                case 4: listTask();
                    break;

            }

        }while (chooseTask != 0);
    }
    static void addTask(){
        System.out.println("What tasks would you like to add?");
        String newTask = input.nextLine();
        task[currentTask] = newTask;
        currentTask++;
    }
    static void removeTask(){
        System.out.println("What task would you like to remove");
        int taskNumber = input.nextInt();
        input.nextLine();
        for(int i = taskNumber; i < currentTask; i++){
            task[i] = task[i + 1];
        }
        currentTask -- ;
    }
    static  void updateTask(){
        System.out.println("What task would you like to update?");
        int whatTask = input.nextInt();
        input.nextLine();
        System.out.println("What would you like to update it to?");
        String changeTask = input.nextLine();
        task[whatTask] = changeTask;
    }
    static  void listTask(){
        for (int i = 0; i < currentTask; i++){
            System.out.println(task[i]);
        }

    }
}


