import java.util.HashSet;
import java.util.Set;

public abstract class Food
{
  protected double billPerPerson;
  protected Set<String>items;
  public Food(double billPerPerson)
    {
      this.billPerPerson=billPerPerson;
      this.items=new HashSet<>();
    }
    public double getBill()
     {
        return billPerPerson;
     }
}