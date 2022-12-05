/**
 * Watches the search queries
 */

/**
 * Altere o cliente (Snooper.java) para criar dois observadores de consulta:
 * 1. Um imprime "Oh Yes! <consulta>" sempre que a consulta contém a palavra
 * 'friend' (não diferencia maiúsculas de minúsculas).
 * 2. Um imprime "So long.... <consulta>" sempre que a consulta tiver mais de 60
 * caracteres.
 */
public class Snooper {
    private final WebSearchModel model;

    public Snooper(WebSearchModel model) {
        this.model = model;

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Son long... " + query);
            }
        }, new WebSearchModel.WebSearchFilter() {
            @Override
            public boolean filter(String query) {
                return query.length() > 60;
            }
        });

        model.addQueryObserver(new WebSearchModel.QueryObserver() {
            @Override
            public void onQuery(String query) {
                System.out.println("Oh Yes! " + query);
            }
        }, new WebSearchModel.WebSearchFilter() {
            @Override
            public boolean filter(String query) {
                return query.toLowerCase().contains("friend");
            }
        });
    }
}
