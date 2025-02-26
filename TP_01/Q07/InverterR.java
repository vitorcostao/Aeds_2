
import java.util.Scanner;

public class InverterR {
    
    public static String Inverter(String str){
        
        // Transformar String em array
        char[] strInv = str.toCharArray();

        // Retornar invertido
        return Inverter(strInv, 0);        
    }

    public static String Inverter(char[] str, int i){

        // Passo base
        if(i == str.length / 2){

            String strInv = new String(str);
            return strInv;
        } else { // Passo recursivo

            // Tamanho 
            int len = str.length;

            // Troca
            char tmp = str[i];
            str[i] = str[str.length - i - 1];
            str[len - i - 1] = tmp;
            
            // Chamada recursiva
            return Inverter(str, i + 1);
        }
    }

    public static void main(String[] args) {
        
        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String str, str2;

        // Leitura de dados
        str = scanner.nextLine();

        // Aplicando função
        str2 = Inverter(str);

        System.out.println(str2);

        scanner.close();
    }
}
