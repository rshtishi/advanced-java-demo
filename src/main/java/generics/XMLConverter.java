package generics;

public class XMLConverter implements Converter {

    private String type;

    public XMLConverter(){
        type="XML";
    }

    @Override
    public void convert() {
        System.out.println("Document converted to XML format.");
    }
}
