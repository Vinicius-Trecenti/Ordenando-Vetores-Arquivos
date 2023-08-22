import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFileChooser;

public class Arquivos {
    JFileChooser chooser = new JFileChooser();
    int returnValue;

    public void write(String caminho_pasta, int MaiorValor, int MenorValor) {
        try {
            FileWriter writer = new FileWriter(caminho_pasta, false);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            int numeroAleatorio;
            
            for (int i = MenorValor; i < MaiorValor; i++) {
                numeroAleatorio = (int) Math.floor(MenorValor + (Math.random() * (MaiorValor - MenorValor)));
                bufferWriter.append(numeroAleatorio + "\n");
            }      

            bufferWriter.close();
            writer.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    } 
}
