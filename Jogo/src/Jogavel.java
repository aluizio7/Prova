public abstract class Jogavel implements Controle{
    private int nivel;
    private Personagem personagem;

    public Jogavel() {
        nivel = 1;
        while(nivel < 5){
            nivel++;
        }
    }
   
    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Personagem getPersonagem(){
        return personagem;
    }

    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }

    public void aplicarGolpeEspecial(Personagem adversario){
        getPersonagem(vitalidade) = setPersonagem(vitalidade) - 10;
    }

    @Override
    public Personagem botaoA() {
        return aplicarGolpeNormal(Personagem);
    }

    @Override
    public Personagem botaoB() {
        return aplicarGolpeEspecial(Personagem);
    }
   
}
