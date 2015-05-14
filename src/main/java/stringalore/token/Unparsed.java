package stringalore.token;

import stringalore.token.annotations.TokenName;

@TokenName("_")
public class Unparsed extends Token {

	public Unparsed(String source) {
		super(source);
	}

}
