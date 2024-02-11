import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalCost = 0;
        double shipCost = 0;
        final double FREE_SHIPPING  = 100.00;
        final double SHIPPING_COST = 0.02;
        System.out.print("What is the price of your item: ");
        itemPrice = in.nextDouble();
        if(itemPrice >= FREE_SHIPPING)
        {
            System.out.println("Shipping is free!");
            System.out.println("Your total cost is " + itemPrice);
        }
        else
        {
            shipCost = itemPrice * SHIPPING_COST;
            System.out.println("Shipping cost is " + shipCost);
            totalCost = shipCost + itemPrice;
            System.out.println("Your total cost is " + totalCost);
        }

    }
}