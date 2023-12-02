//------💡Solving problems-Morse Code Dictionary💡------------------
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Let's create an Object from the scanner class
        Scanner scanner = new Scanner(System.in);
        // morse code dictionary
        Map<String , String> morseCodeDictionary = createMorseCodeDictionary();
        // Input from user
        System.out.println("Enter text to translate to morse code 💡 \n Enter morse code to translate into text");
        String userInput = scanner.nextLine();
        // Translate the input
        String translatedText = translate(userInput, morseCodeDictionary);
        // Display the result
        System.out.println("➖➖➖➖➖➖➖➖➖➖");
        System.out.println("Translated Text is: \n" + translatedText);
        System.out.println("➖➖➖➖➖➖➖➖➖➖");
    }
    //Let's create our Dictionary function...
    private static Map<String, String> createMorseCodeDictionary(){
        Map<String, String> morseCodeDictionary = new HashMap<String,String>();
        morseCodeDictionary.put("A", ".-");
        morseCodeDictionary.put("B", "-...");
        morseCodeDictionary.put("C", "-.-.");
        morseCodeDictionary.put("D", "-..");
        morseCodeDictionary.put("E", ".");
        morseCodeDictionary.put("F", "..-.");
        morseCodeDictionary.put("G", "--.");
        morseCodeDictionary.put("H", "....");
        morseCodeDictionary.put("I", "..");
        morseCodeDictionary.put("J", ".---");
        morseCodeDictionary.put("K", "-.-");
        morseCodeDictionary.put("L", ".-..");
        morseCodeDictionary.put("M", "--");
        morseCodeDictionary.put("N", "-.");
        morseCodeDictionary.put("O", "---");
        morseCodeDictionary.put("P", ".--.");
        morseCodeDictionary.put("Q", "--.-");
        morseCodeDictionary.put("R", ".-.");
        morseCodeDictionary.put("S", "...");
        morseCodeDictionary.put("T", "-");
        morseCodeDictionary.put("U", "..-");
        morseCodeDictionary.put("V", "...-");
        morseCodeDictionary.put("W", ".--");
        morseCodeDictionary.put("X", "-..-");
        morseCodeDictionary.put("Y", "-.--");
        morseCodeDictionary.put("Z", "--..");
        morseCodeDictionary.put("0", "-----");
        morseCodeDictionary.put("1", ".----");
        morseCodeDictionary.put("2", "..---");
        morseCodeDictionary.put("3", "...--");
        morseCodeDictionary.put("4", "....-");
        morseCodeDictionary.put("5", ".....");
        morseCodeDictionary.put("6", "-....");
        morseCodeDictionary.put("7", "--...");
        morseCodeDictionary.put("8", "---..");
        morseCodeDictionary.put("9", "----.");
        morseCodeDictionary.put(".", ".-.-.-");
        morseCodeDictionary.put(",", "--..--");
        morseCodeDictionary.put("?", "..--..");
        morseCodeDictionary.put(" ", " ");
        return morseCodeDictionary;
    }
    // Create a translation function to translate morse codes into English
    private static String translate(String input, Map<String,String> morseCodeDictionary){
        StringBuilder translatedText = new StringBuilder();
        String[] words = input.split("\\s");
        // use a for loop to iterate in the input and Dictionary
        for (String word : words){
            String[] characters = word.split("\\s+");
            for (String character : characters){
                if (morseCodeDictionary.containsValue(character)){
                    // Translate the Morse code into Text
                    for (Map.Entry<String, String> entry : morseCodeDictionary.entrySet()){
                        if (entry.getValue().equals(character)){
                            translatedText.append(entry.getKey());
                            break;
                        }
                    }
                } else if (morseCodeDictionary.containsKey(character.toUpperCase())) {
                    //Translate text to morse code
                    translatedText.append(morseCodeDictionary.get(character.toUpperCase()));
                }else {
                    // preserve unknown character
                    translatedText.append(character);
                }
            }
            translatedText.append(" ");
        }
        return translatedText.toString().trim();
    }
}




