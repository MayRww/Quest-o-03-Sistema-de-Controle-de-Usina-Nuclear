public class EstadoDesligada implements EstadoUsina {
    @Override
    public void monitorar(UsinaNuclear usina) {
        if (usina.getTemperatura() > 50) {
            usina.setEstado(new EstadoOperacaoNormal());
        } else {
            System.out.println("Usina desligada. Temperatura estável.");
        }
    }
    @Override
    public String getNome() { return "DESLIGADA"; }
}
