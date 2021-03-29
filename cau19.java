public class cau19 {
    public static void main(String[] args) {
        cau19 d1 = new cau19();
        d1.fibo(5);
    }
    public void fibo(int n){
        int [] m = new int [n];
        int i = 0; int a;
        int a1 = 1;
        int a2 = 0;
        while(i<n)
        {
            a = a1 + a2; //System.out.println(a);
            a1 = a2; //System.out.println(a1);
            a2 = a; //System.out.println(a2);
            m[i] = a;
            System.out.print(m[i]+" ");
            i++;
        }
    }
    
}
