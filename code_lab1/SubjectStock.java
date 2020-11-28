import abstraction.Observer;
import abstraction.Subject;
import helper.StockThresholdMapping;

import java.util.ArrayList;

public class SubjectStock implements Subject {
	private String name;
	private int curPrice;
	private int oldPrice;
	private int curAmount;
	private StockThresholdMapping thresholdMapping;
	private ArrayList<Observer> arr;

	public SubjectStock (String name, int priceLow, int priceHigh, int[] amountThresh) {
		this.name = name;
		this.thresholdMapping =
			new StockThresholdMapping(amountThresh, priceLow, priceHigh);
		this.curPrice = priceLow;
		this.curAmount = 0;
		this.arr = new ArrayList<>();
	}

	public int curPriceGetter() { return this.curPrice; }
	public String getName() { return this.name; }

	@Override
	public void register(Observer newObs) {
		/* append obs to list
		 * ->change price
		 * ->notify
		 */
		this.arr.add(newObs);
		int addAmount = ((ObserverClient)newObs).amountGetter(this);
		this.curAmount += addAmount;
		this.oldPrice = this.curPrice;
		this.curPrice = this.thresholdMapping.calc(this.curAmount);
		notifyAllObservers();
	}

	@Override
	public void unregister(Observer rmObs) {
		/* remove obs from list
		 * ->change price
		 * ->notify
		 */
		int rmIdx = this.arr.indexOf(rmObs);
		this.arr.remove(rmIdx);
		int returnAmount = ((ObserverClient)rmObs).amountGetter(this);
		this.curAmount -= returnAmount;
		this.oldPrice = this.curPrice;
		this.curPrice = this.thresholdMapping.calc(this.curAmount);

		if (this.arr.size() > 0) notifyAllObservers();
	}

	@Override
	public void notifyAllObservers() {
		/* check conditions
		 * ->notify
		 */
		
		if (Math.abs(this.curPrice - this.oldPrice) / (this.oldPrice + 0.1) < 0.1) return;
		
		System.out.println("At this notification "
			+ this.name + "'s price is "
			+ "from " + this.oldPrice + " to " + this.curPrice + ":");

		for (Observer obs : this.arr) {
			if (((ObserverClient)obs).
				hopingToBeNotified(this, Math.abs(this.oldPrice - this.curPrice))) {
				obs.update();
			}
		}
	}
}
