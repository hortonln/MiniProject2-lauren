class Candy{

private String brand;

Candy(){

  brand = "";
}

Candy(String aBrand){

  brand = aBrand;
}

//accessor method - getting the name of the brand
String getBrand(){
  return brand;
}

//mutator method - we are setting the name of the brand
void setBrand(String theBrand){
  brand = theBrand;
}

//print method for printing brand name
void print(){
System.out.println(brand);
}




}