public class Main {
    public static void main(String[] args) {
        UsinaNuclear usina = new UsinaNuclear();

        usina.setTemperatura(100);
        usina.monitorar(); // DESLIGADA → OPERACAO_NORMAL

        usina.setTemperatura(320);
        usina.monitorar(); // OPERACAO_NORMAL → ALERTA_AMARELO

        usina.setTemperatura(410);
        try { Thread.sleep(31000); } catch (InterruptedException e) {}
        usina.monitorar(); // ALERTA_AMARELO → ALERTA_VERMELHO

        usina.setFalhaResfriamento(true);
        usina.monitorar(); // ALERTA_VERMELHO → EMERGENCIA → DESLIGADA

        usina.setModoManutencao(true);
        usina.monitorar(); // MANUTENCAO
    }
}
