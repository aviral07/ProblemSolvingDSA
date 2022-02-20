public class countDigits {

    public static void main(String[] args) {

        long num=12456565;
        long res=countDigitnum(num);
        System.out.println(res);

    }


    static long countDigitnum(long n){
        if( n /10 == 0)                 //base condition
        {
            return 1;
        }
        return 1+countDigitnum(n/10);
    }
}
