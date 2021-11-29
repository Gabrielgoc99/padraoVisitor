
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VeiculoVisitorTest {

    @Test
    void deveRetornarCarroCadastrado() {
        Carro carro = new Carro(10203040, "Nissan", "Kicks", "Vermelho", 2020);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Carro{renavam=10203040, marca='Nissan', modelo='Kicks', cor='Vermelho', anoFabricacao=2020}", visitor.cadastrar(carro));
    }

    @Test
    void deveRetornarMotocicletaCadastrada() {
        Motocicleta motocicleta = new Motocicleta(50607080, "Triumph", "Tiger", "Preta", 2018);

        VeiculoVisitor visitor = new VeiculoVisitor();
        assertEquals("Motocicleta{renavam=50607080, marca='Triumph', modelo='Tiger', cor='Preta', anoFabricacao=2018}", visitor.cadastrar(motocicleta));
    }

}