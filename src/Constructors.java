public class Constructors {
    public static void main(String[]args){
    Students s1 = new Students("BAli");
        System.out.println(s1.name);
    }
}

class Students{
    String name;
    int roll;

    Students(String name){
        // this is constuctor
        this.name = name;
        System.out.println("constructor is called");
    }
}
