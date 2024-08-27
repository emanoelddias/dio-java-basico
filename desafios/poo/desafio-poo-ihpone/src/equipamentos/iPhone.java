package equipamentos;

public class iPhone implements reprodutorMusical, aparelhoTelefonico , navegadorInternet {

    public void tocar(){   
        System.out.println("Tocando");
    }
    public void pausar(){
        System.out.println("Pausar musica");
    }
    public void selecionarMusica(String musica){
        System.out.println("Selecionada a musica : " + musica);
    }


    public void ligar(String numero){
        System.out.println("Ligar para o número : " + numero);
    }
    public void atender(){
        System.out.println("Atendendo telefone");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }


    public void exibirPagina(String url){
        System.out.println("Entrando na pagina :" + url);
    } 
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    } 
    public void atualizarPagina(){
        System.out.println("Atualizando pagina");
    }

}
