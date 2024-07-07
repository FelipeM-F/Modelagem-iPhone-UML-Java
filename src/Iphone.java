public class Iphone implements ReprodutorMusical, Telefone, Navegador {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada.");
    }

    @Override
    public void proximaFaixa() {
        System.out.println("Próxima faixa.");
    }

    @Override
    public void faixaAnterior() {
        System.out.println("Faixa anterior.");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero + "...");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }

    @Override
    public void voltarPagina() {
        System.out.println("Voltando para a página anterior.");
    }

    @Override
    public void avancarPagina() {
        System.out.println("Avançando para a próxima página.");
    }
}
