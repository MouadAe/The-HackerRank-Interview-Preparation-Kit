import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {
    public static List<Character>
    convertStringToCharList(String str){
        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) 
            chars.add(ch);
        return chars;
    }
    public static int makeAnagram(String a, String b) {
        HashMap<Character, Integer> charsCounterA = new HashMap<Character, Integer>();
        int size = a.length();
        for(int i=0;i<size;i++){
            if(charsCounterA.containsKey(a.charAt(i)))
                charsCounterA.put(
                    a.charAt(i),
                    charsCounterA.get(a.charAt(i)) + 1 
                );
            else    charsCounterA.put(a.charAt(i),1);
        }
        HashMap<Character, Integer> charsCounterB = new HashMap<Character, Integer>();
        size = b.length();
        for(int i=0;i<size;i++){
            if(charsCounterB.containsKey(b.charAt(i)))
                charsCounterB.put(
                    b.charAt(i),
                    charsCounterB.get(b.charAt(i)) + 1 
                );
            else    charsCounterB.put(b.charAt(i),1);
        }
        String concatAandB = a+b;
        int count = 0;
        Set<Character> mySet = new HashSet<Character>(
            convertStringToCharList(concatAandB)
        );
        for(Character c: mySet){
            int res = 0;
            if(charsCounterA.get(c)!=null) 
                res+=charsCounterA.get(c);
            if(charsCounterB.get(c)!=null) 
                res-=charsCounterB.get(c);
            count += Math.abs(res);
        }
        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result.makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
