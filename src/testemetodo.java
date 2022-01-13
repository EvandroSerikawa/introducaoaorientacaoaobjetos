import org.w3c.dom.ls.LSOutput;

public class testemetodo {
    public static void main(String[] args) {

        conta contaNova = new conta();
        contaNova.saldo = 100 ;

        contaNova.deposita(500);
        System.out.println(contaNova.saldo);

        boolean conseguiuSacar = contaNova.saca(20);

        System.out.println(contaNova.saldo);
        System.out.println(conseguiuSacar);

        conta contaNova02 = new conta();
        contaNova02.deposita(1000);

        if (contaNova02.transfere(300 , contaNova)){
            System.out.println("Transferência efetuada com sucesso.");
        }else{
            System.out.println("Transação não efetuada.");
        }
        System.out.println(contaNova02.saldo);

        System.out.println(contaNova.saldo);

        contaNova.titular = "Evandro Serikawa";
        System.out.println("Titular da conta: " + contaNova.titular);


        }
    }
