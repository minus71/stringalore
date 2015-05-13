package stringalore.token;


public class Lit extends Token {
	
	public Lit(String text) {
		super(text);
	}
	
	@Override
	public TokenType getType() {
		return TokenType.LIT;
	}
	
	public String getString(){
		return text;
	}
	
	@Override
	public String toString() {
		return String.format("lit(%s)",text);
	}
}
