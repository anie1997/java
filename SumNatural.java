public class SumNatural {

    public static void main(String[] args) {

        int num = 2,i =1, sum = 0;

        while( i <= num) 
        {
            // sum = sum + i;
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);
    }
}