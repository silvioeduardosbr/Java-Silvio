package ProjetoTeste;

public class Conta{
    private String idiomaPreferencial;
    private String resolucaoTela;

    
    
    void entrar(){
        buscarPreferenciasUsuario();
        ididentificarResolucao();
    }

    private void buscarPreferenciasUsuario(){
        idiomaPreferencial = "PT-BR";

    }

    private void ididentificarResolucao(){
        resolucaoTela = "Full HD";
    }

    void assistirFilme(String nomeFilme){
        System.out.println("Iniciando o filme "+nomeFilme);
        System.out.println("Carregando o filme na resolucao "+ resolucaoTela);
        carregandoAudioFilme();
    }

    private void carregandoAudioFilme(){
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("Carregando em "+ idiomaPreferencial);
        }else 
        {
            System.out.println("Carregando em EN-US");
        }
    }
}