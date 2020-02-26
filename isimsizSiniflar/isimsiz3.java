interface hesaplayici{
    public int hesaplama();
}

public class isimsiz3{
    public hesaplayici topla (final int a,final int b){
        return new hesaplayici()
        {
            public int hesaplama(){
                return a + b;
            }
       };
    }
    public static void main(String[] arjs){
        isimsiz3 obj = new isimsiz3();
        hesaplayici h = obj.topla(2,3);
        int sonuc = h.hesaplama();
        System.out.println(sonuc);

    }
}