/*
Loops:
1- For
2- While
3- Do -While
*/


// for usage 
 int sum = 0;

  for (int i = 1; i <= 10; i++) {
    sum += i;
  }
  System.out.println("Toplam: " + sum);

// while usage
int number = 5;
int factorial = 1;

while (number > 0) {
    factorial *= number;
    number--;
}            
System.out.println("Faktöriyel: " + factorial);


//do-while usage 
int i=0;
do
  {
    System.out.println(i);
    i++;
  }while(i<=10);



//infinite for loop : 
for (;;) {}

//infinite while loop:
while (true){ 
  // statement 
}

//nested loopS:
for(int i = 0; i < 3; i++){
    for(int j = 0; j < 2; j++){
            System.out.println(i);
    }
          System.out.println();
}

//for-each loop : 
String array[] = { "Ron", "Harry", "Hermoine" };
for (String x : array) {
  System.out.println(x);
}



// Example (For-each)
// for-each loop 
class For_Each      
{ 
    public static void main(String[] arg) 
    { 
        { 
            int[] marks = { 125, 132, 95, 116, 110 }; 
              
            int highest_marks = maximum(marks); 
            System.out.println("The highest score is " + highest_marks); 
        } 
    } 
    public static int maximum(int[] numbers) 
    {  
        int maxSoFar = numbers[0]; 
          
        // for each loop 
        for (int num : numbers)  
        { 
            if (num > maxSoFar) 
            { 
                maxSoFar = num; 
            } 
        } 
    return maxSoFar; 
    } 
} 


//return keyword: It is used to exit from a method, with or without a value. 
void demofunction(double j)
    {
        if (j < 9)
            return;
        ++j;
    } 
public static void main(String[] args)
    {
        GFG gfg = new GFG();
        // Calling above method declared in above class
        gfg.demofunction(5.5);
 
        // Display message on console to illustrate
        // successful execution of program
        System.out.println("Program executed successfully");
    }      // output: 6.0 

