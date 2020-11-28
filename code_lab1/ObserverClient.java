import abstraction.ClientThresholdMapping;
import abstraction.Observer;
import helper.*;
import java.util.HashMap;
import java.util.LinkedList;

public class ObserverClient implements Observer {
	private String name;
	
	private HashMap<SubjectStock, ClientLogic> mapStock;
	
	public ObserverClient(String name) { this.name = name; this.mapStock = new HashMap<>(); }
	
	public void buyNewStock(SubjectStock stock, int amount, int threshSell, int threshUpdate) {
		mapStock.put(stock, new ClientLogic(amount, threshSell, threshUpdate));
		stock.register(this);
	}
	
	public int amountGetter(SubjectStock stock) {
		return this.mapStock.get(stock).getAmount();
	}
	
	public boolean hopingToBeNotified(SubjectStock stock, int gap) {
		return this.mapStock.get(stock).considerBeingNotifiedAt(gap);
	}
	
	@Override
	public void update() {
		/* check conditions
		 * ->update
		 */
		
		LinkedList<SubjectStock> toRemove = new LinkedList<>();
		int countDownSize = mapStock.size();
		for (SubjectStock curStock : this.mapStock.keySet()) {
			int price = curStock.curPriceGetter();
			boolean isSelling = this.mapStock.get(curStock).
					considerSellingAt(price);
			if (countDownSize > 1 && isSelling) {
				System.out.println(this.name + " harbours "
						+ countDownSize + " stock(s) (selling thresh: "
						+ this.mapStock.get(curStock).getThresh() + " for "
						+ curStock.getName() + ") is selling "
						+ curStock.getName() + " at " + price);
				curStock.unregister(this);
				toRemove.add(curStock);
				countDownSize -= 1;
				continue;
			}
			System.out.println(this.name + " harbours "
					+ countDownSize + " stock(s) (selling thresh: "
					+ this.mapStock.get(curStock).getThresh() + " for "
					+ curStock.getName() + ") is holding "
					+ curStock.getName() + " at " + price);
		}
		for (SubjectStock rm : toRemove) this.mapStock.remove(rm);
	}
}

class ClientLogic {
	private int threshSell;
	private int amountHarbour;
	private ClientThresholdMapping clientThresholdMappingSelling;
	private ClientThresholdMapping clientThresholdMappingUpdating;
	
	ClientLogic(int amount, int threshSell, int threshUpdate) {
		this.threshSell = threshSell;
		this.amountHarbour = amount;
		this.clientThresholdMappingSelling = new ClientThresholdMappingSelling(threshSell);
		this.clientThresholdMappingUpdating = new ClientThresholdMappingUpdating(threshUpdate);
	}
	
	public boolean considerSellingAt(int curPrice) {
		return this.clientThresholdMappingSelling.calc(curPrice);
	}
	
	public boolean considerBeingNotifiedAt(int gap) {
		return this.clientThresholdMappingUpdating.calc(gap);
	}
	
	public int getAmount() { return this.amountHarbour; }
	public int getThresh() { return this.threshSell; }
}