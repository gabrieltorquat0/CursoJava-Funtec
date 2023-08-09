
class Respostas {
    private String resposta;

    public Respostas(String resposta) {
        this.resposta = resposta;
    }

    @Override
    public String toString() {
        return resposta;
    }
    
    public boolean respostaS() {
        return resposta.equalsIgnoreCase("S");
    }
}