package JAVA0904;

import java.util.Scanner;

public class Main2 { 
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int count = sc.nextInt();
	int printCount = sc.nextInt();
	sc.nextLine();
	
	Student[] students = new Student[count];
	
	for(int i =0; i< count; i++) {
		students[i] = new Student();
		
		students[i].name = sc.next();
		students[i].score = sc.nextInt();
		sc.nextLine();
	}
	System.out.printf("\n");
	for(int i=0; i<printCount; i++) {
		//ystem.out.printf("students[%d].name  : %s\n",i,students[i].name);
		//System.out.printf("students[%d].score : %s\n",i,students[i].score);
		System.out.printf("%s\n",students[i].name);
	
	}
	
  }
  
	  
}

class Student{
	String name;
	int score;
}
//4 2
//Jeon 95
//Kim 59
//Lee 90
//Bae 100
//일때    첫숫자  명  입력받고   뒤숫자  만 출력 하는데   빨리넣은순으로 출력
