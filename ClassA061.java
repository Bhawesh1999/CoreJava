package CoreJava;

public class ClassA061 
{
    // Method that takes an integer parameter
    void meth1(int units) 
    {
        int bill = units * 100; // Calculate the bill by multiplying units by 100
        if (bill >= 1000) 
        { // Check if the bill is greater than or equal to 1000
            int discount = (bill / 100) * 10; // Calculate the discount as 10% of the bill
            System.out.println("your final bill is:" + (bill - discount));
            // Print the final bill after deducting the discount
            System.out.println("congratulation you saved :" + discount + " on your final bill");
            // Print the amount saved on the final bill
        } else 
        {
            System.out.println("your final bill is:" + bill);
            // If the bill is less than 1000, print the final bill without any discount
        }
        System.out.println("you will get 10% discount if you shop for more" + (10000 - bill));
        // Print the amount needed to reach a total bill of 10000 to avail a 10% discount
    }

    public static void main(String[] args) 
    {
        new ClassA061().meth1(12);
        // Create an anonymous object of ClassA061 and call meth1 method with argument 12
    }
}
