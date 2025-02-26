

import java.util.Scanner;

public class Soma {
    
    
    public static int SomaTermos(String num){

        return SomaTermos(num, 0, 0);
    }

    public static int SomaTermos(String num, int i, int sum){
        
        if(i == num.length()){

            return sum;
        } else {

            char c = num.charAt(i);
            if(c >= '0' && c <= '9'){

                sum += (int) c - '0';
            }
            
            return SomaTermos(num, i + 1, sum);
        }
        
    }

    public static void main(String[] args) {
        
        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String n;

        // Leitura de dados
        n = scanner.nextLine();

        while(!n.equals("FIM")){

            // Mostrar dados
            System.out.println(SomaTermos(n));

            n = scanner.nextLine();
        }
        
        

        scanner.close();
    }
}
