public class VeiculoClass {
   private String marca;
   private String modelo;
   private String cor;
   private int anoFabricacao;
   private int quilometragem;
   private int velocidadeMaxima;

public VeiculoClass(String marca, String modelo,String cor, int anoFabricacao, int quilometragem, int velocidadeMaxima){
    this.marca= marca;
    this.modelo = modelo;
    this.cor = cor;
    this.anoFabricacao = anoFabricacao;
    this.quilometragem = quilometragem;
    this.velocidadeMaxima = velocidadeMaxima;
 
}


    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getanoFabricacao() {
        return this.anoFabriacao;
    }

    public void setanoFabricacao(int anoFabricação) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getQuilometragem() {
        return this.quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int getvelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setvelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public void deslocar(){
        System.out.println("VRUM");
    }
    public void frear(){
        System.out.println("Skrrr");
    }

}
