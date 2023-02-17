//create concrete classes implementing the same interface

public class ACStopState implements State
{
  public void doAction()
  {
    System.out.println("AC is turned OFF");
  }
}