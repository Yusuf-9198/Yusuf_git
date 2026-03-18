package Strings;
public class append {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("yusuf");
        System.out.println(s);
        // s.append(" beig");
        char[] surname = {'b', 'e','i','g'};
        s.append(surname); 
        System.out.println(s); // yusuf beig

    }
    
}
