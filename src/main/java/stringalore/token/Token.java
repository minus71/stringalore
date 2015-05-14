package stringalore.token;
import static java.lang.String.format;

import java.util.Collections;
import java.util.List;

import stringalore.token.annotations.TokenName;
/**
 * The token class
 * @author m.minutolo
 *
 */
public abstract class Token{

	protected final String source;
	protected final String name;
	
	protected Token(String source) {
		super();
		this.source = source;
		Class<? extends Token> clazz = this.getClass();
		TokenName withName = clazz.getAnnotation(TokenName.class);
		name = withName==null?clazz.getName():withName.value();
	}
	
	
	@Override
	public String toString() {
		return format("%s(%s)",name,source);
	}

	@SuppressWarnings("unchecked")
	public static Sequence seq(List<Token> tokens){
		tokens=tokens!=null?tokens:(Collections.EMPTY_LIST);
		StringBuilder builder = new StringBuilder();
		for (Token token : tokens) {
			builder.append(token.source);
		}
		return new Sequence(builder.toString(),tokens);
	}
}
