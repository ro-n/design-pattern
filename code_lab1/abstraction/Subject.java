package abstraction;

public interface Subject {
	public abstract void register(Observer obs);
	public abstract void unregister(Observer obs);
	public abstract void notifyAllObservers();
}
