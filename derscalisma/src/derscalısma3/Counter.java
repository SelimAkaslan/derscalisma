package derscalısma3;

public class Counter {
	int count=0;
	
	
	Counter() {
		count++;
		System.out.println(count);
	}

	
	public static void main(String[] args) {
		Counter cs1 = new Counter();
		Counter cs2 = new Counter();
		Counter cs3 = new Counter();
	}

}
