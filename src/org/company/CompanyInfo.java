package org.company;

public class CompanyInfo {
	private void CompanyName() {
		System.out.println("Greens");
    }
	private void CompanyId() {
		System.out.println("1234");
	}
	
	private void CompanyAddress() {
		System.out.println("Tambaram Sanatorium");
	}
	
	public static void main(String[]args) {
		CompanyInfo c= new CompanyInfo();
		c.CompanyName();
		c.CompanyId();
		c.CompanyAddress();
	}	
}
