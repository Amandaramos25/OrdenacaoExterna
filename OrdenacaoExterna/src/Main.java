import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        OrdenacaoInterna oi = new OrdenacaoInterna();
        File arqOrigin = new File("C://Users//Ryan//Documents//GitHub//OrdenacaoExterna//OrdenacaoExterna//arquivos//ordExt_teste.txt");
        Scanner leitor = new Scanner(arqOrigin);
        int i = 1;
        int numGrupo = 1;
        int left = 0;
        int right = i-1;
        while (leitor.hasNextLine()) {
            String strnumGrupo = "arq"+numGrupo+".txt";
            File novoArquivo = new File(strnumGrupo);
            FileWriter escrever = new FileWriter(strnumGrupo);
            Double numerosDesondenados[] = new Double[i];
            while (i<=3 && leitor.hasNextLine()) {
                escrever.write(leitor.nextLine());
                numerosDesondenados[i] = Double.parseDouble(leitor.nextLine());
                i++;
            }
            //ordenação interna
            oi.Quicksort(numerosDesondenados, left, right);
            escrever.close();
            numGrupo++;
            i=0;
        }
        leitor.close();
    }
}
