public class VowelConsonantCount {
    public static void main(String[] args) {
        String str="Automation";
        int vowel=0,consonant=0;
        for(char c:str.toCharArray()){
            if("aeiouAEIUO".indexOf(c)!=-1){
                vowel++;
            }
            else{
                consonant++;
            }
        }
        System.out.println("Vowels "+vowel+" Consonants "+consonant);
    }
    
}
