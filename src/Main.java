public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.selecionarMusica("Imagine");
        iphone.tocar();
        iphone.pausar();

        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://dio.me");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
