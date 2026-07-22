

public class OOPS{
    public static void main(String[] args) {
        Pen p1 = new Pen(); // constructor and we created a object name p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calcPercentage(50, 90, 76, "Baliram");
    }

}

class Pen{
// properties and functions
int tip;
String color;

void setColor(String newColor){
    color = newColor;
}

void setTip(int newTip){
    tip = newTip;
}

}

class Student {
    String name;
    String age;
    float percentage;

    void calcPercentage(int phy , int chem , int math , String name ){
        percentage = (phy+chem+math)/3;
        System.out.println(name + " has Scored " + percentage + "%" );
    }
}