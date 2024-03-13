import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public boolean checkIfPangram(String sentence) {

        Set<Character> temp = new HashSet<>();

        for(int i=0; i<sentence.length(); i++){
            if(temp.size() == 26) return true;
            temp.add(sentence.charAt(i));
        }
        return temp.size()==26;
    }
}
