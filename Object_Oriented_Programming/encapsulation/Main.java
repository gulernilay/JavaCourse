package Object_Oriented_Programming.encapsulation;

// Java program to demonstrate encapsulation

class Main2{

    // private variables can be accessible only by class inside.
    private String geekName;
    private int geekRoll;
    private int geekAge;

    // etter and getter methods
    public int getAge() { return geekAge; }
    public String getName() { return geekName; }
    public int getRoll() { return geekRoll; }
    public void setAge(int newAge) { geekAge = newAge; }
    public void setName(String newName){ geekName = newName; }
    public void setRoll(int newRoll) { geekRoll = newRoll; }
}

// Class to access variables
// of the class Encapsulate
public class Main {
    public static void main(String[] args)
    {
        Main2 obj = new Main2 ();

        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);

        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());

    }
}
