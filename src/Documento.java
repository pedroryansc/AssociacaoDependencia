public class Documento {

	private String texto;

	public Documento() {
		
	}
	// Este primeiro construtor, por estar vazio, permite criar um objeto sem passar os parâmetros
	
	public Documento(String texto) {
		setTexto(texto);
	}
	
	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [texto=");
		builder.append(texto);
		builder.append("]");
		return builder.toString();
	}

}
