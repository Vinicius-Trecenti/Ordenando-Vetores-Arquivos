import java.io.File;

public class GeradorPastas {
    
    public String gerarpastas(String caminho, String nome) {
        File pasta = new File(caminho + "\\" + nome);

        if(!pasta.exists()){
            pasta.mkdir();
            System.out.println("Pasta criada: " + pasta.getAbsolutePath());
        }

        return pasta.getAbsolutePath();
    }
    
}
