package connectfour;
import java.util.Scanner;
import java.util.Random;


public class Gamelogic {
	private static Player p1;
	private static Player p2;
	private static Board table;
	private static Player currplayer;
	private static final Scanner in=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("This is Score 4!!!");
		initializegame();
		initializeboard();
		
		//tyxaios prwtos paikths pou tha ksekinhsei to paixnidi
		Player currplayer=(new Random().nextBoolean()) ? p1 : p2;
		
		//an kapoios exei kerdisei to paixnidi
		boolean flag=false;
		
		
		while(true) {
			table.printtable();
			System.out.println(currplayer.getName()+"is your turn.Select a column: ");
			int col;
			while(true) {
				col=getcolin()-1;
				if(table.fullColumn(col)) {
					System.out.println("This column is full.Try again!!");
				}else {
					break;
				}
			}
			
			table.putchip(col,currplayer.getChip());
			if(table.generalwin(currplayer.getChip())) {
				table.printtable();
				System.out.println("The winner is: "+currplayer.getName());
				flag=true;//kapoios kerdise
				break;
			}
			
			if(table.fulltable()) {
				table.printtable();
				System.out.println("GAME OVER.WE HAVE A DRAW");
				break;
			}
			
			//allagh paikth
			currplayer=(currplayer==p1)? p2:p1;
		}
		in.close();
	}
	
	private static void initializegame() {
		System.out.println("Please enter the name of the 1st player: ");
		String name1=in.nextLine();
		System.out.println("Please enter the name of the 2nd player: ");
		String name2=in.nextLine();
		
		Player p1=new Player(' ',name1);
		Player p2=new Player(' ',name2);
		
		while(true) {
			System.out.println(p1.getName()+"select your chip: ");
			char chip=in.next().charAt(0);
			
			if(chip=='X'||chip=='O') {
				p1.setChip(chip);
				if(chip=='X') {
					p2.setChip('O');
				}else {
					p2.setChip('X');
				}
				System.out.println(p2.getName()+"your chip is:"+p2.getChip());
				break;
			}
				System.out.println("Please enter a valid value for chip (X OR 0)");
			}
		}
		
		
	private static void initializeboard() {
		int grammes=elegxosegkurothtas("Enter the number of rows",4,15);
		int sthles=elegxosegkurothtas("Enter the number of columns",4,15);
		table = new Board(grammes,sthles);
		
	}
	
	private static int elegxosegkurothtas(String emfanish ,int lower,int higher){
		int input;
		while(true) {
			System.out.println(emfanish);
			input=in.nextInt();
			if(input>=lower && input<=higher) {
				in.nextLine();
				break;
			}
			System.out.println("Invalid input.Please enter a number between 4-15");
		}
			
	return input;	
	}
	
	private static int getcolin() {
		int sthlh;
		while(true) {
			sthlh=in.nextInt();
			if(sthlh<=table.getCols() && sthlh>=1) {
				in.nextLine();
				return sthlh;
			}else {
				System.out.println("Enter a valid value column: ");
			}
		}
		
	}
}
