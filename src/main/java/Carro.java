
public class Carro implements Veiculo {

    private int renavam;
    private String marca;
    private String modelo;
    private String cor;
    private int anoFabricacao;

    public Carro(int renavam, String marca, String modelo, String cor, int anoFabricacao) {
        this.renavam = renavam;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
    }

    public int getRenavam() {
        return renavam;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String accept(Visitor visitor) {
        return visitor.cadastrarCarro(this);
    }
}