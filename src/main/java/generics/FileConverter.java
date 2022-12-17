package generics;

public class FileConverter <T extends Converter> {

    private T converter;

    public FileConverter(T converter){
        this.converter = converter;
    }

    public void execute(){
        converter.convert();
    }

}
