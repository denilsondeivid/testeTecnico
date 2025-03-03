
// A classe conta com 2 métodos principais, um main para chamada do código e um método que executa uma verificação booleana.



public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("insira o número para a verificação: ");
        int numero = scanner.nextInt();
        
        if (isFibonacci(numero)) {
            System.out.println(numero + "pertence a sequência de fib");
        } else {
            System.out.println(numero + "não pertence a sequência de fib");
        }
        
        scanner.close();
    }
    
    public static boolean isFibonacci(int n) {
        if (n < 0) return false;
        
        int a = 0, b = 1;
        while (a <= n) {
            if (a == n) return true;
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }
}
