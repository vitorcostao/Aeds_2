import java.util.Scanner;

public class Validacao {

    public static boolean Maius(String str) {
       
        // Definir dados
        boolean resp = false;
        int len = str.length();

        for(int i = 0; i < len; i++){
            
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {

                resp = true;
                i = len;
            }
        }
        return resp;
    }

    public static boolean Minus(String str) {
       
        // Definir dados
        boolean resp = false;
        int len = str.length();

        for(int i = 0; i < len; i++){
            
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {

                resp = true;
                i = len;
            }
        }
        return resp;
    }

    public static boolean Num(String str) {
        
        // Definir dados
        boolean resp = false;
        int len = str.length();

        for(int i = 0; i < len; i++){
            
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {

                resp = true;
                i = len;
            }
        }
        return resp;
    }

    public static boolean Esp(String str) {
        
        // Definir dados
        boolean resp = false;
        int len = str.length();

        for(int i = 0; i < len; i++){
            
            char c = str.charAt(i);
            if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))) {

                resp = true;
                i = len;
            }
        }
        return resp;
    }
    

    public static boolean isValid(String str){

        // Definir dados
        boolean resp = false;

        if(str.length() < 8){

            return resp;
        }

        if(Maius(str) && Minus(str) && Num(str) && Esp(str)){

            resp = true;
        }

        return resp;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in, "ISO-8859-1");

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();

            // Verifica se a entrada é "FIM" para encerrar o loop
            if (str.equals("FIM")) {
                break;
            }

            if (isValid(str)) {
                System.out.println("SIM");
            } else {
                System.out.println("NÃO");
            }
        }

        scanner.close();
    }
}

