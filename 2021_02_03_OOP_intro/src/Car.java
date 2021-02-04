public class Car {
   int wheels = 4;
   int mileAge;
   String color;
   String carID;
   int doors;
   String brandName;
   String label;
   boolean registration;

   public void move(int distance){
       System.out.println("Let's go");
       mileAge += distance; //==//mileAge = mileAge + distance
   }
   public void recolor (String newColor){
       color = newColor;
   }
   public void displayInfo(){
       System.out.println("Kolvo kolesa " + wheels);
       System.out.println("Kilometr " + mileAge);
       System.out.println("Color car " + color);
       System.out.println("ID " + carID);
       System.out.println("dveri " + doors);
       System.out.println("brand " + brandName);
       System.out.println("label " + label);
       System.out.println("Registr" + (registration?" yes":" no"));
   }
}
class TestCar{
    public static void main(String[] args) {
        Car car = new Car();
        Car toyota = new Car();
        Car porsche = new Car();
        //System.out.println(porsche.brandName);
        //System.out.println(porsche.doors);
        //System.out.println(porsche.registration);
        porsche.move(1200);
        //System.out.println(porsche.mileAge);
        //System.out.println(porsche.wheels);
        porsche.registration = true;
        porsche.color = "Yellow";
        porsche.recolor("Pink");
        porsche.displayInfo();
        porsche.recolor("Green");
        porsche.displayInfo();


    }
}
