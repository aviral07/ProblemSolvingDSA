public class ValueofVariableAfterPerformingOperation {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++")  || operations[i].equals("++X")){
                x++;
            }
            if(operations.equals("X--") || operations[i].equals("X++")){
                x--;
            }

        }
        return x;

        /*
          int x = 0;

    for(int i = 0; i < operations.length; i++){

        String ops = operations[i];
        if(ops.charAt(1) == '+'){
            x++;
        }else{
            x--;
        }
    }

    return x;
       //  */
    }

    public static void main(String[] args) {

        String[] op={"++X","X++","X++","++X","X--","--X","++X"};

       ValueofVariableAfterPerformingOperation vp=new ValueofVariableAfterPerformingOperation();
        int result=vp.finalValueAfterOperations(op);
        System.out.println(result);
    }
}
