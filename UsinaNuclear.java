public class UsinaNuclear {
    private EstadoUsina estadoAtual;
    private double temperatura;
    private boolean falhaResfriamento;
    private boolean modoManutencao;

    public UsinaNuclear() {
        this.estadoAtual = new EstadoDesligada(); // estado inicial
    }

    public void setTemperatura(double temperatura) { this.temperatura = temperatura; }
    public double getTemperatura() { return temperatura; }

    public void setFalhaResfriamento(boolean falha) { this.falhaResfriamento = falha; }
    public boolean isFalhaResfriamento() { return falhaResfriamento; }

    public boolean isModoManutencao() { return modoManutencao; }
    public void setModoManutencao(boolean m) { this.modoManutencao = m; }

    public void setEstado(EstadoUsina novoEstado) {
        System.out.println("Transição: " + estadoAtual.getNome() + " → " + novoEstado.getNome());
        this.estadoAtual = novoEstado;
    }

    public void monitorar() {
        if (modoManutencao) {
            new EstadoManutencao().monitorar(this);
        } else {
            estadoAtual.monitorar(this);
        }
    }

    public String getEstadoAtual() { return estadoAtual.getNome(); }
}
