public class NaoJogavel {
    private boolean aliado;
    private Personagem personagem;


    public NaoJogavel() {
        aliado = true;
    }

    public boolean isAliado() {
        return this.aliado;
    }

    public boolean getAliado() {
        return this.aliado;
    }
    
    public Personagem getPersonagem(){
        return personagem;
    }

    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }

    public void setAliado(boolean aliado) {
        this.aliado = aliado;
    }

    public void aplicarGolpeEspecial(){
        if(Jogo(get.dificuldade() == "Easy")){
            return getPersonagem((adversario).get(vitalidade)) = setPersonagem(adversario).set(vitalidade) - 20;
        }
        else if(Jogo(get.dificuldade() == "Medium")){
            return getPersonagem((adversario).get(vitalidade)) = setPersonagem(adversario).set(vitalidade) - 30;
        }
        else if(Jogo(get.dificuldade() == "Hard")){
            return getPersonagem((adversario).get(vitalidade)) = setPersonagem(adversario).set(vitalidade) - 40;
        }
    }
}
