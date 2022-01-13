public class conta {

    // Classe - definição do Tipo ( especificação , planta da casa  )
    // Elemento do código java utilizado para representar Objetos ( o Objeto é instanciado a partir da classe )

    // Atributos - Caracteristicas do Objeto

    double saldo;
    int agencia;
    int conta;
    String titular;

    // Métodos - Comportamentos do Objeto

    // o que ele devolve ( void )
    // o que ele recebe ( double )
    public void deposita( double valor ){

        this.saldo += valor;
    }

    // Retorna um booleano confirmando se o saque é TRUE ou FALSE
    public boolean saca ( double valor ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            return true;
        }
        else{
            return false;
        }
    }

    public  boolean transfere( double valor  , conta destino ){
        if( this.saldo >= valor ){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else{
            return false;
        }
        }

    }
