public class AddBinaryStrings {
    public static void main(String[] args) {
        String a="110";
        String b="1";
        StringBuilder sb =new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum += a.charAt(i--) -'0';   //ascii value of 0=48 and ascii value of 1=49  then 49-48 =1 and that how we can convert '1' to 1
            }
            if(j>=0){
                sum +=b.charAt(j--)-'0';
            }
            sb.insert(0,sum%2);
            carry=sum/2;
        }
        if(carry>0){
            sb.insert(0,1);
        }

        System.out.println(sb.toString());
    }
}
