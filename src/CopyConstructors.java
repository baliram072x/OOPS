public class CopyConstructors {
    public static void main(String[]args){
    Stu s1 = new Stu();
    s1.name = "samrudhii";
    s1.roll = 456;
    s1.password = "abcd";
    s1.marks[0]= 100;
    s1.marks[1]=80;
    s1.marks[2] = 90;

    Stu s2 = new Stu(s1);
    s2.password = "xyz";
    s1.marks[2] = 100;
    for (int i=0; i<3; i++){
        System.out.println(s2.marks[i]);
    }


    }
}

class Stu{
    String name;
    int roll;
    String password;
    int marks[];

    Stu(Stu s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;

    }

    Stu(){
        marks = new int[3];
        System.out.println("constructor is called");
    }
    Stu(String name){
        // this is constuctor
        marks = new int[3];
        this.name = name;
    }
    Stu(int roll){
        marks = new int[3];
        this.roll  = roll;
    }


}
