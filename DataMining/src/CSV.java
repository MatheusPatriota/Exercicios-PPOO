public class CSV extends Document {

    private String path;

    public CSV(String path) {
        super();
        this.path = path;
    }

    @Override
    void openFile() {
        System.out.println("Document PATH:" + path + " TYPE: .csv was opened.");
    }

    @Override
    void closeFile() {
        System.out.println("Document PATH:" + path + " TYPE: .csv was closed.");
    }

    @Override
    void extract() {
        System.out.println("Document .csv was extracted.");
    }

    @Override
    void convertFile() {
        System.out.println("Document .csv was converted.");
    }

}
