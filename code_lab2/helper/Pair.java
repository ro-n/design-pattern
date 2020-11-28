package helper;

public class Pair<V, K> {
	V first;
	K second;
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(V v, K k) {
		this.first = v;
		this.second = k;
	}
	public V getKey() {
		return first;
	}
	public void setKey(V first) {
		this.first = first;
	}
	public K getValue() {
		return second;
	}
	public void setValue(K second) {
		this.second = second;
	}
	
}
