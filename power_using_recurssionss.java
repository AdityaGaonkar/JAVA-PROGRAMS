public class power_using_recurssionss {
    static int powerof(int p,int q){
        if (q==0){
            return 1;
        }
        return powerof(p,q-1)*p;
    }

    public static void main(String[] args) {
        System.out.println(powerof(2,3));
    }
}
