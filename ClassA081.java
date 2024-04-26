package CoreJava;

public class ClassA081 
{
    String name;  // Declare an instance variable 'name' of type String
    
    ClassA081() 
    {  // Default constructor
        this("Abdul Kalam Azad");  // Call the parameterized constructor with the argument "Abdul Kalam Azad"
        this.display();  // Call the display() method
    }
    
    ClassA081(String name) 
    {  // Parameterized constructor
        this.name = name;  // Assign the value of the 'name' parameter to the 'name' instance variable
    }
    
    void display() 
    {  // Method to display the value of 'name'
        System.out.println("person name is: " + name);  // Print the value of 'name'
    }
    
    public static void main(String[] args) 
    {
        ClassA081 obj = new ClassA081();  // Create a new instance of ClassA081 using the default constructor
    }
}
