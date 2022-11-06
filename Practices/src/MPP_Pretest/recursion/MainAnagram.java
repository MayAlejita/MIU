package MPP_Pretest.recursion;

public class MainAnagram {
    public static void main(String[] args) {
        printAnagram("", "ana");
        System.out.println(isAnagram("atun","tune"));
    }

    public static void printAnagram(String prefix, String word){
        if(word.length() <= 1){
            System.out.println(prefix + word);
        }
        else{
            for(int i =0; i < word.length(); i++){
                String curr = word.substring(i, i+1);
                String before= word.substring(0, i);
                String after = word.substring(i+1);
                printAnagram(prefix + curr, before+after);
            }
        }
    }

    public static boolean isAnagram(String word, String anagram){
        word = word.toLowerCase();
        anagram = anagram.toLowerCase();

        if(word.length() != anagram.length()){
            return false;
        }
        else{
            StringBuilder s1 = new StringBuilder(word);
            StringBuilder s2 = new StringBuilder(anagram);
            return  isAnagram(s1, s2);
        }
    }

    private static boolean isAnagram(StringBuilder s1, StringBuilder s2){
        if(s1.length() ==0 && s2.length() ==0){
            return  true;
        }

        char checker = s1.charAt(0);
        int index = s2.indexOf(Character.toString(checker));

        if(index == -1){
            return false;
        }

        s1 = s1.deleteCharAt(0);
        s2 = s2.deleteCharAt(index);
        return isAnagram(s1, s2);
    }
}
