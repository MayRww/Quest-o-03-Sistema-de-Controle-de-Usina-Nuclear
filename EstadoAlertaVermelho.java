public class EstadoAlertaVermelho implements EstadoUsina {
    @Override
    public void monitorar(UsinaNuclear usina) {
        if (usina.isFalhaResfriamento()) {
            usina.setEstado(new EstadoEmergencia());
        } else {
            System.out.println("ALERTA VERMELHO! Risco alto, verificando resfriamento...");
        }
    }
    @Override
    public String getNome() { return "ALERTA_VERMELHO"; }
}
