package Object_Oriented_Programming.inheritance;

interface Methods {
    void participateInActivity(String activity);
    void organizeActivity(String activity );
}
class Person{ // Superclass
    public String name ;
    protected String address;
    public int age;

    public Person(String name,String address,int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void display(){
        System.out.println("Here are the person details:");
        System.out.println("The name of person"+ name+ "The age of person :" + age + "The address of person :" + address);
    }

    public static void main(String[] args) {
        Person p1=new Person("Nilay","252 sokak",12);
        p1.display();
        Student s1=new Student("Ali","klfdj",34,5,2,5);
        s1.display();
        p1.setAddress("45 sokak ");
        p1.display();

        s1.participateInActivity("Math Olympiad");
        s1.organizeActivity("Science Fair");
    }
}
class Student extends Person implements Methods{
    int studentID;
    int courseEnrolled;
    int yearOfStudy;

    Student(String name,String address,int age,int studentID,int courseEnrolled,int yearOfStudy){
        super(name,address,age);
        this.studentID=studentID;
        this.yearOfStudy=yearOfStudy;
        this.courseEnrolled=courseEnrolled;
    }
    @Override
    public void participateInActivity(String activity) {
        System.out.println(name + " (Student) is participating in " + activity);
    }

    @Override
    public void organizeActivity(String activity) {
        System.out.println(name + " (Student) is organizing " + activity);
    }
    @Override
    public void display() {
        System.out.println("Here are the student details");
        System.out.println("The name of person"+ name+ "The age of person :" + age + "The address of person :" + address + "student id:" + studentID + "course enrolled : " + courseEnrolled + "Year of study:" + yearOfStudy);
    }
}

    class Teacher extends Person implements Methods{
        int teacherID;
        int subjectTaught;
        int yearsOfExperience;

        Teacher(String name,String address,int age,int teacherID,int subjectTaught,int yearsOfExperience){
            super(name,address,age);
            this.teacherID=teacherID;
            this.yearsOfExperience=yearsOfExperience;
            this.subjectTaught=subjectTaught;

        }
        @Override
        public void participateInActivity(String activity) {
            System.out.println(name + " (Teacher) is participating in " + activity);
        }

        @Override
        public void organizeActivity(String activity) {
            System.out.println(name + " (Teacher) is organizing " + activity);
        }

        @Override
        public void display() {
            System.out.println("Here are the teacher details");
            System.out.println("The name of person"+ name+ "The age of person :" + age + "The address of person :" + address + "teacher id:" + teacherID + "course taught : " + subjectTaught + "Year of experience:" + yearsOfExperience);
        }
    }



