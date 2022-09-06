package org.add;

public class GreensTech {

	public void greensomr(String s) {
		System.out.println("Location" + s);
	}

	public void greensomr(String s, int i) {
    System.out.print("Location:"+s+", ");
    System.out.println("Fees:"+i);
	}
	
	public void greensomr(char c,String s, int i) {
		System.out.print("Logo:"+c+", ");
		System.out.print("Location:"+s+", ");
	    System.out.print("Fees:"+i);

	}
	
	public static void main(String[] args) {

		GreensTech g = new GreensTech();
		g.greensomr("Thorraipakkam");
		g.greensomr("Tambaram", 16000);
		g.greensomr('G',"Adyar",17000);
		
		
	}

}
