//program to demonstrate singleton design pattern using lazy instantiation

class main
{
  public static void main(String args[])
    {
      Test object=Test.getObj();
      object.doSomething();
    }
}
