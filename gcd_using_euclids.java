public class gcd_using_euclids {
    static int gcd(int x,int y){
        if (y==0){
            return x;
        }
        else{
            return gcd(y,x%y);
        }
    }
    public static void main(String[] args) {
        System.out.println(gcd(30,15));
    }
}
