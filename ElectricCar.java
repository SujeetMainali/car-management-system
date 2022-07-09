/*
@author (Sujeet Mainali)
 * Group: Y1C1
 * LondonMet ID : 21040036
 * College ID: NP01CP4A210007
 * @Date (2021/12/19)
 * @Version (1.0.0)
 */
//creating a sub or child class name ElectricCar of super class Car
public class ElectricCar extends Car
{
    // declaring 8 attrubutes of Car using "private" access modifier to use within this class only
    private String customerName;
    private int batteryCapacity;
    private int batteryWarranty;
    private String purchaseDate;
    private String Range;
    private int rechargeTime;
    private boolean isBought;
    private boolean isSold;
    // Creating constructor
    public ElectricCar(int carID, String carBrand , String carName,String carPrice,int batteryCapacity  ){
        //for accessing instance variable and methods from super class (super) keyword is used.
        super(carID,carBrand, carName,  carPrice);
        // "this." is used to set the value for instance variables.
        // attributes = parameter
        this.batteryCapacity = batteryCapacity;
        this.customerName="";                           //initially the attributes are initialised to "".
        this.batteryWarranty=0;
        this.purchaseDate="";
        this.Range="";
        this.rechargeTime=0;
        boolean isBought=false;                         //and the boolean value is set to false
        boolean isSold=false;
    }
    // creating accessor method for all the attributes.
    public String getCustomerName(){
        return this.customerName;
    }

    public int getBatteryCapacity(){
        return this.batteryCapacity;
    }

    public int getBatteryWarranty(){
        return this.batteryWarranty;
    }

    public String getPurchaseDate(){
        return this.purchaseDate;
    }

    public String getRange(){
        return this.Range;
    }

    public int getRechargeTime(){
        return this.rechargeTime;
    }

    public boolean getIsBought(){
        return this.isBought;
    }

    public boolean getIsSold(){
        return this.isSold;
    }
    // creating mutator method to set the value of customerName with the following parameters.
    public void setTheCustomerName(String customerName){
        if(isBought==false){
            this.customerName=customerName;

        }
        else{
            System.out.println("Name cannot be changed as car is already bought");
        }
    }
    // creating mutator method Buy and passed the following parameters
    public void getBuy(String customerName, int batteryWarranty, String purchaseDate, String Range,int rechargeTime){
        if(isBought==false){
            setTheCustomerName(customerName);
            this.batteryWarranty=batteryWarranty;
            this.purchaseDate=purchaseDate;
            this.Range=Range;
            this.rechargeTime=rechargeTime;
            this.isBought=true;
        }
        else{
            System.out.println("Car with provided information is already bought");
        }

    }
    // creating mutator method for Selling 
    public void sell (String customerName){
        this.customerName=customerName;
        if(isSold==false){              // condition to check if it is sold

            this.batteryCapacity =0;
            this.batteryWarranty=0;
            this.purchaseDate="";
            this.Range="";
            this.rechargeTime=0;
            this.isSold=true;
            this.isBought=false;
        }
        else {
            System.out.println("Sorry! The Car is already Sold. Please Select new one");
        }
    }
    // Display method to display all the methods if isbought is true 
    public void displayElectricCar(){
        super.displayCar();
        if(isBought==true){
            System.out.println("Name of the customer is: "+getCustomerName());
            System.out.println("The Battery Capacity is: "+getBatteryCapacity());
            System.out.println("The Battery Warranty is: "+getBatteryWarranty());
            System.out.println("The Purchase Date is: "+getPurchaseDate());
            System.out.println("The Range is: "+getRange());
            System.out.println("The Recharge Time is: "+getRechargeTime());
        }
    }
}