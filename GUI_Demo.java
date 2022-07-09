 


import javax.swing.*;
import java.awt.*;
//import event for listener interface
import java.awt.event.*;
import java.util.*;

/**
 * @author (Sujeet Mainali)
 * Group: Y1C1
 * LondonMet ID : 21040036
 * College ID: NP01CP4A210007
 * @Date (2021/12/19)
 * @Version (1.0.0)
 */
public class GUI_Demo

{

    private JFrame frame; // declaring frame
    private JLabel fcarhead, ecarhead;
    private JPanel ecarPanel, fcarPanel;
    private JButton clear;
    private JOptionPane pane;
    ArrayList<Car>alist = new ArrayList<Car>();
    //object of fuelcar
    private static FuelCar fuelCar;
    //object of Electric car
    private static ElectricCar electricCar;
    // =================FUEL CAR=====================================
    // ------labels for adding fuelcar

    private static JLabel fcarID, fcarName, fcarBrand, fcarPrice, fcarFuelType, fcarNumberOfSeats, fcarMileage;

    // ------labels for purchasing fuelcar

    private static JLabel puFcarCarID, puFcarCarName, puFcarCarBrand, puFcarCarColor, puFcarTransType,
    puFcarDistributorName,
    puFcarPurchaseDate, puFcarBookedDate;

    // -----------textfields of adding fuelcar

    private static JTextField fcarIDTxt, fcarNameTxt, fcarBrandTxt, fcarPriceTxt, fcarFuelTypeTxt,
    fcarNumberOfSeatsTxt,
    fcarMileageTxt;

    // -------textfields of purchasing fuelcar

    private static JTextField puFcarCarIDTxt, puFcarCarNameTxt, puFcarCarBrandTxt, puFcarCarColorTxt,
    puFcarTransTypeTxt,
    puFcarDistributorNameTxt;

    private static JComboBox puFcarPurchaseDateYearCbx, puFcarPurchaseDateMonthCbx, puFcarPurchaseDateDayCbx,
    puFcarBookedDateYearCbx, puFcarBookedDateMonthCbx, puFcarBookedDateDayCbx;

    // ----add button for adding fuelcar
    private static JButton fcarAddBtn;

    // ----purchase and display button for purchase and display
    private static JButton puFcarPurchaseBtn, puFcarDisplayBtn,dispElectricCar;

    // =================Electric CAR==================================
    // ---------labels for adding electric car
    private static JLabel ecarID, ecarName, ecarBrand, ecarPrice, ecarBatteryCapacity;

    // -----text fields for adding electric car
    private static JTextField ecarIDTxt, ecarNameTxt, ecarBrandTxt, ecarPriceTxt, ecarBatteryCapacityTxt;

    // ---------labels for purchasing electric car
    private static JLabel buEcarCarID, buEcarCarName, buEcarCarBrand, buEcarCarPrice,
    buEcarBatteryWarranty,
    buEcarRange, buEcarCarColor, buEcarCustomerName, buEcarRechargeTime, buEcarPurchaseDate;

    // --text fields for buying electric car
    private static JTextField buEcarCarIDTxt, buEcarCarNameTxt, buEcarCarBrandTxt, buEcarCarPriceTxt,
    buEcarBatteryWarrantyTxt,
    buEcarRangeTxt, buEcarCarColorTxt, buEcarCustomerNameTxt,
    buEcarRechargeTimeTxt;

    // -----combobox for purchased date of electric car
    private static JComboBox buEcarPurchaseDateYearCbx, buEcarPurchaseDateMonthCbx, buEcarPurchaseDateDayCbx;

    // ---buttons of electric car
    private static JButton ecarAddBtn, puEcarPurchaseBtn, puEcarDisplayBtn, puEcarSellBtn,displayFuelcar,dispFuelCar;
    // private ArrayList<Car> MyCar;
    private static JLabel image1,image2;
    
    public GUI_Demo() {
        createGUI();
    }

    public void createGUI() {
        frame = new JFrame("GUI");
        ecarPanel = new JPanel();
        ecarPanel.setLayout(null);
        fcarPanel = new JPanel();
        fcarPanel.setLayout(null);
        clear = new JButton("Clear All");
        pane = new JOptionPane();
        ecarPanel.setVisible(false);

        // =======titles electric car and fuel car
        fcarhead = new JLabel("Fuel Car");
        ecarhead = new JLabel("Electric Car");

        // =======properties of heading (Fuel car and Electric car)
        fcarhead.setBounds(154, 8, 149, 37);
        fcarhead.setForeground(Color.orange);
        fcarhead.setFont(new Font("MV Boli", Font.BOLD, 30));

        ecarhead.setBounds(154, 8, 249, 37);
        ecarhead.setForeground(Color.green);
        ecarhead.setFont(new Font("MV Boli", Font.BOLD, 30));

        // ======Fuel CAR ITEMS
        // ------labels for adding fuelcar-----
        fcarID = new JLabel("Car ID");
        fcarName = new JLabel("Car Name");
        fcarBrand = new JLabel("Car Brand");
        fcarPrice = new JLabel("Car Price");
        fcarFuelType = new JLabel("Fuel Type");
        fcarNumberOfSeats = new JLabel("No Of Seats");
        fcarMileage = new JLabel("Mileage");

        // -----textfields for adding fuelcar
        fcarIDTxt = new JTextField();
        fcarNameTxt = new JTextField();
        fcarBrandTxt = new JTextField();
        fcarPriceTxt = new JTextField();
        fcarFuelTypeTxt = new JTextField();
        fcarNumberOfSeatsTxt = new JTextField();
        fcarMileageTxt = new JTextField();

        // -----labels for purchasing fuelcar
        puFcarCarID = new JLabel("Car ID");
        puFcarCarName = new JLabel("Car Name");
        puFcarCarBrand = new JLabel("Car Brand");
        puFcarCarColor = new JLabel("Car Color");
        puFcarTransType = new JLabel("Trans Type");
        puFcarDistributorName = new JLabel("Dist Name");
        puFcarPurchaseDate = new JLabel("Purchased Date");
        puFcarBookedDate = new JLabel("Booked Date");

        // --textfields for purchasing fuelcar
        puFcarCarIDTxt = new JTextField();
        puFcarCarNameTxt = new JTextField();
        puFcarCarBrandTxt = new JTextField();
        puFcarCarColorTxt = new JTextField();
        puFcarTransTypeTxt = new JTextField();
        puFcarDistributorNameTxt = new JTextField();

        // -------combobox for purchase date and booked date
        String Year[] = { "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024",
                "2025" };
        puFcarPurchaseDateYearCbx = new JComboBox(Year);
        String Month[] = { "January", "February", "March", "April", "May", "June", "July", "August",
                "September",
                "October", "November", "December" };
        String Day[] = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14",
                "15", "16",
                "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
                "31", "32" };
        puFcarPurchaseDateMonthCbx = new JComboBox(Month);
        puFcarPurchaseDateDayCbx = new JComboBox(Day);
        puFcarBookedDateYearCbx = new JComboBox(Year);
        puFcarBookedDateMonthCbx = new JComboBox(Month);
        puFcarBookedDateDayCbx = new JComboBox(Day);

        // -----add button for adding fuel car
        fcarAddBtn = new JButton("Add");

        // -----purchase and display buttons
        puFcarPurchaseBtn = new JButton("Purchase");
        puFcarDisplayBtn = new JButton("Display");
        dispElectricCar = new JButton("Disp ECar");

        // ======ELECTRIC CAR ITEMS========
        // labels for addingg electric car
        ecarID = new JLabel("Car ID");
        ecarName = new JLabel("Car Name");
        ecarBrand = new JLabel("Car Brand");
        ecarPrice = new JLabel("Price");
        ecarBatteryCapacity = new JLabel("Battery Capacity");

        // -----textfields for adding electric car
        ecarIDTxt = new JTextField();
        ecarNameTxt = new JTextField();
        ecarBrandTxt = new JTextField();
        ecarPriceTxt = new JTextField();
        ecarBatteryCapacityTxt = new JTextField();

        // ---labels for buying electric car
        buEcarCarID = new JLabel("Car ID");
        buEcarCarName = new JLabel("Car Name");
        buEcarCarBrand = new JLabel("Car Brand");
        buEcarCarPrice = new JLabel("Price");
        buEcarCarColor = new JLabel("Car Color");
        buEcarCustomerName = new JLabel("Customer Name");
        buEcarBatteryWarranty = new JLabel("Warranty");
        buEcarRange = new JLabel("Range");
        buEcarRechargeTime = new JLabel("Recharge Time");
        buEcarPurchaseDate = new JLabel("Purchase Date");

        // -----textfields for buying electric car
        buEcarCarIDTxt = new JTextField();
        buEcarCarNameTxt = new JTextField();
        buEcarCarBrandTxt = new JTextField();
        buEcarCarPriceTxt = new JTextField();
        buEcarBatteryWarrantyTxt = new JTextField();
        buEcarRangeTxt = new JTextField();
        buEcarCarColorTxt = new JTextField();
        buEcarCustomerNameTxt = new JTextField();
        buEcarRechargeTimeTxt = new JTextField();

        // ---buttons of electric car
        ecarAddBtn = new JButton("Add");
        puEcarPurchaseBtn = new JButton("Buy");
        puEcarDisplayBtn = new JButton("Display");
        puEcarSellBtn = new JButton("Sell");
        dispFuelCar = new JButton("Disp FCar");

        // combobox for purchase date

        buEcarPurchaseDateYearCbx = new JComboBox(Year);
        buEcarPurchaseDateMonthCbx = new JComboBox(Month);
        buEcarPurchaseDateDayCbx = new JComboBox(Day);

        // ======BOUNDS OF FUEL CAR=========
        // -------setting bounds of fuel car panel----
        fcarPanel.setBounds(0, 0, 600, 727);
        fcarPanel.setBackground(Color.CYAN);

        // -----setting bounds of labels of adding fuelcar
        fcarID.setBounds(18, 80, 41, 19);
        fcarName.setBounds(270, 80, 64, 19);
        fcarBrand.setBounds(18, 125, 64, 19);
        fcarPrice.setBounds(270, 125, 59, 19);
        fcarFuelType.setBounds(18, 170, 62, 19);
        fcarNumberOfSeats.setBounds(270, 170, 73, 19);
        fcarMileage.setBounds(18, 220, 49, 19);

        // -----setting bounds of textfields of adding fuelcar
        fcarIDTxt.setBounds(108, 72, 124, 32);
        fcarNameTxt.setBounds(366, 72, 124, 32);
        fcarBrandTxt.setBounds(108, 119, 124, 32);
        fcarPriceTxt.setBounds(366, 119, 124, 32);
        fcarFuelTypeTxt.setBounds(108, 165, 124, 32);
        fcarNumberOfSeatsTxt.setBounds(366, 165, 124, 32);
        fcarMileageTxt.setBounds(108, 214, 124, 32);

        // ----setting bounds of labels of purchasing fuelcar
        puFcarCarID.setBounds(18, 310, 41, 19);
        puFcarCarName.setBounds(270, 310, 64, 19);
        puFcarCarBrand.setBounds(18, 360, 64, 19);
        puFcarCarColor.setBounds(270, 360, 59, 19);
        puFcarTransType.setBounds(18, 407, 70, 19);
        puFcarDistributorName.setBounds(270, 407, 66, 19);
        puFcarPurchaseDate.setBounds(18, 462, 93, 19);
        puFcarBookedDate.setBounds(18, 515, 81, 19);

        // ---setting bounds of textfields purchasing fuelcar
        puFcarCarIDTxt.setBounds(108, 302, 124, 32);
        puFcarCarNameTxt.setBounds(366, 302, 124, 32);
        puFcarCarBrandTxt.setBounds(108, 352, 124, 32);
        puFcarCarColorTxt.setBounds(366, 352, 124, 32);
        puFcarTransTypeTxt.setBounds(108, 400, 124, 32);
        puFcarDistributorNameTxt.setBounds(366, 400, 124, 32);

        // ----bounds of combobox of fuel car of purchase date and booked date
        puFcarPurchaseDateYearCbx.setBounds(126, 455, 86, 32);
        puFcarPurchaseDateMonthCbx.setBounds(229, 455, 86, 32);
        puFcarPurchaseDateDayCbx.setBounds(336, 455, 86, 32);

        puFcarBookedDateYearCbx.setBounds(126, 510, 86, 32);
        puFcarBookedDateMonthCbx.setBounds(229, 510, 86, 32);
        puFcarBookedDateDayCbx.setBounds(336, 510, 86, 32);

        // ----add button bounds
        fcarAddBtn.setBounds(366, 214, 83, 32);
        fcarAddBtn.setBackground(Color.GREEN);

        // purchase and display button bounds
        puFcarPurchaseBtn.setBounds(167, 591, 95, 32);
        puFcarPurchaseBtn.setBackground(Color.YELLOW);
        puFcarDisplayBtn.setBounds(287, 591, 85, 32);
        puFcarDisplayBtn.setBackground(Color.YELLOW);
        dispElectricCar.setBounds(227, 691, 95, 32);
        dispElectricCar.setBackground(Color.GREEN);

        // ======BOUNDS OF ELECTRIC CAR
        // ------setting bounds of electric car panel
        ecarPanel.setBounds(0, 0, 600, 727);
        ecarPanel.setBackground(Color.magenta);

        // -----setting bounds of labels of adding elecctric car
        ecarID.setBounds(18, 80, 41, 19);
        ecarName.setBounds(287, 80, 64, 19);
        ecarBrand.setBounds(18, 125, 64, 19);
        ecarPrice.setBounds(287, 125, 59, 19);
        ecarBatteryCapacity.setBounds(18, 170, 103, 19);

        // ------bounds of text fields of adding electric car
        ecarIDTxt.setBounds(130, 72, 124, 32);
        ecarNameTxt.setBounds(130, 119, 124, 32);
        ecarBrandTxt.setBounds(403, 72, 124, 32);
        ecarPriceTxt.setBounds(403, 119, 124, 32);
        ecarBatteryCapacityTxt.setBounds(130, 165, 124, 32);

        // ----setting bounds of labels of buying electric car
        buEcarCarID.setBounds(18, 250, 41, 19);
        buEcarCarName.setBounds(287, 250, 64, 19);
        buEcarCarBrand.setBounds(18, 302, 64, 19);
        buEcarCarPrice.setBounds(287, 302, 59, 19);
        buEcarCarColor.setBounds(18, 399, 60, 19);
        buEcarCustomerName.setBounds(287, 399, 102, 19);
        buEcarBatteryWarranty.setBounds(18, 350, 57, 19);
        buEcarRange.setBounds(287, 350, 42, 19);
        buEcarRechargeTime.setBounds(18, 448, 95, 19);
        buEcarPurchaseDate.setBounds(18, 500, 93, 19);

        /// ----setting bounds of textbox of buyinng electric car
        buEcarCarIDTxt.setBounds(130, 244, 124, 32);
        buEcarCarNameTxt.setBounds(403, 244, 124, 32);
        buEcarCarBrandTxt.setBounds(130, 293, 124, 32);
        buEcarCarPriceTxt.setBounds(403, 293, 124, 32);
        buEcarBatteryWarrantyTxt.setBounds(130, 342, 124, 32);
        buEcarRangeTxt.setBounds(403, 342, 124, 32);
        buEcarCarColorTxt.setBounds(130, 391, 124, 32);
        buEcarCustomerNameTxt.setBounds(403, 391, 124, 32);
        buEcarRechargeTimeTxt.setBounds(130, 440, 124, 32);

        // ---bounds of combo box of purchasing electric car
        buEcarPurchaseDateYearCbx.setBounds(130, 493, 86, 32);
        buEcarPurchaseDateMonthCbx.setBounds(233, 493, 86, 32);
        buEcarPurchaseDateDayCbx.setBounds(347, 493, 86, 32);

        // ----bounds of btns of electric car
        ecarAddBtn.setBounds(403, 165, 83, 32);
        ecarAddBtn.setBackground(Color.GREEN);
        puEcarPurchaseBtn.setBounds(206, 572, 90, 32);
        puEcarPurchaseBtn.setBackground(Color.YELLOW);
        puEcarDisplayBtn.setBounds(304, 572, 86, 32);
        puEcarDisplayBtn.setBackground(Color.YELLOW);
        puEcarSellBtn.setBounds(402, 572, 86, 32);
        puEcarSellBtn.setBackground(Color.YELLOW);
        dispFuelCar.setBounds(227, 691, 95, 32);
        dispFuelCar.setBackground(Color.GREEN);

        // ---clear button bounds
        clear.setBounds(218, 733, 132, 43);
        clear.setBackground(Color.red);
        clear.setForeground(Color.BLACK);
        clear.setFocusable(false);

        // =======ADDING iTEMS TO fuel car PANEL
        fcarPanel.add(fcarhead);// heading of the fuel car panel

        // adding labels for adding fuelcar
        fcarPanel.add(fcarID);
        fcarPanel.add(fcarName);
        fcarPanel.add(fcarBrand);
        fcarPanel.add(fcarPrice);
        fcarPanel.add(fcarFuelType);
        fcarPanel.add(fcarNumberOfSeats);
        fcarPanel.add(fcarMileage);

        // -----adding text fields for adding fuelcar
        fcarPanel.add(fcarIDTxt);
        fcarPanel.add(fcarNameTxt);
        fcarPanel.add(fcarBrandTxt);
        fcarPanel.add(fcarPriceTxt);
        fcarPanel.add(fcarFuelTypeTxt);
        fcarPanel.add(fcarNumberOfSeatsTxt);
        fcarPanel.add(fcarMileageTxt);

        // ----adding add button to add fuel car
        fcarPanel.add(fcarAddBtn);

        // -----adding labels for purchasing fuelcar
        fcarPanel.add(puFcarCarID);
        fcarPanel.add(puFcarCarName);
        fcarPanel.add(puFcarCarBrand);
        fcarPanel.add(puFcarCarColor);
        fcarPanel.add(puFcarTransType);
        fcarPanel.add(puFcarDistributorName);
        fcarPanel.add(puFcarPurchaseDate);
        fcarPanel.add(puFcarBookedDate);
        // fcarPanel.add(puFcarBookedDate);

        // ----adding text fields for purchasing fuelcar Txt
        fcarPanel.add(puFcarCarIDTxt);
        fcarPanel.add(puFcarCarNameTxt);
        fcarPanel.add(puFcarCarBrandTxt);
        fcarPanel.add(puFcarCarColorTxt);
        fcarPanel.add(puFcarTransTypeTxt);
        fcarPanel.add(puFcarDistributorNameTxt);

        // ----adding combobox for purchasing fuelcar
        fcarPanel.add(puFcarPurchaseDateYearCbx);
        fcarPanel.add(puFcarPurchaseDateMonthCbx);
        fcarPanel.add(puFcarPurchaseDateDayCbx);
        fcarPanel.add(puFcarBookedDateYearCbx);
        fcarPanel.add(puFcarBookedDateMonthCbx);
        fcarPanel.add(puFcarBookedDateDayCbx);

        // -----adding purchase and display button
        fcarPanel.add(puFcarPurchaseBtn);
        fcarPanel.add(puFcarDisplayBtn);
        fcarPanel.add(dispElectricCar);

        // =======adding items to electric car panel
        ecarPanel.add(ecarhead);

        // ------- adding labels for adding electric car
        ecarPanel.add(ecarID);
        ecarPanel.add(ecarName);
        ecarPanel.add(ecarBrand);
        ecarPanel.add(ecarPrice);
        ecarPanel.add(ecarBatteryCapacity);

        // -----adding textfields for adding electric car
        ecarPanel.add(ecarIDTxt);
        ecarPanel.add(ecarNameTxt);
        ecarPanel.add(ecarBrandTxt);
        ecarPanel.add(ecarPriceTxt);
        ecarPanel.add(ecarBatteryCapacityTxt);

        // -----adding labels for buying electric car
        ecarPanel.add(buEcarCarID);
        ecarPanel.add(buEcarCarName);
        ecarPanel.add(buEcarCarBrand);
        ecarPanel.add(buEcarCarPrice);
        ecarPanel.add(buEcarBatteryWarranty);
        ecarPanel.add(buEcarRange);
        ecarPanel.add(buEcarCarColor);
        ecarPanel.add(buEcarCustomerName);
        ecarPanel.add(buEcarRechargeTime);
        ecarPanel.add(buEcarPurchaseDate);

        // -----adding textfield for buying electric car
        ecarPanel.add(buEcarCarIDTxt);
        ecarPanel.add(buEcarCarNameTxt);
        ecarPanel.add(buEcarCarBrandTxt);
        ecarPanel.add(buEcarCarPriceTxt);
        ecarPanel.add(buEcarBatteryWarrantyTxt);
        ecarPanel.add(buEcarRangeTxt);
        ecarPanel.add(buEcarCarColorTxt);
        ecarPanel.add(buEcarCustomerNameTxt);
        ecarPanel.add(buEcarRechargeTimeTxt);

        // -----adding combobox to purchase date of electric car
        ecarPanel.add(buEcarPurchaseDateYearCbx);
        ecarPanel.add(buEcarPurchaseDateMonthCbx);
        ecarPanel.add(buEcarPurchaseDateDayCbx);

        // -----adding buttons in electric car
        ecarPanel.add(ecarAddBtn);
        ecarPanel.add(puEcarPurchaseBtn);
        ecarPanel.add(puEcarDisplayBtn);
        ecarPanel.add(puEcarSellBtn);
        ecarPanel.add(dispFuelCar);

        // ======ADDING PANELS TO FRAME
        frame.add(ecarPanel);
        frame.add(fcarPanel);
        ecarPanel.add(clear);
        frame.add(clear);

        // ==================================frame properties============
        frame.setLayout(null);
        frame.setSize(600, 820);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(230,230,250));

        //Clear all Button function
        clear.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (fcarIDTxt.getText().equals("") && fcarNameTxt.getText().equals("")
                    && fcarBrandTxt.getText().equals("") && fcarPriceTxt.getText().equals("")
                    && fcarFuelTypeTxt.getText().equals("")
                    && fcarNumberOfSeatsTxt.getText().equals("")
                    && fcarMileageTxt.getText().equals("") && ecarIDTxt.getText().equals("")
                    && ecarNameTxt.getText().equals("")
                    && ecarBrandTxt.getText().equals("") && ecarPriceTxt.getText().equals("")
                    && ecarBatteryCapacityTxt.getText().equals("")
                    && puFcarCarIDTxt.getText().equals("")
                    && puFcarCarNameTxt.getText().equals("")
                    && puFcarCarBrandTxt.getText().equals("")
                    && puFcarCarColorTxt.getText().equals("")
                    && puFcarTransTypeTxt.getText().equals("")
                    && puFcarDistributorNameTxt.getText().equals("")
                    && buEcarCarIDTxt.getText().equals("")
                    && buEcarCarNameTxt.getText().equals("")
                    && buEcarCarBrandTxt.getText().equals("")
                    && buEcarCarPriceTxt.getText().equals("")
                    && buEcarBatteryWarrantyTxt.getText().equals("")
                    && buEcarRangeTxt.getText().equals("")
                    && buEcarCarColorTxt.getText().equals("")
                    && buEcarCustomerNameTxt.getText().equals("")
                    && buEcarRechargeTimeTxt.getText().equals("")) {

                        JOptionPane.showMessageDialog(pane, "no values to clear", "No Values",
                            JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        int result = JOptionPane.showConfirmDialog(pane, "clear??", "Clear",
                                JOptionPane.YES_OPTION);
                        if (result == JOptionPane.YES_OPTION) {
                            clearAll();
                        }

                    }
                }
            });

        dispElectricCar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ecarPanel.setVisible(true);
                    fcarPanel.setVisible(false);
                }
            });

        dispFuelCar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    ecarPanel.setVisible(false);
                    fcarPanel.setVisible(true);
                }
            });

        //add button of fuelcar
        fcarAddBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {

                    if (fcarIDTxt.getText().isEmpty() || fcarNameTxt.getText().isEmpty()
                    || fcarBrandTxt.getText().isEmpty() || fcarPriceTxt.getText().isEmpty()
                    || fcarFuelTypeTxt.getText().isEmpty()
                    || fcarNumberOfSeatsTxt.getText().isEmpty()
                    || fcarMileageTxt.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(pane, "Empty Fields", "Empty ",
                            JOptionPane.ERROR_MESSAGE);
                            clearAll();
                    } else {

                        try {

                            int fcarId = Integer.parseInt(fcarIDTxt.getText());
                            String fcarName = fcarNameTxt.getText();
                            String fcarBrand = fcarBrandTxt.getText();
                            String fcarPrice = fcarPriceTxt.getText();
                            String fcarFuelType = fcarFuelTypeTxt.getText();
                            int fcarNumberOfSeats = Integer
                                .parseInt(fcarNumberOfSeatsTxt.getText());
                            int fcarMileage = Integer.parseInt(fcarMileageTxt.getText());

                            boolean isDuplicate = false;

                            if (fcarNumberOfSeats<1 || fcarId <1|| fcarMileage < 1){
                                JOptionPane.showMessageDialog(pane, "Car ID,Number of seats or Mileage of car cannot be less than 1",
                                    "Error", JOptionPane.ERROR_MESSAGE);                                                     
                            }
                            else{
                                for(Car myCar : alist){
                                    FuelCar fcar = (FuelCar) myCar;
                                    if((fcar.getCarID())==fcarId){
                                        isDuplicate = true;
                                        break;

                                    }
                                }
                                if(isDuplicate==false){
                                    fuelCar = new FuelCar(fcarId,fcarBrand,fcarName,fcarPrice,fcarFuelType,fcarMileage,fcarNumberOfSeats);
                                    int addConfirm = JOptionPane.showConfirmDialog(pane, "are you sure to add?", "Notice", JOptionPane.YES_NO_OPTION);
                                    if (addConfirm == JOptionPane.YES_OPTION){
                                        alist.add(fuelCar);
                                        //System.out.println(alist);
                                        JOptionPane.showMessageDialog(pane, "Fuel car of provided information successfully added", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(pane, "Unable to add", "Unseccessful",JOptionPane.ERROR_MESSAGE);
                                    }
                                }
                                else{
                                    JOptionPane.showMessageDialog(pane, "Fuel car of provided ID has already been Added", "Unsuccessful",JOptionPane.ERROR_MESSAGE); 
                                }

                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(pane, "Invalid input type",
                                "Type Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }

            });
        // add button of electric car
        ecarAddBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (ecarIDTxt.getText().isEmpty() || ecarNameTxt.getText().isEmpty()
                    || ecarBrandTxt.getText().isEmpty() || ecarPriceTxt.getText().isEmpty()
                    || ecarBatteryCapacityTxt.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(pane, "Empty Fields", "Empty ",
                            JOptionPane.ERROR_MESSAGE);
                    } else {

                        try {

                            int ecarId = Integer.parseInt(ecarIDTxt.getText());
                            String ecarName = ecarNameTxt.getText();
                            String ecarBrand = ecarBrandTxt.getText();
                            String ecarPrice = ecarPriceTxt.getText();
                            int ecarBatteryCapacity = Integer
                                .parseInt(ecarBatteryCapacityTxt.getText());

                            boolean isDuplicate = false;
                            
                            if(ecarId <1 || ecarBatteryCapacity < 1){
                                JOptionPane.showMessageDialog(pane, "Car ID or Battery Capacity of car cannot be less than 1",
                                    "Error", JOptionPane.ERROR_MESSAGE);   
                            }
                            else{
                            for(Car myCar : alist){
                                if(myCar instanceof ElectricCar){
                                 ElectricCar ecar = (ElectricCar) myCar;
                                if((ecar.getCarID())==ecarId){
                                    isDuplicate = true;
                                    break;

                                }
                                }
                               
                            }
                            if (isDuplicate ==false){
                                electricCar = new ElectricCar(ecarId,ecarBrand,ecarName,ecarPrice,ecarBatteryCapacity);
                                int addConfirm = JOptionPane.showConfirmDialog(pane, "are you sure to add?", "Notice", JOptionPane.YES_NO_OPTION);
                                if (addConfirm == JOptionPane.YES_OPTION){
                                    alist.add(electricCar);
                                    JOptionPane.showMessageDialog(pane, "Electric car of provided information successfully added", "Successful", JOptionPane.INFORMATION_MESSAGE);
                                }
                                else{
                                    JOptionPane.showMessageDialog(pane, "Unable to add", "Unseccessful",JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(pane, "Electric car of provided id has already been Added", "Unsuccessful",JOptionPane.ERROR_MESSAGE); 
                            }
                        }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(pane, "Invalid input type",
                                "Type Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }

            });
        // purchase button of fuel car
        puFcarPurchaseBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (puFcarCarIDTxt.getText().isEmpty() || puFcarCarNameTxt.getText().isEmpty()
                    || puFcarCarBrandTxt.getText().isEmpty()
                    || puFcarCarColorTxt.getText().isEmpty()
                    || puFcarTransTypeTxt.getText().isEmpty()
                    || puFcarDistributorNameTxt.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(pane, "Empty Fields", "Empty ",
                            JOptionPane.ERROR_MESSAGE);
                        clearAll();
                    } else {
                        int ecarPurchaseConfirm = JOptionPane.showConfirmDialog(pane,
                                "Are you sure to Purchase??",
                                "Add??", JOptionPane.YES_NO_OPTION);
                        if (ecarPurchaseConfirm == JOptionPane.YES_OPTION) {
                            try {

                                int puCarId = Integer.parseInt(puFcarCarIDTxt.getText());
                                String puFcarName = puFcarCarName.getText();
                                String puFcarBrand = puFcarCarBrandTxt.getText();
                                String puFcarColor = puFcarCarColor.getText();
                                String puFcarTransMissionType = puFcarTransType.getText();
                                String puFcarDistributorName = puFcarDistributorNameTxt
                                    .getText();
                                String puFcarPurchaseDateYear = puFcarPurchaseDateYearCbx
                                    .getSelectedItem().toString();
                                String puFcarPurchaseDateMonth = puFcarPurchaseDateMonthCbx
                                    .getSelectedItem().toString();
                                String puFcarPurchaseDateDay = puFcarPurchaseDateDayCbx
                                    .getSelectedItem().toString();
                                String puFcarBookedDateYear = puFcarBookedDateYearCbx
                                    .getSelectedItem().toString();
                                String puFcarBookedDateMonth = puFcarBookedDateMonthCbx
                                    .getSelectedItem().toString();
                                String puFcarBookedDateDay = puFcarBookedDateDayCbx
                                    .getSelectedItem().toString();
                                String purchaseDate = puFcarPurchaseDateYear+" "+ puFcarPurchaseDateMonth+" "+puFcarPurchaseDateDay;
                                String bookedDate = puFcarBookedDateYear+" "+ puFcarBookedDateMonth+" "+puFcarBookedDateDay;
                                boolean isAdded = false;
                                for(Car myCar : alist){

                                    if((myCar.getCarID())==puCarId){
                                        isAdded = true;
                                        break;

                                    }
                                }
                                if(isAdded == true){
                                    for(Car myCar:alist){
                                        if(myCar instanceof FuelCar){
                                            FuelCar fcar = (FuelCar)myCar; //DOWNCAST
                                            if((fcar.getCarID())==puCarId){
                                                if((fcar.getIsPurchased())==false ){
                                                    fcar.Purchase(bookedDate, purchaseDate);
                                                    JOptionPane.showMessageDialog(pane,
                                                        "Fuel car of Provided information successfully Purchased",
                                                        "Purchase Successful",
                                                        JOptionPane.INFORMATION_MESSAGE);  
                                                } 
                                                else{
                                                    JOptionPane.showMessageDialog(pane,
                                                        "Fue car of Provided information has already been Purchased",
                                                        "Purchase Unsuccessful",
                                                        JOptionPane.ERROR_MESSAGE);  
                                                }
                                            }
                                        }
                                    }

                                }
                                else{
                                    JOptionPane.showMessageDialog(pane,
                                        "Electric car of Provided information has not been added",
                                        "Purchase Unsuccessful",
                                        JOptionPane.ERROR_MESSAGE);
                                }

                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(pane, "Invalid input type",
                                    "Type Error", JOptionPane.ERROR_MESSAGE);
                            }

                        }

                        else {
                            clearAll();
                        }
                    }

                }

            });

        //purchase button of electric car
        puEcarPurchaseBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (buEcarCarIDTxt.getText().isEmpty() || buEcarCarNameTxt.getText().isEmpty()
                    || buEcarCarBrandTxt.getText().isEmpty()
                    || buEcarCarPriceTxt.getText().isEmpty()
                    || buEcarBatteryWarrantyTxt.getText().isEmpty()
                    || buEcarRangeTxt.getText().isEmpty()
                    || buEcarCarColorTxt.getText().isEmpty()
                    || buEcarCustomerNameTxt.getText().isEmpty()
                    || buEcarRechargeTimeTxt.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(pane, "Empty Fields", "Empty ",
                            JOptionPane.ERROR_MESSAGE);
                        
                    } else {
                        int ecarPurchaseConfirm = JOptionPane.showConfirmDialog(pane,
                                "Are you sure to Purchase??",
                                "Add??", JOptionPane.YES_NO_OPTION);
                        if (ecarPurchaseConfirm == JOptionPane.YES_OPTION) {
                            try {
                                int buECarId = Integer.parseInt(buEcarCarIDTxt.getText());
                                String buEcarName = buEcarCarNameTxt.getText();
                                String buEcarBrand = buEcarCarBrandTxt.getText();
                                String buEcarPrice = buEcarCarPriceTxt.getText();
                                int buEcarBatteryWarranty = Integer
                                    .parseInt(buEcarBatteryWarrantyTxt.getText());
                                String buEcarRange = buEcarRangeTxt.getText();
                                String buEcarColor = buEcarCarColorTxt.getText();
                                String buEcarCustomerName = buEcarCustomerNameTxt.getText();
                                int buEcarRechargeTime = Integer
                                    .parseInt(buEcarRechargeTimeTxt.getText());
                                String buEcarPurchaseDateYear = buEcarPurchaseDateYearCbx
                                    .getSelectedItem().toString();
                                String buEcarPurchaseDateMonth = buEcarPurchaseDateMonthCbx
                                    .getSelectedItem().toString();
                                String buEcarPurchaseDateDay = buEcarPurchaseDateDayCbx
                                    .getSelectedItem().toString();
                                String buEcarPurchaseDate = buEcarPurchaseDateYear + " " +  buEcarPurchaseDateMonth+" "+ buEcarPurchaseDateDay;
                                boolean isAdded = false;
                                for(Car myCar : alist){

                                    if((myCar.getCarID())==buECarId){
                                        isAdded = true;
                                        break;

                                    }
                                }
                                if(isAdded == true){
                                    for(Car myCar:alist){
                                        if(myCar instanceof ElectricCar){
                                            ElectricCar ecar = (ElectricCar)myCar;
                                            if((ecar.getCarID())==buECarId){
                                                if((ecar.getIsBought())==false ){
                                                    ecar.getBuy(buEcarCustomerName,buEcarBatteryWarranty,buEcarPurchaseDate,buEcarRange,buEcarRechargeTime );
                                                    JOptionPane.showMessageDialog(pane,
                                                        "Electric car of Provided information successfully Purchased",
                                                        "PURCHASE SUCCESSFUL",
                                                        JOptionPane.INFORMATION_MESSAGE);  
                                                } 
                                                else{
                                                    JOptionPane.showMessageDialog(pane,
                                                        "Electric car of Provided information has already been Purchased",
                                                        "Purchase Unsuccessful",
                                                        JOptionPane.ERROR_MESSAGE);  
                                                }
                                            }
                                        }
                                    }

                                }
                                else{
                                    JOptionPane.showMessageDialog(pane,
                                        "Electric car of Provided information has not been added",
                                        "Purchase Unsuccessful",
                                        JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(pane, "Invalid input type",
                                    "Type Error", JOptionPane.ERROR_MESSAGE);
                            }

                        }


                    }

                }

            });

        //sell button of electric car
        puEcarSellBtn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (buEcarCarIDTxt.getText().isEmpty() || buEcarCarNameTxt.getText().isEmpty()
                    || buEcarCarBrandTxt.getText().isEmpty()
                    || buEcarCarPriceTxt.getText().isEmpty()
                    || buEcarBatteryWarrantyTxt.getText().isEmpty()
                    || buEcarRangeTxt.getText().isEmpty()
                    || buEcarCarColorTxt.getText().isEmpty()
                    || buEcarCustomerNameTxt.getText().isEmpty()
                    || buEcarRechargeTimeTxt.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(pane, "Empty Fields", "Empty ",
                            JOptionPane.ERROR_MESSAGE);
                        clearAll();
                    } else {
                        int ecarPurchaseConfirm = JOptionPane.showConfirmDialog(pane,
                                "Are you sure to Sell??",
                                "Sell??", JOptionPane.YES_NO_OPTION);
                        if (ecarPurchaseConfirm == JOptionPane.YES_OPTION) {
                            try {
                                int buECarId = Integer.parseInt(buEcarCarIDTxt.getText());
                                String buEcarName = buEcarCarNameTxt.getText();
                                String buEcarBrand = buEcarCarBrandTxt.getText();
                                String buEcarPrice = buEcarCarPriceTxt.getText();
                                int buEcarBatteryWarranty = Integer
                                    .parseInt(buEcarBatteryWarrantyTxt.getText());
                                String buEcarRange = buEcarRangeTxt.getText();
                                String buEcarColor = buEcarCarColorTxt.getText();
                                String buEcarCustomerName = buEcarCustomerNameTxt.getText();
                                int buEcarRechargeTime = Integer
                                    .parseInt(buEcarRechargeTimeTxt.getText());
                                String buEcarPurchaseDateYear = buEcarPurchaseDateYearCbx
                                    .getSelectedItem().toString();
                                String buEcarPurchaseDateMonth = buEcarPurchaseDateMonthCbx
                                    .getSelectedItem().toString();
                                String buEcarPurchaseDateDay = buEcarPurchaseDateDayCbx
                                    .getSelectedItem().toString();
                                String buEcarPurchaseDate = buEcarPurchaseDateYear + " " +  buEcarPurchaseDateMonth+" "+ buEcarPurchaseDateDay;
                                boolean isAdded = false;
                                for(Car myCar : alist){

                                    if((myCar.getCarID())==buECarId){
                                        isAdded = true;
                                        break;

                                    }
                                }
                                if(isAdded == true){
                                    for(Car myCar:alist){
                                        if(myCar instanceof ElectricCar){
                                            ElectricCar ecar = (ElectricCar)myCar;
                                            if((ecar.getCarID())==buECarId){
                                                if((ecar.getIsSold())==false ){
                                                    ecar.sell(buEcarCustomerName);
                                                    JOptionPane.showMessageDialog(pane,
                                                        "Electric car of Provided information successfully Sold",
                                                        "Sell SUCCESSFUL",
                                                        JOptionPane.INFORMATION_MESSAGE);  
                                                } 
                                                else{
                                                    JOptionPane.showMessageDialog(pane,
                                                        "Electric car of Provided information has already been sold",
                                                        "Sell Unsuccessful",
                                                        JOptionPane.ERROR_MESSAGE);  
                                                }
                                            }
                                        }
                                    }

                                }
                                else{
                                    JOptionPane.showMessageDialog(pane,
                                        "Electric car of Provided information has not been added",
                                        "Sell Unsuccessful",
                                        JOptionPane.ERROR_MESSAGE);
                                }
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(pane, "Invalid input type",
                                    "Type Error", JOptionPane.ERROR_MESSAGE);
                            }

                        }

                    }

                }

            });

        //Display of FuelCar
        puFcarDisplayBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(alist.isEmpty()){
                        JOptionPane.showMessageDialog(pane,"No entries to Display","No Entries",JOptionPane.INFORMATION_MESSAGE);    
                    }   
                    else{
                        for(Car myCar : alist){
                            if(myCar instanceof FuelCar){
                                FuelCar fcar = (FuelCar)myCar;
                                fcar.display();
                            }
                        }
                    }
                }
            });
        //Display of Electric Car
        puEcarDisplayBtn.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    if(alist.isEmpty()){
                        JOptionPane.showMessageDialog(pane,"No entries to Display","No Entries",JOptionPane.INFORMATION_MESSAGE);    
                    }   
                    else{
                        for(Car myCar : alist){
                            if(myCar instanceof ElectricCar){
                                ElectricCar ecar = (ElectricCar)myCar;
                                ecar.displayElectricCar();
                            }
                        }
                    }
                }
            });

    }
    

    public void clearAll() {
        fcarIDTxt.setText("");
        fcarNameTxt.setText("");
        fcarBrandTxt.setText("");
        fcarPriceTxt.setText("");
        fcarFuelTypeTxt.setText("");
        fcarNumberOfSeatsTxt.setText("");
        fcarMileageTxt.setText("");
        puFcarCarIDTxt.setText("");
        puFcarCarNameTxt.setText("");
        puFcarCarBrandTxt.setText("");
        puFcarCarColorTxt.setText("");
        puFcarTransTypeTxt.setText("");
        puFcarDistributorNameTxt.setText("");
        ecarIDTxt.setText("");
        ecarNameTxt.setText("");
        ecarBrandTxt.setText("");
        ecarPriceTxt.setText("");
        ecarBatteryCapacityTxt.setText("");
        buEcarCarIDTxt.setText("");
        buEcarCarNameTxt.setText("");
        buEcarCarBrandTxt.setText("");
        buEcarCarPriceTxt.setText("");
        buEcarBatteryWarrantyTxt.setText("");
        buEcarRangeTxt.setText("");
        buEcarCarColorTxt.setText("");
        buEcarCustomerNameTxt.setText("");
        buEcarRechargeTimeTxt.setText("");
    }

    public static void main(String[] args) {
        new GUI_Demo();
    }

}