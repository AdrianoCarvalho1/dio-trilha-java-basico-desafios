package multiFuncional;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class FuncionalidadesMultiFuncional implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    public void tocar() {
        System.out.println("Tocando");
    }
    public void pausar() {
        System.out.println("Pausar");
    }
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando uma pagina");
    }
    public void ligar(int numero) {
        System.out.println("Ligando");
    }
    public void atender() {
        System.out.println("Atender");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando um correio de voz");
    }
}