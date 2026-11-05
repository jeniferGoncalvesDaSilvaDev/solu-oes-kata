public class Kata {

  public static String solution(String str) {
    // Your code here...
    StringBuilder sb = new StringBuilder(str); // New StringBuilder
    sb.reverse(); // Inverter a string
    String reversedStr = sb.toString(); // Convertir de volta para String
    System.out.println("Reversed String: " + reversedStr); // Imprimir a string 
    return reversedStr;
  }

}
