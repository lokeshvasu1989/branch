import java.io.File;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDoc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("fl.docx");
FileInputStream fis = new FileInputStream(file);
XWPFDocument document = new XWPFDocument(fis);

// Get all paragraphs in the document
for (XWPFParagraph paragraph : document.getParagraphs()) 
{
// Print the text of each paragraph
System.out.println(paragraph.getText());
			
		}
	}
}	
			
	


