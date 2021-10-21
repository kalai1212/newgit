package org.polymorphism;

public class Sbi extends Rbi {
	
	@Override
	public void savings() {
    System.out.println("Savings is 12%");
		
	}
	@Override
	public void fixed() {
    System.out.println("Fixed is 15%");		
    
	}
	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.savings();
		s.fixed();
		
	}
	
}
