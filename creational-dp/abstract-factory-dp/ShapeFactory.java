//Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.

public class ShapeFactory extends AbstractFactory
{ 
  public Shape getShape(String shapeType)
   {
     if(shapeType.equalsIgnoreCase("RECTANGLE"))
       {
         return new Rectangle();
       }
      else if(shapeType.equalsIgnoreCase("SQUARE"))
       {
          return new Square();
       }
       return null;
   }
}



//The equalsIgnoreCase() method compares two strings, ignoring lower case and upper case differences.

//This method returns true if the strings are equal, and false if not.