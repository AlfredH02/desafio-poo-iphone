import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Iphone iphone = new Iphone(2024, "Iphone 14", "(11)99970-7070");


        System.out.println("Informe as músicas para adicionar a playlist");
        String musicas = scanner.nextLine();

        String nomesDelimitados[] = musicas.split(",");

        ArrayList<String> playlistMusicas = new ArrayList<String>();
        for(int i = 0; i < nomesDelimitados.length; i++){

            String musica = nomesDelimitados[i];
            playlistMusicas.add(musica);
        }
        System.out.println(playlistMusicas);
        iphone.setMusicas(playlistMusicas.toArray(new String[0]));
        for(String musica : iphone.getMusicas()){
            iphone.selecionarMusica(musica);
            iphone.tocar();
        }
        iphone.pausar();

        System.out.println("Informe o número para fazer a ligação: ");
        String numeroLigar = scanner.next();

        iphone.ligar(numeroLigar);
        iphone.atender();
        iphone.iniciarCorreioVoz();

        System.out.println("Informe a url do site para acessar na internet");
        String url = scanner.next();

        iphone.adicionarNovaAba();
        iphone.exibirPagina(url);
        iphone.atualizarPagina();

        scanner.close();
    }
}
