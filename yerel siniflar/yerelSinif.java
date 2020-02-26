public class yerelSinif{
    public void foo(){
        class A{ // public ,protected ve private olamaz.
            public void write(){
                System.out.println("This is inner class");
            }
        }
        A b = new A();
        b.write();
    }
    public static void main(String [] args){
        //yerelSinif y = new yerelSinif();
        //y.foo();
    }
}