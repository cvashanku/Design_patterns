

public class ACContext implements State
{
  private State state;
  public void setState(State state)
  {
    this.state=state;
  }
  public State getState()
  {
    return state;
  }
  public void doAction()
  {
    state.doAction();
  }
}