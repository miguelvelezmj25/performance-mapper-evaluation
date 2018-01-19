package other;

public class Pair<T1,T2> {
	T1 first;
	T2 second;
	public Pair(T1 first, T2 second) {
		super();
		this.first = first;
		this.second = second;
	}
	public T2 getSecond() {
		return second;
	}
	/** Alias for "getSecond".
	 * @return
	 */
	public T2 _2() {
		return second;
	}
	
	public T1 getFirst() {
		return first;
	}
	/** Alias for "getFirst".
	 * @return
	 */
	public T1 _1() {
		return first;
	}
}
