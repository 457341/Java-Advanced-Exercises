
public class isimsiz1{
    public static void main(String []args){
        A obj = new A(){
            public void show(){
                System.out.println("This is an Annoymous class");
            }
        };
        obj.show();
    }
}
class A{
    public void show(){
        System.out.println("This is class A");
    }
}