package Question_Four;

public class CombineWords {
 
        // main method
        public static void main(String[] args) {

            String sentence_one, sentence_two;
            // call a static method
            sentence_one = "What is";
            sentence_two = getSecondSentence();
    
            // using non-static method
            CombineWords objOfThisClass = new CombineWords();
            objOfThisClass.combineWords(sentence_one, sentence_two);
        }

    //non static method
    void combineWords(String sentence_one, String sentence_two) {
        System.out.println(sentence_one + sentence_two);
    }

    // This is a static method
    static String getSecondSentence() {
        return " your name?";
    }


}