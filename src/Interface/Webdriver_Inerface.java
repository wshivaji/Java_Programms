package Interface;


public interface Webdriver_Inerface {
	void Chrome();
	void Firefox();
	void Ie();
}



class webdriver implements Webdriver_Inerface{

	@Override
	public void Chrome() {
		// TODO Auto-generated method stub
		System.out.println("This is Chrome Method");
	}

	@Override
	public void Firefox() {
		// TODO Auto-generated method stub
		System.out.println("This is Firefox Method");
	}

	@Override
	public void Ie() {
		// TODO Auto-generated method stub
		System.out.println("This is Internet Explorer");
	}
}



