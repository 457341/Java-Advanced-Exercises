public class foo4{
    private int x = 10;
    protected int y = 10;
    private int  m1 = 1;
    protected int  m2 = 11;
    class secret {
        public void go(){
            int m1 = 20;
            int m2 = 40;
            System.out.println(x + " " + y + " " +m1 + " "+m2);
        }
    }
    public static void main(String [] args){
        int x = 5;
        int y = 2;
       System.out.println(x);
        int sayac =0;
        try {
               for(x = 3;x<6;x++){
                    switch(x){
                    case 3: sayac++; break;
                    case 4: sayac++;break;
                    case 7:  sayac++;break;
                    case 9:  sayac+=40;
                    }
                }
             }catch(Exception e){
                 sayac++;
            }
            System.out.println(sayac); 
    foo4.secret k = new foo4().new secret();
    k.go();
    }
}