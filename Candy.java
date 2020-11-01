/**
* This class print out a candy name.
* @author Jiun Kim, Angela Lopez, Lauren Horton
* @version 10.28.2020
*/
class Candy{

private String brand;

Candy(){

  brand = "";
}

/**
* This is a counstructor
* @param
*/
Candy(String aBrand){

  brand = aBrand;
}

/**
* This method is an accessor method.
* This method returns a candy name to the user.
* @return candyName (The value input as a String).
*/
String getBrand(){
  return brand;
}

/**mutator method - we are setting the name of the brand
*/
void setBrand(String theBrand){
  brand = theBrand;
}


void print(){
System.out.println(brand);
}


}