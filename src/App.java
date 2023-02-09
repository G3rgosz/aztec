import com.aspose.barcode.generation.BarcodeGenerator;
import com.aspose.barcode.generation.EncodeTypes;

public class App {
    public static void main(String[] args) throws Exception {
        BarcodeGenerator generator = new BarcodeGenerator(EncodeTypes.AZTEC);
        generator.setCodeText("https://github.com/G3rgosz");
        generator.save("output.png"); 

    }
}
