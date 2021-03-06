package parser.cartas;

import model.Usuario;

public final class LetterGenerator {
	
	public static void generateTxtLetter(Usuario Usuario) {
		new TxtLetter().createLetter(Usuario);
	}
	
	public static void generateWordLetter(Usuario Usuario) {
		new WordLetter().createLetter(Usuario);
	}
	
	public static void generatePdfLetter(Usuario Usuario) {
		new PdfLetter().createLetter(Usuario);
	}
	
}
