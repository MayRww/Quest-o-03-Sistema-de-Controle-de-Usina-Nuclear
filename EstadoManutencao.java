public class EstadoManutencao implements EstadoUsina {
    @Override
    public void monitorar(UsinaNuclear usina) {
        System.out.println("[MODO MANUTENÇÃO] Monitoramento suspenso temporariamente.");
    }
    @Override
    public String getNome() { return "MANUTENCAO"; }
}
