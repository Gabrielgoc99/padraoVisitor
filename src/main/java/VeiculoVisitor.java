
public class VeiculoVisitor implements Visitor {

    public String cadastrar(Veiculo veiculo) {
        return veiculo.accept(this);
    }

    @Override
    public String cadastrarCarro(Carro carro) {
        return "Carro{" +
                "renavam=" + carro.getRenavam() +
                ", marca='" + carro.getMarca() + '\'' +
                ", modelo='" + carro.getModelo() + '\'' +
                ", cor='" + carro.getCor() + '\'' +
                ", anoFabricacao=" + carro.getAnoFabricacao() +
                '}';
    }

    @Override
    public String cadastrarMotocicleta(Motocicleta motocicleta) {
        return "Motocicleta{" +
                "renavam=" + motocicleta.getRenavam() +
                ", marca='" + motocicleta.getMarca() + '\'' +
                ", modelo='" + motocicleta.getModelo() + '\'' +
                ", cor='" + motocicleta.getCor() + '\'' +
                ", anoFabricacao=" + motocicleta.getAnoFabricacao() +
                '}';
    }
}