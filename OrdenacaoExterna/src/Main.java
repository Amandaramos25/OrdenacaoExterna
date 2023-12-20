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

        Double numerosDesondenados[] = new Double[n+1];
        while (leitor.hasNextLine()) { //enquanto tiver instancias no arquivo original
    
            
            while (i<3 && leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                Double numero = Double.parseDouble(linha);
                //System.out.println(i);
                //System.out.println(numero);
                numerosDesondenados[i] = numero;
                i++;
            }
            //ordenação interna
            i=0;
            oi.Quicksort(numerosDesondenados, left, right);
            gravar(numGrupo, numerosDesondenados);
            numGrupo++;
            clear(numerosDesondenados);
        }
        leitor.close();
        intercalar(numGrupo);

    }

    public static void intercalar(int numGrupos){
        for(int k=0;k<3;k++){
            
        }

    }

    public static void gravar(int numGrupo,Double numerosDesondenados[]) throws IOException{
        String strnumGrupo = "OrdenacaoExterna/arquivos/copias/arq"+numGrupo+".txt"; //nome do arquivo novo
        File novoArquivo = new File(strnumGrupo); //criando arquivo novo
        FileWriter escrever = new FileWriter(novoArquivo); //escrever no arquivo
        
        for (int i = 0; i < numerosDesondenados.length; i++){
            String linha = String.valueOf(numerosDesondenados[i]);
            escrever.write(linha+"\n");
        }
        escrever.close();
    }
    public static void clear(Double numerosDesondenados[]) {

		for (int i = 0; i < numerosDesondenados.length; i++) {

			numerosDesondenados[i] = null;
		}
	}
}
