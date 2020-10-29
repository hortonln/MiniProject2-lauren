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
String getCandy(){
  System.out.println("Trick or Treat!");

  Random r = new Random();
  int randomNum = r.nextInt(101)+1;
  System.out.println(randomNum);

if ( randomNum>=1 && randomNum<=7){
    while (randomNum >0) {
        totalCandy.add(new Candy("Kit Kat"));
        }}
  else if (randomNum>=8 && randomNum<=15){
    while (randomNum >0) {
        totalCandy.add(new Candy("Milky Way"));
        }}
  else if (randomNum>=16 && randomNum<=25){
    while (randomNum >0) {
        totalCandy.add(new Candy("M&Ms"));
        }}
  else if (randomNum>=26 && randomNum<=38){
    while (randomNum >0) {
        totalCandy.add(new Candy("Twix"));
        }}
  else if (randomNum>=39 && randomNum<=55){
    while (randomNum >0) {
        totalCandy.add(new Candy("Hershey's Bar"));
        }}
  else if (randomNum>=56 && randomNum<=75){
    while (randomNum >0) {
        totalCandy.add(new Candy("Pink Starbursts"));
        }}
  else if (randomNum>=76 && randomNum<=100){
    while (randomNum >0) {
        totalCandy.add(new Candy("Reese's"));
        }}
  else {
    System.out.println("You suck");
  }

  return getCandy();

}









}