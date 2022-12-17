package generics;

public class PDFConverter implements Converter{

    private String type;

    public PDFConverter(){
        type = "PDF";
    }

    @Override
    public void convert() {
        System.out.println("Document converted to PDF format");
    }
}
