interface A{
    public void show();
}
public class isimsiz2{
    public static void main(String []args){
        A obj = new A(){
            public void show(){
                System.out.println("This is an annoymous class with interface");
            }
        };
        obj.show();
    }

}