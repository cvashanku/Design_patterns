public class ACRemoteTest
{
  public static void main(String args[])
  {
    ACContext acContext=new ACContext();
    State acStartState=new ACStartState();
    acContext.setState(acStartState);
    acContext.doAction();
    System.out.println("-----------------");
    State acStopState=new ACStopState();
    acContext.setState(acStopState);
    acContext.doAction();
  }
}