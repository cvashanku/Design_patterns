//Create concrete classes extending the above class

public class Circle extends Shape 
 {
   public Circle()
    {
      type="Circle";
    }

   public void draw() 
    {
      System.out.println("Inside Circle::draw() method");
    }
 }