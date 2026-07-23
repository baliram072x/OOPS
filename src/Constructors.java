public class Constructors {
    public static void main(String[]args){
    Students s1 = new Students("BAli");
    Students s2 = new Students();
    Students s3 = new Students(123);
    }
}

class Students{
    String name;
    int roll;
//parameterized constructors
    Students(){
        System.out.println("constructor is called");
    }
    Students(String name){
        // this is constuctor
        this.name = name;

    }

    Students(int roll){
        this.roll  = roll;
    }
}

// Type of Constructors
// non parametarized
// parameterized
//copy constructor

