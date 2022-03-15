public class Powerxton {


    public double myPow(double x,int n){
        if(n<0){
    x=1/x;
        }
        return ansPow(x,n);
    }

    public double ansPow(double x, int n){
        if(n == 0) return 1;  // base case

        double xpnm1 = ansPow(x, n/2);  // xpnm1 = x ki power n - 1

        if(n % 2 == 0) {    // if n is even then it has even multipliers so multiply only both xpnm1
            return xpnm1 * xpnm1;
        }
        else{
            return xpnm1 * xpnm1 * x;  // if n is odd we multiply x itself in xpnm1 * xpnm1
        }
    }
    public static void main(String[] args) {
        Powerxton px=new Powerxton();
        double result=px.myPow(2,-2);
        System.out.println(result);
    }
}
