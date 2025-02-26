import java.util.Scanner;


public class Palindromo{

    static boolean isPalindromo(String str){

        return isPalindromo(str, 0);
    }

    static boolean isPalindromo(String str, int i){

        // Definir dados
        int j = str.length() - 1 - i;

        if(i == str.length() / 2){

            return true;
        } else if(str.charAt(i) != str.charAt(j)){

            return false; 
        }

        return isPalindromo(str, i + 1);
    }

    public static void main(String[] args){

        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        while(!str.equals("FIM")){

            // Testar funcao
            if(isPalindromo(str)){

                System.out.println("SIM");
            } else {
    
                System.out.println("NAO");
            }

            str = scanner.nextLine();
        }

        // Fechar scanner
        scanner.close();
    }
}