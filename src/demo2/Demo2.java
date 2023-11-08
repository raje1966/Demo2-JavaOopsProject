package demo2;

class Car 
{
    String name;
    int price;
    int mileage;
    
    public void set_details(String setName, int setPrice, int setMileage) 
    {
        name = setName;
        price = setPrice;
        mileage = setMileage;
        
    }
    
    public String getName() 
    {
        return name;
    }
    public int getPrice() 
    {
        return price;
    }
    public int getMileage() 
    {
        return mileage;
    }
}
public class Demo2 {
    

    public static void main(String[] args) {
    
        Car wagonR = new Car();
        wagonR.set_details("WagonR", 600000, 12);
        System.out.println(wagonR.getName());
        System.out.println(wagonR.getPrice());
        System.out.println(wagonR.getMileage());
        
    }
    
}
