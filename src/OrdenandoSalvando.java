import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class OrdenandoSalvando {

    public void lerarquivos(String pasta) throws IOException {
        try {
            for (int j = 1; j <= 10; j++) {
                String arquivo = "arq" + j + ".txt";
                String Novoarquivo;
                System.out.println(pasta + "\\" + arquivo); // lista o arquiv e a pasta
                System.out.println("Teste pasta: " + pasta);

                // Criando vetor com o tamanho da pasta
                // int n[] = new int[]{100, 1000, 10000, 50000, 100000};

                int vetor[] = new int[Integer.parseInt(pasta)];

                // LEITURA
                System.out.println("Lendo o arquivo: " + arquivo);

                BufferedReader buffRead = new BufferedReader(new FileReader(pasta + "\\" + arquivo));

                String linha = buffRead.readLine();

            
                
                

                int contador = 0;

                while ((linha = buffRead.readLine()) != null) {
                                        
                    vetor[contador] = Integer.parseInt(linha); // guardando em um vetor
                    
                    
                    contador++;
                }
                buffRead.close();

                //countSort(vetor, Integer.parseInt(pasta)); // ORDENANDO

                Bubble_sort(vetor, vetor.length);

                // escrever num arquivo novo

                // acrescentando "_ord" ao nome do arquivo
                // removendo .txt do arquivo
                // descobrindo quantos caracteres o "nome do arquivo" tem
                int tam = arquivo.length();

                // removendo ".txt" do arquivo
                Novoarquivo = arquivo.substring(0, tam - 4);

                // adicionando "_ord" ao nome do arquivo
                Novoarquivo += "_ord.txt";

                BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pasta + "\\" + Novoarquivo, true));

                for (int k = 0; k < Integer.parseInt(pasta) ; k++) {
                    buffWrite.append(vetor[k] + "\n");
                }

                buffWrite.close();
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }

        // 100, 1000, 10000, 50000, 100000

    }

    public void countSort(int array[], int size) {
        int[] output = new int[size + 1];

        // Find the largest element of the array
        int max = array[0];
        for (int i = 1; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        int[] count = new int[max + 1];

        // Initialize count array with all zeros.
        for (int i = 0; i < max; ++i) {
            count[i] = 0;
        }

        // Store the count of each element
        for (int i = 0; i < size; i++) {
            count[array[i]]++;
        }

        // Store the cummulative count of each array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = size - 1; i >= 0; i--) {
            output[count[array[i]] - 1] = array[i];
            count[array[i]]--;
        }

        // Copy the sorted elements into original array
        for (int i = 0; i < size; i++) {
            array[i] = output[i];
        }
    }

    //BUBBLE SORT
    public static void Bubble_sort(int vetor[], int tamanho) {
        boolean flag = true;
        do {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < (tamanho - 1 - i); j++) {
                    if (vetor[j] > vetor[j + 1]) {
                        int aux = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = aux;
                    } else {
                        flag = false;
                    }
                }
            }
        } while (flag == true);
    }

}
