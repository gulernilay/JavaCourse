package Object_Oriented_Programming.Constructor;

public class ConstructorOverloading {
    double width, height, depth;
    int boxNo;
    ConstructorOverloading(double w, double h, double d ,int num) {
        width = w;
        height = h;
        depth = d;
        boxNo = num;
    }
    // constructor used when no dimensions specified
    ConstructorOverloading() { width = height = depth = 0; }

    // constructor used when cube is created
    ConstructorOverloading(double len) { width = height = depth = len; }


    // constructor used when only boxNo specified
    ConstructorOverloading(int num) {
        // this() is used for calling the default
        // constructor from parameterized constructor
        this();

        boxNo = num;
    }



    public static void main(String[] args) {
        // create boxes using the various
        // constructors
        ConstructorOverloading mybox1 = new ConstructorOverloading(10, 20, 15,55);
        ConstructorOverloading mybox2 = new ConstructorOverloading();
        ConstructorOverloading mycube = new ConstructorOverloading(7);

    }
}

/*
If we have defined any parameterized constructor, then the compiler will not create a default constructor. and vice versa if we don’t define any constructor, the compiler creates the default constructor(also known as no-arg constructor) by default during compilation
 */

















/*
Sometimes there is a need of initializing an object in different ways. This can be done using constructor overloading.
 */