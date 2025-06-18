package calculator;

import calculator.operation.Operation;

public class GenricCalcultor {
    public static void main(String args[])

    {
       // Operation obj = new Operation();
       // long a=obj.sub(10L, 5L);
        //System.out.println(a);
        iloop:
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<10;j++)
            {
                System.out.println(i+","+j+",");
                if(j==3 && i==3)
                {

                    break iloop;
                }

            }
        }

    }
}
