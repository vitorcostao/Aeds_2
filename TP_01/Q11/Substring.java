
import java.util.*;


public class Substring {

    public static boolean repeat(char c, String str, int j){

        // Definir dados
        boolean resp = false;
        int len = str.length();

        for(int i = j + 1; i < len; i++){

            if(str.charAt(i) == c){

                resp = true;
                i = len;
            }
        }

        return resp;
    }

    public static int Substring(String str){

        // Definir dados
        int len = str.length();
        int cont = 0;

        for(int i = 0; i < len; i++){

            char c = str.charAt(i);

            if(repeat(c, str, i)){


            }
        }

        return 0;
    }

    public static void main(String[] args) {
        
        // Definir dados
        Scanner scanner = new Scanner(System.in);
        String str;
        int len;

        // Leitura de dados
        str = scanner.nextLine();

        while(!str.equals("FIM")){

            len = Substring(str);

            System.out.println(len);

            str = scanner.nextLine();
        }


        

        scanner.close();
    }
}
