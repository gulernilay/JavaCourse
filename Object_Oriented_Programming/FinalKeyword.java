package Object_Oriented_Programming;



public class FinalKeyword {


    public static void main(String[] args) {
        final int max_size=100; // final variables
        // max_size = 200; // Compilation error: cannot assign a value to final variable MAX_VALUE
        System.out.println(max_size);
    }
}


class Animal {
    final void makeSound() {  // final methods can't be overriden.
        System.out.println("Animal sound");
        }
}

class Dog extends Animal {
    // Compilation error: cannot override final method from Animal
    // void makeSound() {
    //     System.out.println("Bark");
    // }
}
final class Immutable {
    private int value;

    Immutable(int value) { // constructor
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
// Compilation error: cannot inherit from final Immutable
// class ExtendedImmutable extends Immutable {
//     ExtendedImmutable(int value) {
//         super(value);
//     }
// }





/*
Final keyword is used for variables,classes,methods which can't be modified once it is initialized
A final class cannot be subclassed.
Final variables can't be changed
Final methods can't be overriden.
 */
