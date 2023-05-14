public class sum_of_digits_using_recursions {
//    static int sum_of_digits(int n){
//        if(n>=0&&n<=9){
//            return n;
//        }
//        int smallans=sum_of_digits(n/10);
//        int ans= smallans + (n%10);
//        return ans;
//    }
    static int count_of_digits(int n){
        int count=1;
        if(n/10==0){
            return 1;
        }
        //count++;
        return  count_of_digits(n/10)+1;

    }

    public static void main(String[] args) {
       // System.out.println(sum_of_digits(1024));
        System.out.println(count_of_digits(1234));
    }
}
