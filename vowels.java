package String;

public class vowels {
    public static void main(String[] args) {
        String s ="education";
        int vowels=0;
        int consonants=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            String vowel="aeiou";
            if(vowel.contains(ch+"")){
                vowels++;
            }else{
                consonants++;
            }
        }    
    System.out.println("vowels: "+vowels+" consonants: "+consonants);
    }
}