public class EstadoEmergencia implements EstadoUsina {
    @Override
    public void monitorar(UsinaNuclear usina) {
        System.out.println("EMERGÊNCIA ATIVADA! Iniciando desligamento imediato!");
        usina.setEstado(new EstadoDesligada());
    }
    @Override
    public String getNome() { return "EMERGENCIA"; }
}
