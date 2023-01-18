//Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.

public class RoundedShapeFactory extends AbstractFactory
{
  public Shape getShape(String shapeType)
    {
      if(shapeType.equalsIgnoreCase("RECTANGLE"))
       {
         return new RoundedRectangle();
       }
      else if(shapeType.equalsIgnoreCase("SQUARE"))
       {
         return new RoundedSquare();
       }
       return null;
    }
}