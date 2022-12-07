public class PDF extends Document {

    private String path;

    public PDF(String path) {
        super();
        this.path = path;
    }

    @Override
    void openFile() {
        System.out.println("Document PATH:" + path + " TYPE: .pdf was opened.");
    }

    @Override
    void closeFile() {
        System.out.println("Document PATH:" + path + " TYPE: .pdf was closed.");
    }

    @Override
    void extract() {
        System.out.println("Document .pdf was extracted.");
    }

    @Override
    void convertFile() {
        System.out.println("Document .pdf was converted.");
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}