package review;

import java.util.Scanner;

public class Haha {
	public static void main(String[] args) {


	Scanner sc=new Scanner(System.in);
	System.out.print("1. 가위   2. 바위  3. 보\n>> ");
	int mychoice=sc.nextInt();
	int comchoice=(int)(Math.random()*3)+1;
	
	String choice="";
	switch(mychoice){
	case 1: choice = "가위"; break;
	case 2: choice = "바위"; break;
	case 3: choice = "보";
	}
	
	System.out.println("당신" + choice);
	
	switch(comchoice){
	case 1: choice = "가위"; break;
	case 2: choice = "바위"; break;
	case 3: choice = "보";
	}
	
	System.out.println("컴" + choice);
	
	
	
	String result="";
	switch(mychoice-comchoice) {
	case -2: case 1:
		result = "이김"; break;
	case -1: case 2:
		result = "짐"; break;
	case -0: case 3:
		result = "비김";
	}
	System.out.println("결과"+result);
	sc.close();
	}
}
