

public class Anagrama {
    
    public static String removerAcentos(String str) {
        
        // Definir dados
        char[] resultado = new char[str.length()];

        for(int i = 0; i < str.length(); i++){

            char c = str.charAt(i);
            
            switch (c) {
                case 225, 224, 227, 226, 228 -> resultado[i] = 'a'; 
                case 193, 192, 195, 194, 196 -> resultado[i] = 'A'; 
                case 233, 232, 234, 235 -> resultado[i] = 'e'; 
                case 201, 200, 202, 203 -> resultado[i] = 'E'; 
                case 237, 236, 238, 239 -> resultado[i] = 'i'; 
                case 205, 204, 206, 207 -> resultado[i] = 'I'; 
                case 243, 242, 245, 244, 246 -> resultado[i] = 'o';
                case 211, 210, 213, 212, 214 -> resultado[i] = 'O'; 
                case 250, 249, 251, 252 -> resultado[i] = 'u'; 
                case 218, 217, 219, 220 -> resultado[i] = 'U'; 
                case 231 -> resultado[i] = 'c'; 
                case 199 -> resultado[i] = 'C'; 
                default -> resultado[i] = c;
            }
        }

        System.out.println(new String(resultado));
     
        return new String(resultado);
    }

    public static String substr(int inicio, int fim, String str){

        // Definir dados
        String sbs = "";

        for(int i = inicio; i < fim; i++){

            char c = str.charAt(i);
            sbs += c;
        }

        return sbs;
    }

    public static int FindChar(char c, String str){

        // Definir dados
        int len = str.length();
        int j = 0;

        for(int i = 0; i < len; i++){

            char cs = str.charAt(i);
            if(cs == c){

                j = i;
                i = len;
            }
        }

        return j;
    }

    public static char Minuscula(char c){

        if(c >= 'A' && c <= 'Z'){

            return (char) (c + ('a' - 'A')); 
        }
        
        return c;
    }

    public static String Ordenar(String str){
       
        // Definir dados
        char[] arr = str.toCharArray();
        int len = arr.length;

        for(int i = 0; i < len - 1; i++){
            
            int menor = i;
            for(int j = i + 1; j < len; j++){
               
                if(Minuscula(arr[j]) < Minuscula(arr[menor])){
                    
                    menor = j;
                }
            }

            arr[i] = Minuscula(arr[i]);
            arr[menor] = Minuscula(arr[menor]);

            char temp = arr[i];
            arr[i] = arr[menor];
            arr[menor] = temp;
        }

        return new String(arr);
    }

    public static boolean anagrama(String str1, String str2){

        if(str1.length() != str2.length()){

            return false;
        }

        String str1cpy = Ordenar(removerAcentos(str1));
        String str2cpy = Ordenar(removerAcentos(str2));

        return str1cpy.equals(str2cpy);
    }

    public static void main(String[] args) {
        
        MyIO.setCharset("ISO-8859-1");

        // Definir dados
        String str1, str2, str3;

        // Leitura de dados
        str1 = MyIO.readLine();
        
        while(!str1.equals("FIM")){

            str2 = substr(0, FindChar(' ', str1), str1);
            str3 = substr(FindChar('-', str1) + 2, str1.length(), str1);
            
            if(anagrama(str2, str3)){

                MyIO.println("SIM");
            } else {
                MyIO.println("NÃO");
            }

            str1 = MyIO.readLine();
        }
    }
}
