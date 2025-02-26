import java.util.Scanner;

public class IsR {
    
    public static boolean IsDigit(char c){

        return (c >= '0' && c <= '9');
    }

    public static boolean IsLetter(char c){

        return (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z');
    }

    public static boolean FindVogal(char c){

        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ||
               (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    }

    public static boolean IsSpace(char c){

        return c == ' ';
    }

    public static boolean isOnlyVogals(String str){

        return isOnlyVogals(str, 0);
    }

    public static boolean isOnlyVogals(String str, int i){

        // Passo base
        if(i == str.length()){

            return true;
        } else { // Passo recursivo

            // Teste se c é uma vogal
            char c = str.charAt(i);
            if(!FindVogal(c) && !IsSpace(c)){

                return false;
            } else {

                // Chamada recursiva
                return isOnlyVogals(str, i + 1);
            }
        }
    }

    public static boolean  isOnlyConsonants(String str){

        return isOnlyConsonants(str, 0);
    }

    public static boolean isOnlyConsonants(String str, int i){

        if(i == str.length()){

            return true;
        } else {

            char c = str.charAt(i);
            if(IsLetter(c)){

                if(!FindVogal(c)){

                    return isOnlyConsonants(str, i + 1);
                } else {

                    return false;
                }
            } else if(IsSpace(c)){

                return isOnlyConsonants(str, i + 1);
            } else {

                return false;
            }
        }
    }

    public static boolean IsInteger(String str, int i){

        if(i == str.length()){

            return true; 
        } else {

            char c = str.charAt(i);
            if(i > 0){

                if(c >= '0' && c <= '9'){

                    return IsInteger(str, i + 1);
                } else {

                    return false;
                }
            } else {

                if(c == '-'){

                    return IsInteger(str, i + 1);
                } else if(c >= '0' && c <= '9'){

                    return IsInteger(str, i + 1);
                } else {

                    return false;
                }
            }
        }
    }

    public static int CountPucts(String str){

        // Definir dados
        int cont = 0;

        for (char c : str.toCharArray()) {

            if(c == ',' || c == '.'){
              
                cont++;
            }
        }

        return cont;
    }

    public static boolean IsFloat(String str, int i){

        // Definir dados
        int len = str.length();

        if(i == len){
            return true;
        }

        if(CountPucts(str) > 1){

            return false;
        }

        char c = str.charAt(i);

        if(i == 0 && c == '-'){
           
            return IsFloat(str, i + 1);
        }

        if((c >= '0' && c <= '9') || c == '.' || c == ','){
   
            return IsFloat(str, i + 1);
        }

        return false;
    }

    public static void main(String[] args) {
        
        // Definir dados
        String str;
        Scanner scanner = new Scanner(System.in);
    

        // Leitura de dados
        str = scanner.nextLine();
        
        while(!str.equals("FIM")){

            if(isOnlyVogals(str)){

                System.out.print("SIM ");
            } else {

                System.out.print("NAO ");
            }

            if(isOnlyConsonants(str)){

                System.out.print("SIM ");
            } else {

                System.out.print("NAO ");
            }
            
            if(IsInteger(str, 0)){

                System.out.print("SIM ");
            } else {

                System.out.print("NAO ");
            }

            if(IsFloat(str, 0)){

                System.out.print("SIM\n");

            } else {

                System.out.print("NAO\n");
            }

            str = scanner.nextLine();
        }

        scanner.close();

    }
}
