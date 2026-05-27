public class TestePecas {
    public static void main(String[] args) {
        System.out.println("Teste de peças nacional");
        Peca p1 = new Peca("Servomotor 10kg/cm", 100.0f, 50.0f);
        p1.exibir();

        System.out.println("Teste de peças importadas");
        PecaImportada p2 = new PecaImportada("Microcontrolador ARM", 200.0f, 80.0f, 30.0f, 20.0f);

        p2.exibir(); //Java vai usar Override para chamar o metodo exibir da classe PecaImportada, que por sua vez chama o metodo exibir da classe Peca para mostrar os dados basicos da peça e depois mostra as taxas de importaçao e frete, alem do preço final com as taxas.
    }
}
