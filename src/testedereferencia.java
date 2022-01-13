public class testedereferencia {
    public static void main(String[] args) {

        // Referencia - Uma 'referência' aponta para o local onde as variáveis e métodos dos 'objetos' são armazenados.
        // Objeto - um objeto é uma instância de uma classe e é armazenado em um determinado slot de memória.

        conta primeiraConta = new conta();
        primeiraConta.saldo = 300;

        System.out.println("Saldo da primeira conta " + primeiraConta.saldo);

        conta segundaConta = primeiraConta;
        System.out.println("Saldo da segunda conta é " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println("Saldo da segunda conta é " + segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        if( primeiraConta == segundaConta){
            System.out.println("Sâo a mesmissima conta!!!!   .... :) ");
        }

        System.out.println(primeiraConta);

    }
}
