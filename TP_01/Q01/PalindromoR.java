import java.util.Scanner;



public class PalindromoR{

    static boolean isPalindromo(String str){

        // Definir dados
        boolean resp = true;
        int len = str.length();

        // Percorrer string ate a metade
        for(int i = 0; i < len / 2 && resp; i++){

            // Definindo caracteres pelos indices
            char c1 = str.charAt(i);
            char c2 = str.charAt(len - i - 1);

            // Comparar
            if(c1 != c2){
                
                // Tratamento
                resp = false;
                i = len / 2;
            }

        }

        // Retorno
        return resp;
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

        scanner.close();
    }
}