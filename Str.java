public class Str {

    public static void main(String[] args) {
        String s = "kanishk";
        String reverse = "";
        for(int i=s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            reverse = reverse + ch;
        }
        System.out.println(reverse);
    }
}