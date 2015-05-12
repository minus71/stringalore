package stringalore.fun;

import com.google.common.base.Optional;

public interface FunMap<K,V> {
	
	/**
	 * A functional implementation of a map from K to Optional<V>
	 * 
	 * It can be implemented with a simple Map<K,V> which does not return but Absent.
	 *  
	 * @param key
	 * @return an Option(value) or Absent
	 */
	Optional<V> map(K key);
}
