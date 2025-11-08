public class EstadoOperacaoNormal implements EstadoUsina {
    @Override
    public void monitorar(UsinaNuclear usina) {
        if (usina.getTemperatura() > 300) {
            usina.setEstado(new EstadoAlertaAmarelo());
        } else {
            System.out.println("Operação normal. Temperatura segura.");
        }
    }
    @Override
    public String getNome() { return "OPERACAO_NORMAL"; }
}
