package singleton;

public class Program {

	public static void main(String[] args) {
		
		PrinterManager p1 = PrinterManager.getInstance();
		PrinterManager p2 = PrinterManager.getInstance();
		PrinterManager p3 = PrinterManager.getInstance();
		PrinterManager p4 = PrinterManager.getInstance();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);

	}

}
