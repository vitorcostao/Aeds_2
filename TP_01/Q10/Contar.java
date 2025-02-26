

import java.util.Scanner;

public class Contar {
    
    
    public static int CountWordInStr(String str){

        // Definir dados
        int len = str.length();
        int cont = 0;
        boolean space = true;

        for(int i = 0; i < len; i++){

            char c = str.charAt(i);
            if (c == ' ') {

                space = true;  
            } else if (space) {

                cont++;
                space = false;  
            }
        }

        return cont;
    }
    
    public static void main(String[] args) {
        
        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String str;

        // Leitura de dados
        str = scanner.nextLine();
        
        while(!str.equals("FIM")){

            // Mostrar dados
            System.out.println(CountWordInStr(str));

            str = scanner.nextLine();
        }

        
        scanner.close();
    }
}
