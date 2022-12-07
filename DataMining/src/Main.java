import java.util.ArrayList;
import java.util.List;

/**
 * Suponha que você está criando um aplicativo de mineração de dados que analisa
 * documentos de empresas. Os usuários alimentam os documentos do aplicativo em vários
 * formatos (PDF, DOC, CSV), e tentam extrair dados significativos desses documentos em
 * um formato uniforme. A primeira versão do aplicativo só funciona com arquivos DOC. Na
 * versão seguinte, foi capaz de suportar arquivos CSV. Um mês depois, você o “ensinou” a
 * extrair dados de arquivos PDF.
 *
 * Em algum momento, você notou que todas as três classes têm muito código semelhante.
 * Enquanto o código para lidar com vários formatos de dados é totalmente diferente em todas
 * as classes (por exemplo, abrir, fechar arquivos, extrair, converter dados), o código para
 * processamento e análise de dados é quase idêntico (por exemplo, analisar os dados, enviar
 * relatórios). Como evitar a duplicação de código, mantendo a estrutura do algoritmo intacta
 * nesse cenário?
 *
 * Usando o padrão Template Method, modele (diagrama de classes), codifique e simule a
 * situação acima.
 */
public class Main {
    public static void main(String[] args) {

            List<Document> docs = new ArrayList<>();
            docs.add(new PDF("myPdf.pdf"));
            docs.add(new CSV("myCsv.csv"));
            docs.add(new DOC("myDoc.doc"));

            for (Document doc: docs) {
                doc.run();
                System.out.println("\n");
            }

    }
}