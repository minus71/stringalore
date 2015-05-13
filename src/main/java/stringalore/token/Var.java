package stringalore.token;

public class Var extends Token {
	
	public Var(String text) {
		super(text);
	}
	
	@Override
	public TokenType getType() {
		return TokenType.VAR;
	}
	
	public String getName(){
		return text;
	}
	
	@Override
	public String toString() {
		
		return String.format("var(%s)", text);
	}
}
