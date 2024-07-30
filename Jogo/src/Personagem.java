public abstract class Personagem  {
    private String nome;
    private int vitalidade;
    private Jogo jogo;
    private Jogavel jogavel;


    public Personagem(String nome, int vitalidade, Jogo jogo) {
        this.nome = nome;
        if(this.vitalidade <= 100 && this.vitalidade >= 0){
            this.vitalidade = vitalidade;
        } else{
            this.vitalidade = vitalidade * 0;
        }
        this.jogo = jogo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitalidade() {
        return this.vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public Jogo getJogo() {
        return this.jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
   

    public void aplicarGolpeNormal(Personagem adversario){
        vitalidade = vitalidade - 10;
    }

    public abstract void aplicarGolpeEspecial();
}
