import java.util.ArrayList;
import java.util.Random; 


class Pillowcase{

//array list to store candies, int to keep track of how many candies user has
private String totalCandy;
int count;

//constructor & initializing variables from abaove
Pillowcase(){
ArrayList<String> totalCandy = new ArrayList<String>();
count = 0;
}


//accessor mthod for count
int getCount(){
  return count;
}


String getCandy(){
  System.out.println("Trick or Treat!");

  Random r = new Random();
  int randomNum = r.nextInt(101)+1;
  System.out.println(randomNum);

/** 1 to 7 kitkat
8 to 15 milky way
16 to 25 M&Ms
26 to 38 Twix
39 to 55 Hershey's Bar
56 to 75 Pink Starbust
76 to 100 Reese's
randomnum > 25 && randomnum < 42
*/

  if ( randomNum>=1 && randomNum<=7){
    while (randomNum >0) {
        totalCandy.setBrand("KitKat");
        }}

  if (randomNum>=8 && randomNum<=15){
    while (randomNum >0) {
        totalCandy.setBrand("Milky Way");
        }}

  if (randomNum>=16 && randomNum<=25){
    while (randomNum >0) {
        totalCandy.setBrand("M&Ms");
        }}
  if (randomNum>=26 && randomNum<=38){
    while (randomNum >0) {
        totalCandy.setBrand("Twix");
        }}
  if (randomNum>=39 && randomNum<=55){
    while (randomNum >0) {
        totalCandy.setBrand("Hershey's Bar");
        }}
  if (randomNum>=56 && randomNum<=75){
    while (randomNum >0) {
        totalCandy.setBrand("Pink Starburst");
        }}
  if (randomNum>=76 && randomNum<=100){
    while (randomNum >0) {
        totalCandy.setBrand("Reese's");
        }}
  
  return Candy;

}









}