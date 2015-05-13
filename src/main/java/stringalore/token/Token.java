package stringalore.token;
/**
 * The token class
 * @author m.minutolo
 *
 */
public abstract class Token {
	protected final String text;

	public abstract TokenType getType();
	
	protected Token(String text){
		this.text=text;
	}

	public String getText() {
		return text;
	}
	
	public static Lit lit(String text){
		return new Lit(text);
	}
	public static Var var(String text){
		return new Var(text);
	}
}
