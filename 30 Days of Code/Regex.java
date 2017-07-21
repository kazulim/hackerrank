import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> list = new ArrayList();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            String email = scan.next();
            if (name.length() <= 20 && email.length() <= 50 && checkName(name, email)) {
                list.add(name);
            }
        }
        Collections.sort(list);
        for(int j=0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }

    public static boolean checkName(String name, String email) {
        Pattern n = Pattern.compile("[a-z]+");
        Pattern e = Pattern.compile("[a-z]+@gmail.com");

        Matcher mn = n.matcher(name);
        Matcher me = e.matcher(email);

        return (mn.find() && me.find());
    }
}