
import java.util.Scanner;

public class Inverter {
    
    public static String Inverter(String str){

        // Definir dados
        char[] strInv = str.toCharArray();
        int len = str.length();

        // Percorrer ate a metade
        for(int i = 0; i < len / 2; i++){

            // Realizar a troca
            char tmp = strInv[i];
            strInv[i] = strInv[len - i - 1];
            strInv[len - i - 1] = tmp;
        }

        // Copiar array para string
        String str2 = new String(strInv);

        return str2;
    }

    public static void main(String[] args) {
        
        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String str, str2;

        // Leitura de dados
        str = scanner.nextLine();

        while(!str.equals("FIM")){

            // Aplicando função
            str2 = Inverter(str);

            System.out.println(str2);

            str = scanner.nextLine();
        }

        

        scanner.close();
    }
}
