package week1;

public class PdfDocumentFactory extends DocumentFactory {
    
    public Document createDocument() {
        return new PdfDocument();
    }
}
