package singleton;

public class PrinterManager {
	
	public static final PrinterManager PRINTERMANAGER = new PrinterManager();
	
	private PrinterManager() {}
	
	public static PrinterManager getInstance() {
		return PrinterManager.PRINTERMANAGER;
	}

}
