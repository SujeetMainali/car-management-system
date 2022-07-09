/*
@author (Sujeet Mainali)
 * Group: Y1C1
 * LondonMet ID : 21040036
 * College ID: NP01CP4A210007
 * @Date (2021/12/19)
 * @Version (1.0.0)
 */
//creating a sub or child class name FuelCar of super class Car
public class FuelCar extends Car{
    // declaring 8 attrubutes of Car using "private" access modifier to use within this class only
    private String distributorName;
    private String fuelType;
    private int numberofSeats;
    private String bookedDate;
    private String purchaseDate;
    private int mileage;
    private String transmission;
    private boolean isPurchased;
    // Creating constructor
    public FuelCar (int carID, String carBrand , String carName, String carPrice, String fuelType, int mileage, int numberofSeats ){
        //for accessing instance variable and methods from super class (super) keyword is used.
        super(carID, carName, carBrand, carPrice);
        // "this." is used to set the value for instance variables.
        // attributes = parameter
        this.fuelType=fuelType;
        this.mileage=mileage;
        this.numberofSeats=numberofSeats;
        this.distributorName="";        //initially the attributes are initialised to "".
        this.bookedDate="";             
        this.purchaseDate="";
        this.isPurchased= false;        //and the boolean value is set to false

    }
    // creating accessor method for all the attributes.
    public String getDistributorName(){
        return this.distributorName;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public int getNumberofSeats(){
        return this.numberofSeats;
    }

    public int getMileage(){
        return this.mileage;
    }

    public String getTransmission(){
        return this.transmission;
    }

    public String getBookedDate(){
        return this.bookedDate;
    }

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public boolean getIsPurchased(){
        return this.isPurchased;
    }
    // creating mutator method to set the value of DistributorName.
    public void setDistributorName(String distributorName ){
        this.distributorName = distributorName;
    }
    // creating mutator method to set the value of Transmission.
    public void setTransmission(String transmission ){
        this.transmission = transmission;
    }
    /*creating a mutator method
     * check if purchased is true a proper messege is displayed with the respective meethods.
     * else the ispurchased is set to true.
     */
    public void Purchase(String bookedDate, String purchaseDate  ){
        if(isPurchased==true){
            
           super.displayCar();
            //System.out.println(" the Distributor is: "+getDistributorName());
        }
        else {
            this.bookedDate= bookedDate;
            this.purchaseDate = purchaseDate;
            isPurchased=true;
            //System.out.println("the Distributor Name is : "+getDistributorName()+ " and the Trandmission is: "+getTransmission());
        }
    }
    // Display method is created to display all the methods with annotations.
    public void display(){
        super.displayCar();
        if(isPurchased==true){
            System.out.println("The name of distributor: "+ getDistributorName());
            System.out.println("The FuelType used is: "+ getFuelType());
            System.out.println("The Purchase Date is: "+ getPurchaseDate());
            System.out.println("The Booked Date is: "+ getBookedDate());
            System.out.println("The Milage of car is: "+ getMileage());
            System.out.println("The Number of seats in is: "+ getNumberofSeats());
            System.out.println("The transmission type is: "+ getTransmission());

        }
    }
}