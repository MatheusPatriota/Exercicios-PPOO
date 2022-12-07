public class DOC extends Document{

    private String path;

    public DOC(String path) {
        super();
        this.path = path;
    }

    @Override
    void openFile() {
        System.out.println("Document PATH:" + path + " TYPE: .doc was opened.");
    }

    @Override
    void closeFile() {
        System.out.println("Document PATH:" + path + " TYPE: .doc was closed.");
    }

    @Override
    void extract() {
        System.out.println("Document .doc was extracted.");
    }

    @Override
    void convertFile() {
        System.out.println("Document .doc was converted.");
    }

}
