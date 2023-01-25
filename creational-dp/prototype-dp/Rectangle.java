//Create concrete classes extending the above class

public class Rectangle extends Shape 
 {
   public Rectangle()
    {
      type="Rectangle";
    }

   public void draw() 
    {
      System.out.println("Inside Rectangle::draw() method.");
    }
 }