import java.util.Random;
import java.util.Scanner;

public class Alteracao {

    public static String RandomAlteration(String str, Random gerador){

        // Definir dados
        char[] str2 = str.toCharArray();
        char c1 = (char) ('a' + Math.abs(gerador.nextInt()) % 26);
        char c2 = (char) ('a' + Math.abs(gerador.nextInt()) % 26);

        for(int i = 0; i < str.length(); i++){

            if(str2[i] == c1){

                str2[i] = c2;
            }
          
        }

        return new String(str2);
    }

    public static void main(String[] args) {
        
        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String str;
        Random gerador = new Random();
        gerador.setSeed(4);

        // Leitura de dados
        str = scanner.nextLine(); 

        while(!str.equals("FIM")){

            str = RandomAlteration(str, gerador);
            System.out.println(str);
            str = scanner.nextLine();

           
        }

        

        scanner.close();
    }
}