package com.company;

import java.awt.*;
import java.util.Scanner;

class Student {
     firstName f;
     lastName l;
     age a;
     group g;
     GPA p;

 public Student(firstName f, lastName l, age a , group g, GPA p){

     this.f = f;
     this.l = l;
     this.a = a;
     this.g = g;
     this.p = p;

 }

	 {
	     Scanner in = new Scanner(System.in);
	     System.out.println("Кінець запису.");
	     System.out.println();
	 }

     public Student() {

     }

     public Student(firstName f, lastName l, age a , group g, GPA p) {
     }
 }
 class firstName{

	 {
         Scanner in = new Scanner(System.in);
	     System.out.print("Прізвище студента:");
	     int name = in.nextInt();
	     System.out.println("Записано!!!");
	 }
}

 class lastName{

	 {   Scanner in = new Scanner(System.in);
	     System.out.print("Ім'я студента:");
	     int Name = in.nextInt();
	     System.out.println("Записано!!!");
	 }
}
 class age {

     {
         Scanner in = new Scanner(System.in);
         System.out.print("Вік студента:");
         int year = in.nextInt();
         System.out.println("Записано!!!");
     }
 }
	 class  group{
         {
             Scanner in = new Scanner(System.in);
             System.out.print("Група:");
             int kours = in.nextInt();
             System.out.println("Записано!!!");
         }
     }
     class GPA{

         {
             Scanner in = new Scanner(System.in);
             System.out.print("Середній бал студента:");
             int gpa = in.nextInt();
             System.out.println("Записано!!!");
         }
         }

public class Main {

	public static void main(String[] args) {
        {System.out.println("Інформація про студента:");}
		firstName f = new firstName();
		lastName l = new lastName();
		age a = new age();
        group g = new group();
        GPA p = new GPA();
		Student s = new Student(f,l,a,g,p);
		h = null;


	}
}
