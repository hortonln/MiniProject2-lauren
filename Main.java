import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    num = s.nextLine();


    Pillowcase myPillowcase = new Pillowcase();
    //myPillowcase.getCandy(); //Kit Kat
   // myPillowcase.getCandy(); //
   // myPillowcase.getCandy();
   // myPillowcase.getCandy();
   // myPillowcase.getCandy();
   


  /*
  void printTest() {
    for(int i = 0; i < totalCandy.size(); i++) { 
      totalCandy.get(i).print();
   } 
  }
  */
  
  myPillowcase.printNumCandies();
  }
}