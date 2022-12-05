import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Perform "web search" (from a  file), notify the interested observers of each query.
 */
public class WebSearchModel {
    public interface QueryObserver {
        void onQuery(String query);
    }

    //No modelo de busca, crie uma nova interface que descreve a interface para um
    //objeto que definirá um filtro de consulta.
//    Um objeto de filtro de consulta terá um método que receberá uma string (a consulta)
//    e retornará true se o modelo de busca notificar o observador sobre essa consulta;
//    retorna false se o observador não estiver interessado nesta string (a consulta).
    public interface WebSearchFilter {
        public boolean filter(String query);
    }

    // creating variables filters and observers
    private final List<WebSearchFilter> filters = new ArrayList<>();
    private final File sourceFile;
    private final List<QueryObserver> observers = new ArrayList<>();

    public WebSearchModel(File sourceFile) {
        this.sourceFile = sourceFile;
    }

    public void pretendToSearch() {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
            while (true) {
                String line = br.readLine();
                if (line == null) {
                    break;
                }
                notifyAllObservers(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /*
     *   Altere o modelo de busca para que, quando um observador for registrado, o método
     *    de registro também aceita um objeto de filtro de consulta.
     */

    public void addQueryObserver(QueryObserver queryObserver, WebSearchFilter webSearchFilter) {
        observers.add(queryObserver);
        filters.add(webSearchFilter);
    }

    /**
     * Altere o modelo de busca para que, para cada consulta (string do arquivo), verifique
     * se um observador está interessado na consulta antes de notificá-la.
     */

    private void notifyAllObservers(String line) {
        // iterar sobre filtros
        for (int i = 0; i < filters.size(); i++){
//            check if line is on filter array
            if(filters.get(i).filter(line)){
//                if is true get observer and do a query
                observers.get(i).onQuery(line);
            }
        }
    }
}
