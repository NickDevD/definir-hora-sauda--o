public class Calcular {
    
    public static void main(String[] args) {
        
        Calculadora calcular = new Calculadora();

        
        System.out.println("Resultado da soma: " + calcular.somar(1, 1));

        System.out.println("Resultado da Mulplicacao: " + calcular.multiplicar(10, 20));

        System.out.println("Resultado da Divisao: " + calcular.dividir(3, 2));
    }
}
