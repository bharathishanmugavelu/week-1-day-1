package Week1.day1;

public class Calculator {
     public void addtwoNumber() {
		// TODO Auto-generated method stub
 int a=54;
 
 int b=36;
 main(null);
 
 System.out.println(a+b);
		 	 
	}
     public int subtwonumber(int a,int  b) {
    	
 
		return a-b;

	}
     public double multipletwonumber(int a,double b) {
		// TODO Auto-generated method stub
        return a*b;
        
	}
     public int dividetwoNumber(int a,int b) {
		// TODO Auto-generated method stub
      return a/b;
	}
     public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println(cal.dividetwoNumber(5,15));
		System.out.println(cal.multipletwonumber(8, 12.89));
		System.out.println(cal.subtwonumber(12, 9));
	}
}
    