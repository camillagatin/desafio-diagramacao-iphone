package componente_iphone;

import funcionalidades.internet.NavegadorInternet;
import funcionalidades.ipod.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void tocar() {
        System.out.println("Tocando música");
    }
    public void pausar() {
        System.out.println("Pausando música");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }
    public void atender() {
        System.out.println("Atendendo ligação");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }

}
