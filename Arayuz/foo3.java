public class foo3{
    static int x = 10;
    protected int y = 10;
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

    }
}