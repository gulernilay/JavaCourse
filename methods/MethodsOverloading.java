/*
In Java, Method Overloading allows different methods to have the same name, but different signatures where the signature can differ by the number of input parameters or type of input parameters, or a mixture of both.
Different Ways of Method Overloading in Java:
Changing the Number of Parameters.
Changing Data Types of the Arguments.
Changing the Order of the Parameters of Methods


class Sum {
    // Overloaded sum(). This sum takes two int parameters 
    public int sum(int x, int y) { return (x + y); } 
  
    // Overloaded sum(). This sum takes three int parameters 
    public int sum(int x, int y, int z) { return (x + y + z); } 
  
    // Overloaded sum(). This sum takes two double  parameters 
    public double sum(double x, double y) { return (x + y); } 

    public static void main(String args[]) { 
        Sum s = new Sum(); 
        System.out.println(s.sum(10, 20)); 
        System.out.println(s.sum(10, 20, 30)); 
        System.out.println(s.sum(10.5, 20.5)); 
    } 
}
*/
