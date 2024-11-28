import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        //Car c1 = new Car(); // Creating the object c1
        //c1.brand ="Toyota";
        //c1.model = 5069;
        //c1.amountOfFuel = 10;
        //c1.printData();  // calling printData method
        //c1.brake();      // calling brake method
        //c1.accelerate(); // calling accelerate method
        //c1.printData();  // calling printData method
        //c1.refule(5);  // calling refule method

       // Car c2 = new Car("Audi", 329, 5, 5000);    // Creating the another object c2 and passing the arguments
        //c2.accelerate(); 


/*         Bus b1 = new Bus();
        b1.brand = "TVTV";
        b1.model = 764;
        b1.amountOfFuel = 15;
        b1.price = 1200; */
        UserInput User = new UserInput();  // creating User object 
        Bus b1 = new Bus(); // creating object bus
        System.out.print("B for class 'Bus' and C for class 'Car': ");  // asking with user what class he/she want's to use
        String value = scr.nextLine().toLowerCase();


        String w = User.askBrand();  
        String x = User.askModel();
        int y = User.askFuel();
        int z = User.askPrice();
        String m = User.askEngine();

        if(value.equals("b"))   // if user select bus class
        {
            b1.brand = w;
            b1.model =x;
            b1.amountOfFuel =y;
            b1.price = z;
            b1.Enginetype = m;

            b1.accelerate();
            b1.brake();
            b1.printData();
            b1.mobil();   
        }
        else if(value.equals("c")) // if user select car class
        {
            Car c1 = new Car(w, x, y, z ,m);
            c1.accelerate();
            c1.brake();
            c1.printData(); 
            c1.mobil();
        }


    }
}

interface Permision  // creating interface called permision
{
    void brake();
    void accelerate();
    void printData();
    void mobil();
}

// creating the class car
class Car implements Permision{
    // passing some attributes in car class
    String brand;
    String model;
    String Enginetype;
    int amountOfFuel;
    int price;
    // creating a parameterless constructor
    Car()
    {
        this.brand = null;
        this.amountOfFuel =0;
        this.model = null;
        this.price = 0;
        this.Enginetype=null;
    }
    // creating a paramatarized constructor
    Car(String brands, String models, int amountOfFuels, int p, String types)
    {
        this.brand = brands;
        this.model = models;
        this.amountOfFuel = amountOfFuels;
        this.price = p;
        this.Enginetype =types;
    }
    // creating a printData method which print the data
    public void printData()
    {
        System.out.println("Car brand = "+this.brand);
        System.out.println("Car model = "+this.model);
        System.out.println("Car amount of fuel = "+this.amountOfFuel);
        System.out.println("Car price = " + this.price);
        System.out.println("Enginetype ="+this.Enginetype);
    }
    //creating a brake method
    public void brake()
    {
        System.out.println("Car is breaking.");
    }
    //creating a accelerate method
    public void accelerate()
    {
        if(amountOfFuel> 0)
        {
            System.out.println("Car is accelerating.");
            amountOfFuel = amountOfFuel - 1;
        }
    }
    //creating a refule method which helps to refule the tank
    public void refule(int refule)
    {
        System.out.println("Fuel on the tank: " + amountOfFuel);
        System.out.println("Refule :" + refule);
        System.out.println("Fuel on the tank after the refule: " + (amountOfFuel+ refule));
    }
    public void mobil()  //creating method mobil
    {
        System.out.println("Car need service.");
    }
} 

class Bus extends Car
{
    public void printData()
    {
        System.out.println("Bus brand = "+this.brand);
        System.out.println("Bus model = "+this.model);
        System.out.println("Bus amount of fuel = "+this.amountOfFuel);
        System.out.println("Bus price = " + this.price);
        System.out.println("Enginetype ="+this.Enginetype);
    }
    public void brake()
    {
        System.out.println("Bus is breaking.");
    }
    public void accelerate()
    {
        if(amountOfFuel> 0)
        {
            System.out.println("Bus is accelerating.");
            amountOfFuel = amountOfFuel - 1;
        }
    }
    public void mobil()
    {
        System.out.println("Bus need service.");
    }
}


class UserInput
{
    Scanner scr = new Scanner(System.in);
    public String askBrand()  // asking brand name to user
    {
        System.out.print("Enter the brand name    :");
        String brand = scr.nextLine();
        return brand;
    }
    public String askModel()  // asking model to user
    {
        System.out.print("Enter the model name    :");
        String model = scr.nextLine();
        return model;
    }
    public int askFuel()  // asking amount of fuel with user
    {
        System.out.print("Enter the amount of fuel:");
        String a = scr.nextLine();
        int fuel = Integer.parseInt(a);
        return fuel;
    }
    public int askPrice()   // asking price with user
    {
        System.out.print("Enter the price         :");
        String p = scr.nextLine();
        int price = Integer.parseInt(p);
        return price;
    }
    public String askEngine()   // asking price with user
    {
        System.out.print("Enter the engine type   :");
        String engine = scr.nextLine();
        return engine;
    }
    
}