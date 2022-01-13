public class criaconta {
    public static void main(String[] args) {

        conta primeiraConta = new conta();
        primeiraConta.saldo = 200;

        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.titular);


        // primeiraconta - Objeto instanciado a partir da classe conta.
        // O objeto recebe como herança os atributos da classe conta

        // para criar o obejto a partir da classe utilize a palavra new e o nome da classe
        // no inicio da linha colocar o nome da classe e o nome do novo Objeto
        // que recebe as informações herdadas da classe

        primeiraConta.saldo +=100;
        System.out.println("Saldo primeira conta " + primeiraConta.saldo);


        conta segundaConta = new conta();
        segundaConta.saldo = 50;

        System.out.println("Saldo segunda conta " + segundaConta.saldo);

        if(primeiraConta == segundaConta){
            System.out.println("São a mesma conta.");
        }else{
            System.out.println("São contas diferentes.");
        }

        conta terceiraConta =  new conta();
        terceiraConta.saldo = 450;

        System.out.println("Saldo terceira conta " + terceiraConta.saldo);
    }
}
