import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        OrdenacaoInterna oi = new OrdenacaoInterna();
        File arqOrigin = new File("C://Users//Amanda//Documents//GitHub//WebIITPI//OrdenacaoExterna//OrdenacaoExterna//arquivos//testeMenor.txt");
        Scanner leitor = new Scanner(arqOrigin);
        int i = 0;
        int numGrupo = 0;
        int n = 2, left=i, right=n;

        Double numerosDesondenados[] = new Double[n];
        while (leitor.hasNextLine()) { //enquanto tiver instancias no arquivo original
            String strnumGrupo = "arq"+numGrupo+".txt"; //nome do arquivo novo
            File novoArquivo = new File(strnumGrupo); //criando arquivo novo
            FileWriter escrever = new FileWriter(novoArquivo); //escrever no arquivo
            
            while (i<3 && leitor.hasNextLine()) {
                escrever.write(leitor.nextLine());
                System.out.println(i);
                numerosDesondenados[i] = Double.parseDouble(leitor.nextLine());
                System.out.println(numerosDesondenados[i]);
                i++;
            }
            //ordenação interna
            //oi.Quicksort(numerosDesondenados, left, right);
            escrever.close();
            numGrupo++;
            i=0;
            clear(numerosDesondenados);
        }
        leitor.close();
    }
    public static void clear(Double numerosDesondenados[]) {

		for (int i = 0; i < numerosDesondenados.length; i++) {

			numerosDesondenados[i] = null;
		}
	}
}
