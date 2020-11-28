public class Test {
	public static void main(String[] args) {
		
		/* signatures of SubjectStock'constructor:
		 * (String->name, int->lowPrice, int->highPrice,
		 * int[]->stepsOfIncreasing)
		 */
		SubjectStock sA = new SubjectStock("A", 10, 50, new int[] {10, 50, 90});
		SubjectStock sB = new SubjectStock("B", 5, 70, new int[] {10, 30, 80, 100});
		SubjectStock sC = new SubjectStock("C", 0, 100, new int[] {5, 30, 45});
		
		ObserverClient cD = new ObserverClient("D");
		ObserverClient cE = new ObserverClient("E");
		ObserverClient cF = new ObserverClient("F");
		
		/* buyNewStock signatures:
		 * (SubjectStock->stock, int->amountsBuying,
		 * int->threshSelling, int->threshNotifying)
		 */
		cD.buyNewStock(sA, 100, 0, 10);
		cD.buyNewStock(sC, 20, 45, 15);
		cD.buyNewStock(sB, 10, 200, 10);
		
		cE.buyNewStock(sC, 30, 90, 10);
		cF.buyNewStock(sC, 500, 200, -1);
		cE.buyNewStock(sB, 20, 40, 5);
	}
}
