//Returning the string that is the reverse of it using the iterative method.
public class ReverseStringUsingIterative {
    public static String reverseStringIterative(String string){
        String reverseString = "";

        for(int i=string.length()-1;i>=0; i--){
            reverseString += string.charAt(i);
        }
        return reverseString;
    }
    public static void main(String[] args){
        String string = "Superior Java";
        System.out.println("String: "+ string);
        System.out.println("Reversed String: "+reverseStringIterative(string));
    }
}
