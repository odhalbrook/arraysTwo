package arraysTwo;

import java.util.Scanner;

public class ArrayChallenge2
	{
		public static void main(String[] args)
		{
			
			//arraySquare();
			//monthNames();
			pickACard();
			chooseSentence();
			alphabeticalSentnce();
		}

		private static void arraySquare()
			{
				int [] num = new int [10];
				num [0] = 2;
				num [1] = 4;
				num [2] = 6;
				num [3] = 8;
				num [4] = 10;
				num [5] = 12;
				num [6] = 14;
				num [7] = 16;
				num [8] = 18;
				num [9] = 20;
				
				for (int i : num)
					{
						System.out.println(i * i);
					}
				
			}

		private static void monthNames()
			{
				String [] month = new String [12];
				month [0] = "January";
				month [1] = "Febuary";
				month [2] = "March";
				month [3] = "April";
				month [4] = "May";
				month [5] = "June";
				month [6] = "July";
				month [7] = "August";
				month [8] = "September";
				month [9] = "October";
				month [10] = "November";
				month [11] = "December";
				
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				
				int randomNum = (int) (Math.random( ) * 3);
				
				String [] comp = new String [4];
				comp [0] = ", you look like you've been hitting the gym lately.";
				comp [1] = ", I like your backpack.";
				comp [2] = ", you look great today.";
				comp [3] = ", you look very good today.";
				
				System.out.println(name + comp[randomNum]);
				System.out.println("Choose a number that corresponds to a month and I will tell you the month name");
				int num = userInput.nextInt();
				System.out.println(month[num = num - 1]);
				
			}

		private static void pickACard()
			{
				String [] suit = new String [4];
					
						suit[0] = "hearts";
						suit[1] = "diamonds";
						suit[2] = "clubs";
						suit[3] = "spades";
					
				
				String [] card = new String [13];
					
				card[0]="one";
				card[1]="two";
				card[2]="three";
				card[3]="four";
				card[4]="five";
				card[5]="six";
				card[6]="seven";
				card[7]="eight";
				card[8]="nine";
				card[9]="ten";
				card[10]="jack";
				card[11]="queen";
				card[12]="king";
				
				int randomNum = (int) (Math.random( ) * 4);
				int randomNum2 = (int) (Math.random( ) * 13);
				System.out.println(card[randomNum2] + " of " + suit[randomNum]);
				
			}

		private static void chooseSentence()
			{
				// TODO Auto-generated method stub
				
			}

		private static void alphabeticalSentnce()
			{
				// TODO Auto-generated method stub
				
			}
	}
