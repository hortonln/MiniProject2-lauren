import java.util.ArrayList;
import java.util.Random; 


class Pillowcase{

//array list to store candies, int to keep track of how many candies user has
ArrayList<Candy> totalCandy = new ArrayList<Candy>();
int count;

//constructor & initializing variables from abaove
Pillowcase(){
count = 0;
}


//accessor mthod for count
int getCount(){
  return count;
}

/* 
1 to 7 kitkat
8 to 15 milky way
16 to 25 M&Ms
26 to 38 Twix
39 to 55 Hershey's Bar
56 to 75 Pink Starbust
76 to 100 Reese's
randomnum > 25 && randomnum < 42
*/ 

void getCandy(){
  System.out.println("Trick or Treat!");

  Random r = new Random();
  int randomNum = r.nextInt(101)+1;
  System.out.println(randomNum);

  count = randomNum;

if ( randomNum>=1 && randomNum<=7){
      totalCandy.add(new Candy("Kit Kat"));
        }
  else if (randomNum>=8 && randomNum<=15){
     totalCandy.add(new Candy("Milky Way"));
        }
  else if (randomNum>=16 && randomNum<=25){
        totalCandy.add(new Candy("M&Ms"));
        }
  else if (randomNum>=26 && randomNum<=38){
        totalCandy.add(new Candy("Twix"));
        }
  else if (randomNum>=39 && randomNum<=55){
        totalCandy.add(new Candy("Hershey's Bar"));
        }
  else if (randomNum>=56 && randomNum<=75){
        totalCandy.add(new Candy("Pink Starbursts"));
  }
        
  else if (randomNum>=76 && randomNum<=100){
        totalCandy.add(new Candy ("Reese's"));
        }
  else {    System.out.println("Try again");  }

}

/*
void printTest() {
  for(int i = 0; i < totalCandy.size(); i++) { 
    totalCandy.get(i).print();
   } 
  }
*/



//print out how much of each candy you have (ex: 5 Twix)
void printNumCandies(){
  Candy candies = new Candy();
  int counter[] = new int[7];
//for loop here

    if (candies.getBrand().equals("Kit Kat")){ counter[0]++;}
    if (candies.getBrand().equals("Milky Way")){ counter[1]++;}
    if (candies.getBrand().equals("M&Ms") ){ counter[2]++;}
    if (candies.getBrand().equals("Twix")){ counter[3]++;}
    if (candies.getBrand().equals("Hershey's Bar") ){ counter[4]++;}
    if (candies.getBrand().equals("Pink Starbursts") ){ counter[5]++;}
    if (candies.getBrand().equals("Reese's")){ counter[6]++;}


    System.out.println("We have " + count + " candies.");
    System.out.println(counter[0] + " Kit Kat");
    System.out.println(counter[1] + " Milk Way");
    System.out.println(counter[2] + " M&Ms");
    System.out.println(counter[3] + " Twix");
    System.out.println(counter[4] + " Hershey's Bar");
    System.out.println(counter[5] + " Pink Starbursts");
    System.out.println(counter[6] + " Reese's");






}

}



