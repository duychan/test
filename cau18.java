public class cau18 {
    public void hoanhao(int m)
    {
        String s = " la so hoan hao";
        int tong = 0;
        for(int i = 1;i<m;i++)
        {
            if(m%i==0) 
            {
               tong+=i;
            }
        }
        if(tong == m) System.out.println(m+s);
        else System.out.println(m+"khong la" + s);
    }
    public static void main(String[] args) {
        cau18 d1 = new cau18();
        d1.hoanhao(6);
    }
}
