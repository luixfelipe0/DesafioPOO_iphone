package iphone;

import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private String musica;
    private String contato;
    private String pagina;

    @Override
    public void ligar(String contato) {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz(String contato) {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void exibirPagina(String pagina) {
        System.out.println("Exbibindo página...");
    }

    @Override
    public void atualizarPagina(String pagina) {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        System.out.println("Adicionando nova aba...");
    }

    @Override
    public void tocar() {
        System.out.println("Play...");
    }

    @Override
    public void pausar() {
        System.out.println("Pause...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música escolhida...");
    }
}
