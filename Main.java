/**
* This class is the Main java. This program is a model for trick or treating
* @author Jiun Kim, Angela Lopez, Lauren Horton
* @version 10.28.2020
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    num = s.nextInt();


    Pillowcase myPillowcase = new Pillowcase();

    for (int i = 0; i < num; i++ ){
        myPillowcase.getCandy();
    }

  myPillowcase.printNumCandies();
  
  }}
