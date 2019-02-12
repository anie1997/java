public class Alphabet {

    public static void main(String[] args) {

        char c = 'd';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + "  alphabet.");
        else
            System.out.println(c + "  not  alphabet.");
    }
}