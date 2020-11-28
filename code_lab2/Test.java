/* NOTE THAT ALL COMMENTS ARE IN CURRENT FILE */



import java.util.ArrayList;
import java.util.HashMap;

import abstraction.AbstractFactoryVendor;
import companies.LaptopCompany;
import companies.PCCompany;
import companies.shells.Laptop;
import companies.shells.PC;
import gov.SupervisionDepartment;
import helper.Pair;
import helper.String2NestedPairArrayList;
import helper.String2Vendor;

public class Test {
	
	public static void main(String[] args) {
		HashMap<String, AbstractFactoryVendor> map = String2Vendor.map();      /* Firstly, build a map from like "Intel" -> Intel */
		PCCompany pcCompany = new PCCompany(map);
		LaptopCompany laptopCompany = new LaptopCompany(map);                  /* Then construct two company, known as pizza stores */
		
		ArrayList<Pair<String, Pair<String, String>>> demandList_1 =           /* To add any computing blocks, */
				String2NestedPairArrayList.list(new String[][]				   /* just add strings pair to this helper */
						{{"Samsung", "CPU", "i7"},                             /* 1. Add a Samsung i7 CPU */
						{"Intel", "Board", "tiny"},							   /* 2. Add an Intel Large Board */
						{"Intel", "Board", "large"},						   /* 3. ... */
						{"Samsung", "RAM", "32G"},
						{"Intel", "RAM", "16G"}
						});													   /* You can only provide the helper with certain
																				* strings, pls refer to package vendors */
		
		ArrayList<Pair<String, Pair<String, String>>> demandList_2 =
				String2NestedPairArrayList.list(new String[][]
						{{"Samsung", "CPU", "i7"},
						{"Samsung", "RAM", "32G"},
						{"Samsung", "RAM", "32G"},
						});
		
		ArrayList<Pair<String, Pair<String, String>>> demandList_3 =
				String2NestedPairArrayList.list(new String[][]
						{{"Intel", "CPU", "i7"},
						{"Intel", "CPU", "i9"},
						{"Samsung", "RAM", "32G"},
						{"Samsung", "RAM", "32G"},
						{"Samsung", "Board", "tiny"}
						});
		
		PC c1 = pcCompany.produce(demandList_1);                               /* We can obtain a computer-like device with the demand list */
		c1.printQuotationSheet();											   /* The client is able to ask the device for a quotation sheet */
		c1 = (PC) SupervisionDepartment.check(c1);                             /* Give it to the supervision department, getting a labeled device */
		c1.beALaptopOrPC();                                                    /* Now you can play with it */
		
		PC c2 = pcCompany.produce(demandList_2);
		c2.printQuotationSheet();
		c2 = (PC) SupervisionDepartment.check(c2);
		c2.beALaptopOrPC();
		
		Laptop c3 = laptopCompany.produce(demandList_3);
		c3.printQuotationSheet();
		c3 = (Laptop) SupervisionDepartment.check(c3);
		c3.beALaptopOrPC();
	}
}
