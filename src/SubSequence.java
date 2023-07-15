import java.util.Scanner;

public class SubSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int count=0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='A'){
                for(int j=i;j<input.length();j++){
                    if(input.charAt(j)=='G'){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
