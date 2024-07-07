public class Main {

    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        try {
            iphone.tocarMusica();
            iphone.pausarMusica();
            iphone.proximaFaixa();
            iphone.faixaAnterior();
            iphone.fazerChamada("1234567890");
            iphone.atenderChamada();
            iphone.encerrarChamada();
            iphone.abrirPagina("https://www.google.com");
            iphone.atualizarPagina();
            iphone.voltarPagina();
            iphone.avancarPagina();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

}