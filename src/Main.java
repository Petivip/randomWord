import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 's', 'r','t','u','v','q','w','x','y','z'};
        String word="";
        System.out.println("Enter the length of your random word: ");
        Scanner key=new Scanner(System.in);
        int number=key.nextInt();
        for (int i=0; i <= number; i++){
            word+=arr[((int)((Math.random()*((26-1)+1))+1))];
        }


            if(word.contains("i")||word.contains("a")||word.contains("u")||word.contains("e")||word.contains("o")){
                System.out.println(word +" (might be a word)");
            } else{
                System.out.println(word +" (is not a word)");
            }

    }

}
