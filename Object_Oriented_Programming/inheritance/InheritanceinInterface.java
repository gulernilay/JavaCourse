package Object_Oriented_Programming.inheritance;
import java.io.*;

interface intfA {
    void geekName();
}

interface intfB extends intfA {
    void geekInstitute();
}
interface intfC extends intfA, intfB {  // extends multiple interfaces
    void geekBranch();
}


// class implements both interfaces and provides
// implementation to the method.
class InheritanceinInterface implements intfB {
    @Override public void geekName()
    {
        System.out.println("Rohit");
    }

    @Override public void geekInstitute()
    {
        System.out.println("JIIT");
    }

    public static void main(String[] args)
    {
        InheritanceinInterface ob1 = new InheritanceinInterface();

        // calling the method implemented
        // within the class.
        ob1.geekName();
        ob1.geekInstitute();
    }
}


