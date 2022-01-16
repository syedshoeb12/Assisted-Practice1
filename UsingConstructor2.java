package com.phase1;
public class UsingConstructor2 {
	int val=90;
	int empId;
	String name;
	void display() {
		System.out.println(empId+":"+name);
	}
	public static void main(String []args) {
		System.out.println(new UsingConstructor2().val);
		UsingConstructor2 ref=new UsingConstructor2();
		System.out.println(ref.val);
		 UsingConstructor2 emp1=new UsingConstructor2();
		 emp1.display();
		 paraConstructor emp2=new paraConstructor(954765,"Syed945@");
			 
		 }
	}
class paraConstructor{
	int empId;
	String name;
	private int val;

	paraConstructor(int empId,String name){
		this.empId=empId;
		this.name=name;
		System.out.println(empId+":"+name);
		
		
	}
   void UsingConstructor2(int val) {
		this.val=val;
	}
   
}
	