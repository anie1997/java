public class Largest {

    public static void main(String[] args) {

        int n1 = 1, n2 = -1, n3 = -4;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + "  largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + "  largest number.");

        else
            System.out.println(n3 + "  largest number.");
    }
}