package stringalore.token;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import stringalore.token.annotations.TokenName;

import com.google.common.base.Joiner;

@TokenName("Seq")
public class Sequence extends Token {
	private final List<Token> elements;
	
	protected Sequence(String source, List<Token> tokens ) {
		super(source);
		elements=Collections.unmodifiableList(tokens);
	}

	public Iterable<Token> getElements() {
		return elements;
	}
	
	@Override
	public String toString() {
		String sub = Joiner.on(',').join(elements);
		return sub;
	}
	
	public Sequence add(Token t) {
		List<Token> newList = new LinkedList<Token>(elements);
		newList.add(t);
		return Token.seq(newList);
	}
	
	public Sequence concat(Sequence s2){
		List<Token> newList = new LinkedList<Token>(elements);
		newList.addAll(s2.elements);
		return Token.seq(newList);
	}
}
