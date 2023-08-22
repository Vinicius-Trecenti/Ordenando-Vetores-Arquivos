import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

public class App {

    String pastaNumero;
    public static void main(String[] args) throws Exception {

        // //Criando as pastas e os arquivos
        // String nomesPastas[] = {"100", "1000", "10000", "50000", "100000"};

        // Arquivos arq = new Arquivos();

        // GeradorPastas geradorPastas = new GeradorPastas();

        // File caminhoAtual = new File("");

        // for(String nomes : nomesPastas){
        //     String caminhoCriacaoPasta = geradorPastas.gerarpastas(caminhoAtual.getAbsolutePath(), nomes);

        //     int valorPasta = Integer.parseInt(nomes);
        //     int MenorValor = 0;
        //     int MaiorValor = valorPasta;

        //     for(int i=1; i<=10; i++){

        //         arq.write(caminhoCriacaoPasta + "\\arq" + i + ".txt", MaiorValor, MenorValor);

        //         MaiorValor += valorPasta;
        //         MenorValor += valorPasta;   
        //     }

        // }

        int n[] = new int[]{100, 1000, 10000, 50000, 100000};
        for(int i = 0; i<5; i++){
            OrdenandoSalvando objeto = new OrdenandoSalvando();
            String pasta = String.valueOf(n[i]);

            objeto.lerarquivos(pasta);
        }

       

    }
}
