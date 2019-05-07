package ar.com.fjs.recognition;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

/**
 * Hello world!
 *
 */
public class App {
	
	public String getImgText(String imageLocation) {
		ITesseract instance = new Tesseract();
		
		try {
			instance.setDatapath("/usr/local/share/tessdata/");
			instance.setLanguage("spa");
			return instance.doOCR(new File(imageLocation));
		} catch (TesseractException e) {
			e.getMessage();
			return "Error while reading an image";
		}
	}
	
	public static void main(String[] args) {
		App app = new App();
		
		System.out.println("Iniciando la lectura de la imagen...");
		System.out.println(app.getImgText("images/sample2.jpg"));
	}
}
