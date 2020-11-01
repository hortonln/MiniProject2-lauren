/**
* This class stores the type of candy and stores the count for each of them
* @author Jiun Kim, Angela Lopez, Lauren Horton
* @version 10.28.2020
*/

import java.util.ArrayList;
import java.util.Random; 


class Pillowcase{

ArrayList<Candy> totalCandy = new ArrayList<Candy>();
int count;

/**Constructor method to set pilowcase variables to 0
*/
Pillowcase(){
count = 0;
}

/**accessor method to get the count 
*/
int getCount(){
  return count;
}
/*

@Creates a Random number
@Assigns each random number to a Candy
@Updates the number of candies you receive

*/
void getCandy(){
  
  System.out.println("Trick or Treat!");

  Random r = new Random();
  int randomNum = r.nextInt(101)+1;
  
  count++;

if (randomNum>=1 && randomNum<=7){
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

@ Totalled each type of candy 
@ Prints the type and the amount of each type of candy


*/

void printNumCandies(){


  
    int counter[] = new int[7];

    //for loop here
for (int i = 0; i < totalCandy.size(); i++){
   if (totalCandy.get(i).getBrand().equals("Kit Kat")){ counter[0]++;}
   else if (totalCandy.get(i).getBrand().equals("Milky Way")){ counter[1]++;}
   else if (totalCandy.get(i).getBrand().equals("M&Ms") ){ counter[2]++;}
   else if (totalCandy.get(i).getBrand().equals("Twix")){ counter[3]++;}
   else  if (totalCandy.get(i).getBrand().equals("Hershey's Bar") ){ counter[4]++;}
   else if (totalCandy.get(i).getBrand().equals("Pink Starbursts") ){ counter[5]++;}
   else if (totalCandy.get(i).getBrand().equals("Reese's")){ counter[6]++;}
}


System.out.println("We have " + count + " candies.");

if (counter[0]== 0){}
  else { System.out.println(counter[0] + " Kit Kat");}
if (counter[1]== 0){}
  else { System.out.println(counter[1] + " Milky Way");}
if (counter[2]== 0){}
  else { System.out.println(counter[2] + " M&Ms");}
if (counter[3]== 0){}
  else { System.out.println(counter[3] + " Twix");}
if (counter[4]== 0){}
  else { System.out.println(counter[4] + " Hershey's Bar");}
if (counter[5]== 0){}
  else { System.out.println(counter[5] + " Pink Starbursts");}
if (counter[6]== 0){}
  else { System.out.println(counter[6] + " Reese's");}

}

}