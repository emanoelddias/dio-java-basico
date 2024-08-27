package cliente;
import equipamentos.*;

public class usuario {
    public static void main(String[] args) throws Exception {
        iPhone iphone = new iPhone();

        //Navegador de internet
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.google.com.br");

        //aparelho telefonico 
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar("11 99999-9999");

        // Reprodutor Musical
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Evidencias");
    }
}
