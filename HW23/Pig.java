// Team 3 Little Piggies - Tabassum Fabiha, Ryan Kim, Brandon Chong
// APCS1 pd02
// HW23 -- Better Coding Through Collaboration
// 2017-10-25

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 *
 *      To-Do List
 *      + boolean isOddWord(String) - checks if the String is an exception to the rules
 *      + String oddWordToPig(String) - translates the odd word from english to piglatin
 *      + String capWord(String) - capitalizes the first letter of a String
 *      + String sentenceTranslate(String) - translates an entire String of words into piglatin
 *      + boolean isCap(String) - takes in one letter and checks if that letter is capitalized
 *      + String makeWordCap(String) - makes the first letter of the word capital
 */


public class Pig
{
    //Q: How does this initialization make your life easier
    //A: You have one place where all the vowels can be referenced
    //   from. It makes for easier debugging, and fewer errors in the
    //   code due to typos.
    private static final String VOWELS = "aeiou";


    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
    for (int i  = 0; i < w.length(); i++) {
        if (w.substring(i,i+1).equals(letter)) {
        return true;
        }
    }

    return false;
    }//end hasA()


    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
    return hasA(VOWELS,letter);
    }


    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {
    int counter = 0;
    for (int i = 0; i < w.length(); i++) {
        if (isAVowel(w.substring(i,i+1))) {
        counter += 1;
        }
    }

    return counter;
    }


    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
      =====================================*/
    public static boolean hasAVowel( String w ) 
    {
    for (int i = 0; i < w.length(); i++) {
        if (isAVowel(w.substring(i,i+1))) {
        return true;
        }
    }
      
    return false;
    }


    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) 
    {
    String all = "";
    for (int i = 0; i < w.length(); i++) {
        if (isAVowel(w.substring(i,i+1))) {
        all += w.substring(i,i+1);
        }
    }
    return all;
    }
    
    //String firstVowel(String) -- returns the first vowel in a String
    //pre: w != null
    //post: firstVowel("") --> ""
    //      firstVowel("zzz") --> ""
    //      firstVowel("meatball") --> "e"
    
    public static String firstVowel(String w) {
    String all = allVowels(w);
    if (all.length() > 0) {
        return all.substring(0, 1);
    }
    return "";
    }

    //boolean benginsWithVowel(String) -- tells whether the first letter of the
    //                                    String is a vowel
    //pre: w != null and w.length() > 0
    //post: beginsWithVowel("apple")  --> true
    //      beginsWithVowel("strong") --> false
    public static boolean beginsWithVowel(String w) {
    return firstVowel(w).equals(w.substring(0,1));
    }

    //String engToPig(String) -- returns the piglatinified version of the String
    //pre: w.length() > 0
    //post: engToPig("apple")  --> "appleway"
    //      engToPig("strong") --> "ongstray"
    //      engToPig("java")   --> "avajay"
    public static String engToPig(String w) {
        if (beginsWithVowel(w)) {
            return w + "way";
        } else {
            return consonantStartToPig(w);
        }
    }
    
    //String consonantStartToPig(String) -- returns the piglatinified version of the String
    //pre: w.length() > 0
    //      consonantStartToPig("strong") --> "ongstray"
    //      consonantStartToPig("java")   --> "avajay"
    public static String consonantStartToPig(String w){
        String fVow = "";
    if (firstVowel(w) != "") {
        fVow = firstVowel(w);
    } else {
        fVow = "y";
    }
    String consonants = w.substring(0, w.indexOf(fVow));
    return w.substring(w.indexOf(fVow)) + consonants + "ay";
    }
    
    public static void main( String[] args ) 
    {
    System.out.println("hasA test cases");
    System.out.println("hasA('a','a') => "+hasA("a","a"));// true
    System.out.println("hasA('dog','g') => "+hasA("dog","g"));// true
    System.out.println("hasA('car','a') => "+hasA("car","a"));// true
    System.out.println("hasA('fish','f') => "+hasA("fishy","f"));// true
    System.out.println("hasA('done','p') => "+hasA("done","p"));// false
    
    System.out.println("\n==========================\n");
    
    System.out.println("isAVowel test cases");
    System.out.println("isAVowel('a') => "+isAVowel("a"));// true
    System.out.println("isAVowel('i') => "+isAVowel("i"));// true
    System.out.println("isAVowel('u') => "+isAVowel("u"));// true
    System.out.println("isAVowel('f') => "+isAVowel("f"));// false
    
    System.out.println("\n==========================\n");

    System.out.println("countVowels test cases");
    System.out.println("countVowels('word') => "+countVowels("word"));// 1
    System.out.println("countVowels('fishy') => "+countVowels("fishy"));// 1
    System.out.println("countVowels('rhythm') => "+countVowels("rhythm"));// 0
    System.out.println("countVowels('ouenouaou') => "+countVowels("ouenouaou"));// 8
    
    System.out.println("\n==========================\n");
    
    System.out.println("hasAVowel test cases");
    System.out.println("hasAVowel('word') => "+hasAVowel("word"));// true
    System.out.println("hasAVowel('fishy') => "+hasAVowel("fishy"));// true
    System.out.println("hasAVowel('rhythm') => "+hasAVowel("rhythm"));// false
    System.out.println("hasAVowel('ouenouaou') => "+hasAVowel("ouenouaou"));// true
    
    System.out.println("\n==========================\n");
    
    System.out.println("allVowels test cases");
    System.out.println("allVowels('word') => "+allVowels("word"));// "o"
    System.out.println("allVowels('fishy') => "+allVowels("fishy"));// "i"
    System.out.println("allVowels('rhythm') => "+allVowels("rhythm"));// ""
    System.out.println("allVowels('ouenouaou') => "+allVowels("ouenouaou"));// "oueouaou"

    System.out.println("\n==========================\n");
    
    System.out.println("firstVowel test cases");
    System.out.println("firstVowel('word') => "+firstVowel("word"));// "o"
    System.out.println("firstVowel('') => "+firstVowel(""));// ""
    System.out.println("firstVowel('rhythm') => "+firstVowel("rhythm"));// ""
    System.out.println("firstVowel('ouenouaou') => "+firstVowel("ouenouaou"));// "o"
    
    System.out.println("\n==========================\n");
    
    System.out.println("beginsWithVowel test cases");
    System.out.println("beginsWithVowel('word') => "+beginsWithVowel("word"));// "false"
    System.out.println("beginsWithVowel('rhythm') => "+beginsWithVowel("rhythm"));// "false"
    System.out.println("beginsWithVowel('ouenouaou') => "+beginsWithVowel("ouenouaou"));// "true"
    
    System.out.println("\n==========================\n");
    
    System.out.println("engToPig test cases");
    System.out.println("engToPig('apple') => "+engToPig("apple"));// "appleway"
    System.out.println("engToPig('strong') => "+engToPig("strong"));// "ongstray"
    System.out.println("engToPig('java') => "+engToPig("java"));// "avajay"
               
    }//end main()
 }//end class Pig
