interface Carro {
    void dirigir();
}

interface Onibus {
    void transportarPassageiros();
}

interface Aviao {
    void voar();
}

interface Helicoptero {
    void decolar();
}

class CarroTerrestre implements Carro {
    public void dirigir() {
        System.out.println("carro andando");
    }
}

class OnibusTerrestre implements Onibus {
    public void transportarPassageiros() {
        System.out.println("ônibus andando");
    }
}

class AviaoAereo implements Aviao {
    public void voar() {
        System.out.println("avião voando");
    }
}

class HelicopteroAereo implements Helicoptero {
    public void decolar() {
        System.out.println("helicóptero voando");
    }
}

interface FabricaTransporte {
    Carro criarCarro();
    Onibus criarOnibus();
    Aviao criarAviao();
    Helicoptero criarHelicoptero();
}

class FabricaTerrestre implements FabricaTransporte {
    public Carro criarCarro() {
        return new CarroTerrestre();
    }

    public Onibus criarOnibus() {
        return new OnibusTerrestre();
    }

    public Aviao criarAviao() {
        return null;
    }

    public Helicoptero criarHelicoptero() {
        return null;
    }
}

class FabricaAerea implements FabricaTransporte {
    public Carro criarCarro() {
        return null;
    }

    public Onibus criarOnibus() {
        return null;
    }

    public Aviao criarAviao() {
        return new AviaoAereo();
    }

    public Helicoptero criarHelicoptero() {
        return new HelicopteroAereo();
    }
}

public class AppTransporte {
    public static void main(String[] args) {
        FabricaTransporte fabrica;

        String tipo = "aereo";

        if (tipo.equals("terrestre")) {
            fabrica = new FabricaTerrestre();
            Carro carro = fabrica.criarCarro();
            Onibus onibus = fabrica.criarOnibus();

            carro.dirigir();
            onibus.transportarPassageiros();
        } else {
            fabrica = new FabricaAerea();
            Aviao aviao = fabrica.criarAviao();
            Helicoptero heli = fabrica.criarHelicoptero();

            aviao.voar();
            heli.decolar();
        }
    }
}