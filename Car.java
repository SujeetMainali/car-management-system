 


/**
 * @author (Sujeet Mainali)
 * Group: Y1C1
 * LondonMet ID : 21040036
 * College ID: NP01CP4A210007
 * @Date (2021/12/19)
 * @Version (1.0.0)
 */
//Creating super or parent class named "Car"
public class Car
{
    // Declaring 5 attrubutes of Car using "private" access modifier to use within this class only
    private int carID;
    private String carName;
    private String carBrand;
    private String carPrice;
    private String carColor;
    // Creating constructor 
    public Car ( int carID , String carName , String carBrand, String carPrice){
        // "this." is used to set the value for instance variables.
        // Attributes = parameter
        this.carID = carID;
        this.carName = carName;
        this.carColor = "";
        this.carBrand = carBrand;
        this.carPrice = carPrice;
    }
    // Creating accessor method for all the attributes.
    public int getCarID(){
        return this.carID;
    }

    public String getCarName(){
        return carName;
    }

    public String getCarColor(){
        return carColor;
    }

    public String getCarBrand(){
        return carBrand;
    }

    public String getCarPrice(){
        return carPrice;
    }
      
    // Creating mutator method to set the value of carColor.
    public void setCarColor(String carColor){
        if(carColor.isEmpty()){
            System.out.println("The Car Colour is Empty");
        }
        else{
            displayCar();
            this.carColor=carColor;
        }

    }
   /*A method name displayCar is created
    *carID,carName carColor, carBrand and carPrice is displayed with proper messege
    */
    public void displayCar(){
        System.out.println("The carID is " + getCarID());
        System.out.println("The Car name is " + getCarName());
        System.out.println("Color of Car is " + getCarColor());
        System.out.println("Car brand is " + getCarBrand());
        System.out.println("Price of car is " + getCarPrice());
        // " carID"  is annnotate
    }

}