public class cau16 {
    public static void main(String [] agrs){
        cau16 d1 = new cau16();
        d1.doixung(1);
    }
    public void doixung(int n){
        String s = " la so doi xung";
        int a = 0 ; // so sau khi dao nguoc
        int b; // gan n de kiem tra
        b = n; 
        if(n < 0) System.out.println(n + " khong phai" + s);
        else{
        for(; n!=0 ; n/= 10 ){
            int x = n % 10;
            a = a*10 + x;
        }
        if(a==b) System.out.println(a +s);
        else System.out.println(a+" khong phai" + s);
    }}
    }

