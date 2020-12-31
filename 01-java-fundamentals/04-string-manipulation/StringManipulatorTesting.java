public class StringManipulatorTesting {
   public static void main(String[] args){
       StringManipulator sm = new StringManipulator();
       
       String str = sm.trimAndConcat("  Hello  ", "  World  ");
       System.out.println(str);

       char letter = 'o';
       Integer a = sm.getIndexOrNull("Coding", letter);
       Integer b = sm.getIndexOrNull("Hello World", letter);
       Integer c = sm.getIndexOrNull("Hi", letter);
       System.out.println(a); 
       System.out.println(b); 
       System.out.println(c); 

       String word = "Hello";
       String subString = "llo";
       String notSubString = "world";
       Integer x = sm.getIndexOrNull(word, subString);
       Integer y = sm.getIndexOrNull(word, notSubString);
       System.out.println(x);
       System.out.println(y);

       String word2 = sm.concatSubstring("Hello", 1, 2, "world");
       System.out.println(word2);
   } 
}
