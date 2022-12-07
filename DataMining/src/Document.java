public abstract class Document {

    abstract void openFile();
    abstract void closeFile();
    abstract void extract();
    abstract void convertFile();

    public void analyzeData() {
        System.out.println("Data was analyzed !");
    }

    public void sendReports() {
        System.out.println("Reports was sended.");
    }

    public final void run() {
        openFile();
        extract();
        convertFile();
        analyzeData();
        sendReports();
        closeFile();
    }
}
