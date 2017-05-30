
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
         printWithSmileys("Method");
         printWithSmileys("Beerbottle");
         printWithSmileys("Interface");
    }

    
    
     private static void printWithSmileys(String characterString){
        String smile = ":)";
         int lenght = calcolaLenght(characterString, smile);
        
          printSmile(lenght/2, smile);               
          if (characterString.length() %2 == 0)
          System.out.println(smile+" " + characterString + " " + smile);
          else
              System.out.println(smile+" " + characterString + "  " + smile);
          printSmile(lenght/2, smile);   
                
     }

    private static int calcolaLenght(String characterString, String smile) {
        int lenght;
        if (characterString.length() % 2 == 1) {
            lenght = characterString.length() + 3 + 2 * smile.length();
            
        } else {
            lenght = characterString.length() + 2 + 2 * smile.length();
        }
        return lenght;
    }
     
  
     
     private static void printSmile(int lenght, String smile){
         for (int i = 0; i < lenght; i++) {
              System.out.print(smile);
          }
         System.out.println("");
     }
             
}


