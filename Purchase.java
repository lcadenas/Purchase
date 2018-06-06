import java.util.Scanner;
import java.text.NumberFormat;

public class Purchase
{
    public static void main(String[] arg)
    {
      final double TAX_RATE = 0.06;
      
      int quantity;
      double unitprice, subtotal, tax, totalcost;
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the quantity: ");
      quantity = input.nextInt();
      
      System.out.print("Enter the unit price: ");
      unitprice = input.nextDouble();
      
      subtotal = quantity * unitprice;
      
      tax = TAX_RATE* subtotal;
      
      totalcost = subtotal + tax;
      
      NumberFormat fmt2 = NumberFormat.getPercentInstance();
      NumberFormat fmt3 = NumberFormat.getCurrencyInstance();
      
      System.out.println("Subtotal: " + fmt3.format(subtotal)+ "\nTax: " + fmt3.format(tax)+ " @ " + fmt2.format(TAX_RATE)+ 
                        "\nTotal: " + fmt3.format(totalcost));
      
      
    }
}
