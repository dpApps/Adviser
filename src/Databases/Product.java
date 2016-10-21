package Databases;

/**
 * Created by Павел on 18.10.2016.
 */
public class Product  {
    private int id;
    private String name;



   public Product(){}

   public Product(String name){
       this.name = name;
   }
    public String toString(){
        return name;
    }
}
