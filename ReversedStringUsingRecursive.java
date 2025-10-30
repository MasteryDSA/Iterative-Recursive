//Returning the string that is the reverse of it using the recursive method.
public class ReversedStringUsingRecursive {
    public static String reversedStringRecursive(String string){
        if(string.isEmpty())
            return string;
        else
            return reversedStringRecursive(string.substring(1))+string.charAt(0);
    }
    public static void main(String[] args){
        String string = "Java Superior";
        System.out.println("String: "+ string);
        System.out.println("Reversed String: "+reversedStringRecursive(string));
    }
}
