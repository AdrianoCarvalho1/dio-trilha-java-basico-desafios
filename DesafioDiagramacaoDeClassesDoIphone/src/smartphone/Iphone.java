package smartphone;

import multiFuncional.FuncionalidadesMultiFuncional;

public class Iphone extends FuncionalidadesMultiFuncional {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("AC/DC - Back In Black");

        iphone.exibirPagina("https://web.dio");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.ligar(11912);
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}

