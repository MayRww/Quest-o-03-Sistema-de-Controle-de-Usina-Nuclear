public class EstadoAlertaAmarelo implements EstadoUsina {
    private long tempoInicio = System.currentTimeMillis();

    @Override
    public void monitorar(UsinaNuclear usina) {
        long duracao = (System.currentTimeMillis() - tempoInicio) / 1000;
        if (usina.getTemperatura() > 400 && duracao > 30) {
            usina.setEstado(new EstadoAlertaVermelho());
        } else {
            System.out.println("Alerta Amarelo. Temperatura elevada, monitorando...");
        }
    }

    @Override
    public String getNome() { return "ALERTA_AMARELO"; }
}
