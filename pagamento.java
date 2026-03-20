interface CartaoCredito {
    void processarPagamento();
}

interface Boleto {
    void gerarBoleto();
}

class CartaoCreditoBancoA implements CartaoCredito {
    public void processarPagamento() {
        System.out.println("pagamento com cartão - banco A");
    }
}

class BoletoBancoA implements Boleto {
    public void gerarBoleto() {
        System.out.println("boleto gerado - banco A");
    }
}

class CartaoCreditoBancoB implements CartaoCredito {
    public void processarPagamento() {
        System.out.println("pagamento com cartão - banco B");
    }
}

class BoletoBancoB implements Boleto {
    public void gerarBoleto() {
        System.out.println("boleto gerado - banco B");
    }
}

interface FabricaBanco {
    CartaoCredito criarCartao();
    Boleto criarBoleto();
}

class FabricaBancoA implements FabricaBanco {
    public CartaoCredito criarCartao() {
        return new CartaoCreditoBancoA();
    }

    public Boleto criarBoleto() {
        return new BoletoBancoA();
    }
}

class FabricaBancoB implements FabricaBanco {
    public CartaoCredito criarCartao() {
        return new CartaoCreditoBancoB();
    }

    public Boleto criarBoleto() {
        return new BoletoBancoB();
    }
}

public class Loja {
    public static void main(String[] args) {
        FabricaBanco fabrica;

        String banco = "B";

        if (banco.equals("A")) {
            fabrica = new FabricaBancoA();
        } else {
            fabrica = new FabricaBancoB();
        }

        CartaoCredito cartao = fabrica.criarCartao();
        Boleto boleto = fabrica.criarBoleto();

        cartao.processarPagamento();
        boleto.gerarBoleto();
    }
}