//program to demonstrate singleton design pattern using lazy instantiation

class Test
{
  private static Test obj;
  
  private Test(){};
  
  public static Test getObj()
   {
     obj=new Test();
     return obj;
   }
   public void doSomething()
    {
       System.out.println("singleton program");
    }
}