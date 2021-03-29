public class cau3 {
    public static void main(String[] args) {
        cau3 d1 = new cau3();
        d1.pt(1, -4, 4);
    }
    public void pt(int a,int b,int c)
    {   int delta;
        double x1 , x2;
        delta = b*b-4*a*c;
        if(a==0) System.out.println("ERROR");
        if(delta == 0) System.out.println("Phuong trinh co nghiem kep la "+ (-b/(2*a)));
        else if(delta < 0)
        { 
            System.out.println("pt vo nghiem");
        }
        else
        {
             x1 = (-b+Math.sqrt(delta))/(2*a);
             x2 = (-b-Math.sqrt(delta))/(2*a);
             System.out.println("Nghiem cua phuong trinh "+a+"x^2"+b+"x"+c+"la: " +x1+" va "+x2);
        }
    }   
}
