package Package;

import java.util.Vector;
public class Main2 {
    // java.util.Vector is imported, hence we are
    // able to access directly in our code.
    Vector newVector = new Vector();

    // java.util.ArrayList is not imported, hence
    // we were referring to it using the complete
    // package.
    java.util.ArrayList newList = new java.util.ArrayList();


    public static void main(String arg[])
    {
        new Main2();
    }

}

/*
Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces. Packages are used for:
Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee
Making searching/locating and usage of classes, interfaces, enumerations and annotations easier
Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.
Packages can be considered as data encapsulation (or data-hiding).
All we need to do is put related classes into packages. After that, we can simply write an import class from existing packages and use it in our program. A package is a container of a group of related classes where some of the classes are accessible are exposed and others are kept for internal purpose. We can reuse existing classes from the packages as many time as we need it in our program.
How packages work?

Package names and directory structure are closely related. For example if a package name is college.staff.cse, then there are three directories, college, staff and cse such that cse is present in staff and staff is present inside college. Also, the directory college is accessible through CLASSPATH variable, i.e., path of parent directory of college is present in CLASSPATH. The idea is to make sure that classes are easy to locate. Package naming conventions : Packages are named in reverse order of domain names, i.e., org.geeksforgeeks.practice. For example, in a college, the recommended convention is college.tech.cse, college.tech.ee, college.art.history, etc.

Subpackages: Packages that are inside another package are the subpackages. These are not imported by default, they have to imported explicitly. Also, members of a subpackage have no access privileges, i.e., they are considered as different package for protected and default access specifiers. Example :
import java.util.*;
util is a subpackage created inside java package.


// import the Vector class from util package.
import java.util.vector;

// import all the classes from util package
import java.util.*;

// All the classes and interfaces of this package
// will be accessible but not subpackages.
import package.*;

// Only mentioned class of this package will be accessible.
import package.classname;

// Class name is generally used when two packages have the same
// class name. For example in below code both packages have
// date class so using a fully qualified name to avoid conflict
import java.util.Date;
import my.package.Date;



Built-in Packages These packages consist of a large number of classes which are a part of Java API.Some of the commonly used built-in packages are: 1) java.lang: Contains language support classes(e.g classed which defines primitive data types, math operations). This package is automatically imported. 2)  java.io: Contains classed for supporting input / output operations. 3)  java.util: Contains utility classes which implement data structures like Linked List, Dictionary and support ; for Date / Time operations. 4)  java.applet: Contains classes for creating Applets. 5)  java.awt: Contain classes for implementing the components for graphical user interfaces (like button , ;menus etc). 6)  java.net: Contain classes for supporting networking operations. User-defined packages These are the packages that are defined by the user. First we create a directory myPackage (name should be same as the name of the package). Then create the MyClass inside the directory with the first statement being the package names.
The only time we need to pay attention to packages is when we have a name conflict . For example both, java.util and java.sql packages have a class named Date. So if we import both packages in program as follows:
import java.util.*;
import java.sql.*;

//And then use Date class, then we will get a compile-time error :

Date today ; //ERROR-- java.util.Date or java.sql.Date?


 */
