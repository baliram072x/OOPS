
public class GETTERS{
    public static void main(String[] args) {
        Pen1 p1 = new Pen1(); // constructor and we created a object name p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}
class Pen1{
    // properties and functions
    int tip;
    String color;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;
    }
}

// this keyword is used to refer to the current object