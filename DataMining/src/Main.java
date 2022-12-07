import java.util.ArrayList;
import java.util.List;

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