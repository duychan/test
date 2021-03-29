
public class cau17 {
    public static void main(String [] agrs) {
        cau17 d1 = new cau17();
        d1.nguyent(23);
    }
    public boolean kiemtra(int m){
        if(m<2) return false;
        for(int i=2;i<=Math.sqrt(m);++i){
            if(m%i == 0)
            {
                return false;
            }   
        }
        return true;
    }
    public void nguyent(int n){
        System.out.print("cac so nguyen to nho hon hoac bang " +n +" la: ");
        for(int j=2;j<=n;j++)
        {
            if(kiemtra(j)) 
            {
                System.out.print(j+" ");
            }
        }
        
    }
    
    
}
