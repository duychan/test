public class cau4 {
    public static void main(String[] args) {
        cau4 d1 = new cau4();
        d1.crame(2, 3, 4, 5, 6, 7);
    }
    public void crame(int a, int b , int c, int d , int e ,int f){
        int d1;
        int dx;
        int dy;
        d1 = a*e - d*b;
        dx = c*e - f*b;
        dy = a*f - d*c;
        if(d1 == 0) 
        {
            if(dx+dy==0) System.out.println("Phuong trinh co vo so nghiem");
            else System.out.println("Phuong trinh vo nghiem");
        }
        else 
        {
         System.out.println("Nghiem cua phuong trinh la: c=" + dx/d1 + " va f="+ dy/d1);
        }
        

    }
}
