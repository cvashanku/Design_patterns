//program to demonstrate singleton design pattern using lazy instantiation

class Test
{
  private static Test obj;
  
  private Test(){};
  
  public static Test getObj()
   {
     if(obj==null)
       {
         synchronized(Test.class)
          {
            if(obj==null)
              {
                obj=new Test();
              }
          }
       }
     return obj;
   }
   public void doSomething()
    {
       System.out.println("singleton program2");
    }
}