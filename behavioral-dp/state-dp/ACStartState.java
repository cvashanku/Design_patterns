//create concrete classes implementing the same interface

public class ACStartState implements State
{
  public void doAction()
  {
    System.out.println("AC is turned ON");
  }
}