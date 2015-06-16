package in.codecamp.TheGame;
import java.util.Scanner;

public class Game {

	
public static void main(String[] args){
	
	
	Wrestler Wrestler1 = new Wrestler("Undertaker",3,6.10,100,40,5);
	Wrestler Wrestler2 = new Wrestler("Khali",6,7.1,150,20,5);
	Wrestler Wrestler3 = new Wrestler("John Cena",1,6.2,120,40,3);
	Wrestler Wrestler4 = new Wrestler("Randy Orton",5,6.4,100,31,9);
	Wrestler Wrestler5 = new Wrestler("The Rock",2,6.4,130,32,5);
	Wrestler Wrestler6 = new Wrestler("Roman Reigns",4,6.4,120,10,2);
	Wrestler Wrestler7 = new Wrestler("Kane",7,7.0,130,28,10);
	Wrestler Wrestler8 = new Wrestler("Seth Rollins",8,5.8,90,10,5);
	
	int a;
	
	do
	{
	
	Wrestler wrestlers[]={Wrestler1,Wrestler2,Wrestler3,Wrestler7,Wrestler4,Wrestler5,Wrestler6,Wrestler8};
	int random1 = (int)(Math.random()*4);
	
	
	int random2 = (int)(Math.random()*4);
	if(random1==random2){
		System.out.println("Same Cards Try Again");
		continue;}
	
	Wrestler temp1=wrestlers[random1];
	
	Wrestler temp2=wrestlers[random2];
	
	System.out.println(temp1.toString());
	
	
	Scanner userInput = new Scanner(System.in);
	
	
	int choice;
	
	
	System.out.println("By Which Attribute You Wanna Play\n");
	System.out.println("1-Rank\n2-Height\n3-Weight");
	userInput.hasNextInt();
	choice=userInput.nextInt();
	
	System.out.println(temp2.toString());
	
	
	Wrestler.Play(choice,temp1,temp2);
	System.out.println("Do You Wish To Continue\n1-yes\n2-No");
	userInput.hasNextInt();
	a=userInput.nextInt();
	 if(a==1)
	 continue;
	 else if(a==2){
		 System.out.println("Thanks For Playing");
	      break;}
	
	}while(true);
	
	
}}



