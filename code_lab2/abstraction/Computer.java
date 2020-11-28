package abstraction;

import java.util.ArrayList;
import java.util.HashMap;

import abstraction.component.CPU;
import abstraction.component.Mainboard;
import abstraction.component.Memory;

public abstract class Computer implements Checkable {

	public static String[] componentsPool =
		new String[]{"CPU", "RAM", "Board"};
	
	protected ArrayList<String> quotationSheet;
	protected boolean isQualified;
	protected int UUID;
	protected HashMap<String, ArrayList<Product>> mapComponent;
	
	public Computer(Product p) {
		this.quotationSheet = p.price();
		this.isQualified = true;
		this.mapComponent = new HashMap<String, ArrayList<Product>>();
		for (String component : componentsPool)
			this.mapComponent.put(component, new ArrayList<Product>());
		product2Component((ProductDecorator)p);
	}
	
	public void printQuotationSheet() {
		for (String eachQuotation : this.quotationSheet) {
			System.out.println(eachQuotation);
		}
	}
	
	public void setUUID(int newUUID) {
		this.UUID = newUUID;
	}
	
	public boolean getQualification() {
		return this.isQualified;
	}
	
	public void setQualification(boolean qualification) {
		this.isQualified = qualification;
	}
	
	public abstract void beALaptopOrPC();
	
	private void product2Component(ProductDecorator d) {
		ProductDecorator prevD;
		if (d.prev() instanceof ProductDecorator) {
			prevD = (ProductDecorator) d.prev();
			product2Component(prevD);
		}
		if (d instanceof CPU) this.mapComponent.
			get(componentsPool[0]).add((Product)d);
		else if (d instanceof Memory) this.mapComponent.
			get(componentsPool[1]).add((Product)d);
		else if (d instanceof Mainboard) this.mapComponent.
			get(componentsPool[2]).add((Product)d);
		else return;
	}
	
}
