public class cau20 {
    public static void main(String[] args) {
        cau20 d1 = new cau20();
        d1.fibo(13);
    }
    public boolean kiemtra(int m)
    {
        int []n = new int [m];
        if(m<=0) return false;
        int i = 0;
        int a1=1,a2=0,a;
        while(i<m)
        {           
            a = a1 + a2;
            a1 = a2;
            a2 = a; //System.out.print(a);
            n[i] = a;
            if(m==a) 
            {
                if(n[i]==a)
                System.out.print("thuoc vi tri thu " +(i+1));
                return true;
            }
            i++;
        }  
        return false;
    }
    public void fibo(int n)
    {
        if(kiemtra(n))
        {
             System.out.println("");
        }
        else System.out.println(" khong thuoc");
    }
}
