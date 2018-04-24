//MADE BY KNEITHKITH
//04-23-2018
//BASIC LOGIC 
//namuhp - (seek || namukiller || disaster)



import java.util.Random;
import java.util.Scanner;

public class Namu2 {
	private int namuhp =100;
 
	private	String turn = ""; 
	Scanner s =  new Scanner(System.in);
	

	public static void main(String[] args) {
		Namu2 na = new Namu2();
		na.show();
}
	
	public void show () {
		System.out.println("BEST WOOD SUVIVAL CHALLANGE");
		System.out.println("Wood care lite ver .1 ");
		System.out.println("plesae press (enter)");
	
		menu();
	}
	
	public void menu() {							
		for(;;) {
			turn = s.nextLine();
			turn = "enter";
	
			switch (turn) {
			case "enter":
				start();
			
				break;	
	
			default : 
				System.out.println("preesed wrong key");
				System.exit(1);
			break;
			}
		}
	}

	
	
	public void start() {
		Random rand = new Random();
		int randomchoice = rand.nextInt(3)+1;
		//System.out.println(randomchoice);
	
		switch(randomchoice)
		{
		case 1 :
			disasting();
			if(namuhp <1)  {
				System.out.println("GAME OVER"); 
				System.exit(1);
			}
			
		case 2 :
			namuCutting();
			if(namuhp <1)  {
				System.out.println("GAME OVER"); 	
				System.exit(1);
			}
			
			
		case 3 :
			namuSaving();
			if(namuhp <1)  {
				System.out.println("GAME OVER"); 
				System.exit(1);
			}
			
		case 4 :
			namuNotting();
			if(namuhp <1)  {
				System.out.println("GAME OVER"); 
				System.exit(1);
			
			}
			
		default :	
			
		}
		}

	public void disasting() {
		namuhp = namuhp-(namuhp*50/100);	
		System.out.println("namu get DISASTER -50PERCENT");
		System.out.println(namuhp);
							}
	
	
	public void namuCutting() {
	
	Random rnd = new Random();
	int	randomCut = rnd.nextInt(5)+1;
	if(randomCut == 3) {
		namuhp = namuhp - 70;	
		System.out.println("!!!Warning Woodcutter!!!");
		System.out.println("¢Ý¢Ý»ç¶ûÀÇ ¢Ý¢Ý³ª¹«²Û¢Ý¢Ý¢Ý ");
		System.out.println("WOOD DAMMAGED -70");
		System.out.println(namuhp);	
		}
	}
	
	public void namuSaving() 	{
		Random rnd = new Random();
		int namusave= rnd.nextInt(3)+1;
		if(namusave ==1 || namusave ==2) {
			namuhp = namuhp+50;
			System.out.println("namu DRINKS WATER hp +50");
			System.out.println(namuhp);
	
									}
	
								}
	public void namuNotting() {
		Random rnd = new Random();
		int namuNot = rnd.nextInt(10)+1;
		if(namuNot == 1) {
			namuhp = namuhp + 100;
			System.out.println("you'v got 10 percent Luck^^");
			System.out.println("namu gets hp +100");
			System.out.println(namuhp);
					}

		
	
	
	
	}


}

