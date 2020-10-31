import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int num;

    System.out.println("Happy Halloween! How many houses should we trick or treat at?");
    num = s.nextInt();


    Pillowcase myPillowcase = new Pillowcase();
    myPillowcase.getCandy(); //Kit Kat
    myPillowcase.getCandy(); //
    myPillowcase.getCandy();
    myPillowcase.getCandy();
    myPillowcase.getCandy();
   
   
    for (int i = 0; i < myPillowcase.getCount(); i++ ){
        myPillowcase.getCandy();
    }

    //for (type variableName : arrayName) {
  // code block to be executed
    

   // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    //for (String i : cars) {
    //  System.out.println(i);
    

  //myPillowcase.getCount = Scanner(System.in);

  /*
  void printTest() {
    for(int i = 0; i < totalCandy.size(); i++) { 
      totalCandy.get(i).print();
   } 
  }
  */
  myPillowcase.printNumCandies();
  
  }}
