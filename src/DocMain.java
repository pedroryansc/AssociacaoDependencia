public class DocMain {
	public static void main(String[] args) {
		Documento doc = new Documento("Ahsoka");
		// doc.setTexto("Ahsoka");
		
		Impressora imp = new Impressora(doc);
		System.out.print(imp.imprimir());
	}
}
