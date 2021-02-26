public class TesteString{

    public static void main(String[] args){

        int a= 0, b=10, c=7, d=2, e=4, f=4, g=6, h=15, i=13;

        a = (b + (c + (d + e) ) ) + (f + g) + (h + i); //saída: 58

        System.out.println("a = " + a);

        float tt = a * (b + c) + (float)d / (e + f);//saída:870,2857142

        System.out.println("tt = " + tt);

        float p=10.0f, r=20.0f, q=30.0f, w=5.0f, x=2.0f, y=3.0f;

        float z = p * r % q + w / x - y; //saída: 19.5

        System.out.println("z = " + z);

        z = p * r % (q + w) / x - y;// saída: 9.5

        System.out.println("z = " + z);

        z = p * r % (q + w / x - y); //saída: 23

        System.out.println("z = " + z);

    }

}