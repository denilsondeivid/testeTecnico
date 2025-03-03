import java.util.Scanner;

//utilização de um método principal e um método auxiliar. Poderia ser feito com while ou com for, apenas mudando as posições do final do array para o inicio.

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma string: ");
        String input = scanner.nextLine();
        
        String inverted = inverterString(input);
        
        System.out.println("String invertida: " + inverted);
        
        scanner.close();
    }
    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;
        
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }
        
        return new String(caracteres);
    }
}
