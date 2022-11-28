package Interface;

public class use_webdriver_interface{
	public static void main(String args[]) {
		Webdriver_Inerface wd = new webdriver();
		System.out.println("\n********************\n\n");
		wd.Chrome();
		System.out.println("\n********************\n\n");
		wd.Firefox();
		System.out.println("\n********************\n\n");
		wd.Ie();
		System.out.println("\n********************\n\n");
		
	}
}
