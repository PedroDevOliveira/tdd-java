public class Main {
    public static void main(String[] args) {
        CalculadoraDiferente calculadora = new CalculadoraDiferente();

        int numeroInvertido = calculadora.inverteNumero(12345);
        System.out.println("Número invertido: " + numeroInvertido);

        int fatorial = calculadora.fatorial(5);
        System.out.println("Fatorial de 5: " + fatorial);

        int somaDobro = calculadora.somaDobro(3, 4);
        System.out.println("Soma de 3 com o dobro de 4: " + somaDobro);
    }
}
