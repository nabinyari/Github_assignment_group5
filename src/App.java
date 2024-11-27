public class App {
    public static void main(String[] args) throws Exception {
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

        Bus b1 = new Bus();
        b1.brand = "TVTV";
        b1.model = 764;
        b1.amountOfFuel = 15;
        b1.price = 1200;
        b1.accelerate();
        b1.brake();
        b1.printData();

    }
}

// creating the class car
class Car{
    // passing some attributes in car class
    String brand;
    int model;
    int amountOfFuel;
    int price;
    // creating a parameterless constructor
    Car()
    {
        this.brand = null;
        this.amountOfFuel =0;
        this.model =0;
        this.price = 0;
    }
    // creating a paramatarized constructor
    Car(String brands, int models, int amountOfFuels, int p)
    {
        this.brand = brands;
        this.model = models;
        this.amountOfFuel = amountOfFuels;
        this.price = p;
        System.out.println("Car brand = "+this.brand);
        System.out.println("Car model = "+this.model);
        System.out.println("Car amount of fuel = "+this.amountOfFuel);
        System.out.println("Car price = " + this.price);
    }
    // creating a printData method which print the data
    public void printData()
    {
        System.out.println("Car brand = "+this.brand);
        System.out.println("Car model = "+this.model);
        System.out.println("Car amount of fuel = "+this.amountOfFuel);
        System.out.println("Car price = " + this.price);
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
} 

class Bus extends Car
{
    public void printData()
    {
        System.out.println("Bus brand = "+this.brand);
        System.out.println("Bus model = "+this.model);
        System.out.println("Bus amount of fuel = "+this.amountOfFuel);
        System.out.println("Bus price = " + this.price);
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
}