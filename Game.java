package pkg;
import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Game{
	
	Scanner sc = new Scanner(System.in);
	
	String cat = new String();
	String cat2 = new String();
		
	String base = "This Celebrity ";
		
	int index;
	int counter = 4;
		
	String answer;	
	String guess;
		
	String q1;
	String q2;
	String q3;
	String q4;
		
	ArrayList <String> CatList = new ArrayList <String> (Arrays.asList("Wealthy", "MovieStars", "Athletes", "Artists"));
	
	//info
	
	ArrayList <String> WealthyList = new ArrayList <String> (Arrays.asList("Elon Musk", "Jeff Bezos"));
	
	ArrayList <String> WealthyList1 = new ArrayList <String> (Arrays.asList("is very big on electricty.", "is known for being a space cowboy."));
	ArrayList <String> WealthyList2 = new ArrayList <String> (Arrays.asList("is very hated and looked upon.", "owns one of the largest delivery company."));
	ArrayList <String> WealthyList3 = new ArrayList <String> (Arrays.asList("is in the race of space.", "owns the Y721 sail yacht."));
	ArrayList <String> WealthyList4 = new ArrayList <String> (Arrays.asList("has smoked once with Joe Rogan.", "is bald."));
	
	ArrayList <String> MovieStarsList = new ArrayList <String> (Arrays.asList("Keanu Reeves", "Matt Damon"));
	
	ArrayList <String> MovieStarsList1 = new ArrayList <String> (Arrays.asList("plays in the hit game Cyberpunk 2077.", "is out of this world."));
	ArrayList <String> MovieStarsList2 = new ArrayList <String>(Arrays.asList("is known for loving dogs.", "has a fued with Jimmy Kimmel."));
	ArrayList <String> MovieStarsList3 = new ArrayList <String>(Arrays.asList("pays in gold coins.", "used their poop for compost."));
	ArrayList <String> MovieStarsList4 = new ArrayList <String>(Arrays.asList("had a crush on Sandra Bullock.", "last name is Bourne"));
		
	ArrayList <String> AthletesList = new ArrayList <String> (Arrays.asList());	
	
	ArrayList <String> AthletesList1 = new ArrayList <String> (Arrays.asList());
	ArrayList <String> AthletesList2 = new ArrayList <String> (Arrays.asList());
	ArrayList <String> AthletesList3 = new ArrayList <String> (Arrays.asList());
	ArrayList <String> AthletesList4 = new ArrayList <String> (Arrays.asList());
	
	ArrayList <String> ArtistsList = new ArrayList <String> (Arrays.asList());	
	
	ArrayList <String> ArtistsList1 = new ArrayList <String> (Arrays.asList());
	ArrayList <String> ArtistsList2 = new ArrayList <String> (Arrays.asList());
	ArrayList <String> ArtistsList3 = new ArrayList <String> (Arrays.asList());
	ArrayList <String> ArtistsList4 = new ArrayList <String> (Arrays.asList());
	
	public void AdditionPortion(ArrayList <String> celebs, ArrayList <String> one, ArrayList <String> two, ArrayList <String> three, ArrayList <String> four){
		
		System.out.println("There are going to be 4 questions, statements, or characteristics that you can add.");
		System.out.println("Add them like this but do not include: This Celebrity, it is already given.");
		System.out.println("EX: has 5 cars. / Do not be that vague though, and remember, answer like this: Ted Bundy.");
		System.out.println("");
		
		System.out.println("Select your " + cat2 + " character:");
			String addChar = sc.nextLine();
				System.out.println("");
				
		while(Arrays.asList().contains(addChar)){
			System.out.println("Character selected has already been implemented.");
				System.out.println("Try again:");
					String addChar2 = sc.nextLine();
					
				if(!(Arrays.asList().contains(addChar))){
					System.out.println("Viable Character.");
			}
		}
		
		System.out.println("Ok, now add your statements.");
		
		System.out.println("Addition number one:");
			String add1 = sc.nextLine();
				System.out.println("");
			
		System.out.println("Ok, Addition number two:");
			String add2 = sc.nextLine();
				System.out.println("");
		
		System.out.println("Ok, Addition number three:");
			String add3 = sc.nextLine();
				System.out.println("");
				
		System.out.println("Ok, Addition number four:");
			String add4 = sc.nextLine();
				System.out.println("");
				
			celebs.add(addChar);
			one.add(add1);
			two.add(add2);
			three.add(add3);
			four.add(add4);
				
		System.out.println("Great, Thank you for Playing.");
		System.out.println("Would you like to play again:");
			String ans = sc.nextLine();
							
		if(ans.equals("yes") || ans.equals("y") || ans.equals("Yes") || ans.equals("Y")){
			System.out.println("Great");
				runGame();
		}
		
		else{
			System.out.println("Goodbye");
				return;
		}		
	}
	
	public void QuestionPortion(String select, ArrayList <String> celebs, ArrayList <String> one, ArrayList <String> two, ArrayList <String> three, ArrayList <String> four){
		
		System.out.println("You choose: " + select + ", you have " + counter + " tries, here we go.");
			System.out.println("Press enter to skip Question and loose a try.");
				String brek3 = sc.nextLine();
					for(int i = 0; i < WealthyList.size(); i++){
	            		index = (int)(Math.random() * WealthyList.size());

	                	answer = celebs.get(index);
	                	q1 = one.get(index);
	            		q2 = two.get(index);
	            		q3 = three.get(index);
	            		q4 = four.get(index);
	                			
	        ArrayList <String> QuestionList = new ArrayList <String> (Arrays.asList(q1, q2, q3, q4));
	                	
			for(int j = 0; j < QuestionList.size(); j++){
				System.out.println(base + QuestionList.get(j));
	                System.out.println("Guess:");
	                	guess = sc.nextLine();
							counter--;
							
				if(!guess.equals(answer)){			
					System.out.println("Wrong, you have " + counter + " tries left to guess.");
						System.out.println("");
					
					if(counter == 0){
							System.out.println("The Celebrity was: " + answer);
								String brek4 = sc.nextLine();
									return;
						}
					}
					
				else{
					System.out.println("");
						System.out.println("You won!");
							System.out.println("Now you get to add your own Celebrity, Traits, and Statements.");
								System.out.println(CatList);
									System.out.println("Select your Category:");
										cat2 = sc.nextLine();
											System.out.println("");
												return;
				}
			}
		}
	}
	
	
	public void runGame(){
		
		System.out.println("");
		System.out.println("Celebrity Guessing game.");
		System.out.println("To guess a name, answer like this: Ted Bundy.");
		System.out.println("To select a category, answer like this: Comedy or ComedyCentral.");
		
			String brek = sc.nextLine();
		
		System.out.println("Would U like to play:");
			String ans = sc.nextLine();
			
		if(ans.equals("no") || ans.equals("n") || ans.equals("No") || ans.equals("N")){
				System.out.println("Aww");
		}
		
		else if(ans.equals("yes") || ans.equals("y") || ans.equals("Yes") || ans.equals("Y")){
			System.out.println("Yaay");
				String brek1 = sc.nextLine();
					System.out.println("Categories:");
						System.out.println(CatList);
							System.out.println("Athletes and Artists not avalable, but you can add one if u win.");
								String brek2 = sc.nextLine();
									System.out.println("Choose a Category:");
										cat = sc.nextLine();
											System.out.println("");
		}
		
		if(cat.equals("Wealthy") || cat.equals("wealthy")){
			
			QuestionPortion(cat, WealthyList, WealthyList1, WealthyList2, WealthyList3, WealthyList4);
			
				if(cat2.equals("Wealthy") || cat.equals("wealthy")){
					
					System.out.println("You choose: " + cat2);
						AdditionPortion(WealthyList, WealthyList1, WealthyList2, WealthyList3, WealthyList4);
			}
		}
		
		else if(cat.equals("MovieStars") || cat.equals("moviestars") || cat.equals("Movie Stars") || cat.equals("movie stars")){
			
			QuestionPortion(cat, MovieStarsList, MovieStarsList1, MovieStarsList2, MovieStarsList3, MovieStarsList4);
		
			if(cat2.equals("MovieStars") || cat.equals("moviestars")){
					
					System.out.println("You choose: " + cat2);
						AdditionPortion(MovieStarsList, MovieStarsList1, MovieStarsList2, MovieStarsList3, MovieStarsList4);
			}
		}
		
		else if(cat.equals("Athletes") || cat.equals("athletes")){
			
			QuestionPortion(cat, AthletesList, AthletesList1, ArtistsList2, AthletesList3, AthletesList4);
		
			if(cat2.equals("Athletes") || cat.equals("athletes")){
					
					System.out.println("You choose: " + cat2);
						AdditionPortion(AthletesList, AthletesList1, ArtistsList2, AthletesList3, AthletesList4);
			}	
		}
		
		else if(cat.equals("Artist") || cat.equals("artist")){
			
			QuestionPortion(cat, ArtistsList, ArtistsList1, ArtistsList2, ArtistsList3, ArtistsList4);
		
			if(cat2.equals("Artist") || cat.equals("artist")){
					
					System.out.println("You choose: " + cat2);
						AdditionPortion(ArtistsList, ArtistsList1, ArtistsList2, ArtistsList3, ArtistsList4);
			}
		}
		
		else{
			System.out.println("");
				System.out.println("Not an option");
		}
		
	}
}