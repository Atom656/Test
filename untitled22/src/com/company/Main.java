package com.company;

import java.util.*;
import java.util.Scanner;
import static com.sun.tools.javac.jvm.ByteCodes.swap;

    public class Main {

        public static void main(String[] args) {
            PriorityQueue<String> carQueue = new PriorityQueue<>();
            PriorityQueue<Integer> sellQueue = new PriorityQueue<>();
            PriorityQueue<String> peopleQueue = new PriorityQueue<>();
            ArrayList<Integer> list = new ArrayList<>();
            carQueue.add("BMW");
            carQueue.add("Mazda");
            carQueue.add("Tesla");
            sellQueue.add(55);
            sellQueue.add(45);
            sellQueue.add(35);
            peopleQueue.add("Artur");
            list.add(100);
            list.add(150);
            list.add(200);
            Iterator iterator2 = carQueue.iterator();
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next() + " ");
            }
            Iterator iterator = sellQueue.iterator();
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next() + " ");
            }
            Iterator iterator3 = peopleQueue.iterator();
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next() + " ");
            }
            Equals();
            {
                System.out.println("Машини " + carQueue + " еквіваленті " + sellQueue + ": " + carQueue.equals(sellQueue) + ";");
            }
            Size();
            {
                System.out.println("Клькість елементів машин: " + carQueue.size() + ";");
                System.out.println("Кількість елементів цінників: " + sellQueue.size() + ";");
            }
            IsEmpty();
            {
                System.out.println("Чи черга з машин і цінників пуста? " + carQueue.isEmpty() + ";");
            }
            Back();
            {
                System.out.println("Яка ціна на машину є послыдня? " + sellQueue.remove() + ";");
            }
            Swap();
            {
                swap(carQueue = peopleQueue);
                System.out.println("Обмін елментами машина " + carQueue + " на " + peopleQueue);
            }
            Push();
            {
                int count = 0;
                while (!sellQueue.isEmpty() && count < 1) {
                    System.out.println("Пошук середнього елементу ціни? " + sellQueue.poll());
                    count++;

                }
            }
            Pop();
            {
                int count = 1;
                while (!sellQueue.isEmpty() && count < 2) {
                    System.out.println("Видалено найбільший елемент" + sellQueue.peek());
                    count++;
                }
            }
            Find();
            {
                System.out.println("Чи присутній такий елемент як 55? " + sellQueue.stream().findAny());
            }
            For_Erch();
            {
                for (int i = 0; i < list.size(); i++) {
                    System.out.println("Оброблених елементів по процедурі - " + list.get(i));
                }
            }
        }

        private static void Equals() {
        }

        private static void Size() {
        }

        private static void IsEmpty() {
        }

        private static void Back() {
        }

        private static void Swap() {
        }

        private static void Push() {
        }

        private static void Pop() {
        }

        private static void swap(PriorityQueue<String> strings) {
        }

        private static void Find() {
        }

        private static void For_Erch() {

        }
    }

