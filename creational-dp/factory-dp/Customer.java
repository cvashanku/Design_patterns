public class Customer
{
  public static void main(String args[])
    {
       Food customer1Food=FoodServer.getFood("Veg");
       System.out.println("customer1");
       System.out.println("Items:"+customer1Food.getItems().toString());
       System.out.println("Bill:"+customer1Food.getBill());

       Food customer2Food=FoodServer.getFood("Veg");
       System.out.println("customer1");
       System.out.println("Items:"+customer2Food.getItems().toString());
       System.out.println("Bill:"+customer2Food.getBill());
    }
}