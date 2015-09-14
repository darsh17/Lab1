import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

public class lab1class {
 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double r;
		System.out.print("Annual return(max : .03): ");
		r = (scanner.nextDouble());
		if (r > .03 || r <= .01){
			System.out.println("Annual return(max : .03): ");
			r = scanner.nextDouble();
		}
		else{ 
			r = r/12;
		}
		
		double y;
		System.out.print("Monthly SSI(max : 2642): ");
		y = scanner.nextDouble();
		if (y > 2642){
			System.out.println("Uncle sam doesn't pay more than '2642'");
			y = scanner.nextDouble();
		}
		else {
			y = y - 10000;
		}
		double p;
		double f;
		boolean t;
		
		double n;
		System.out.print("Years retired: ");
		n = scanner.nextDouble()*12;
		
		double PV;
		
		f = 0;
		t = false;
		PV = FinanceLib.pv(r,n,y,f,t);
		
		double PMT;
		
		
		System.out.print("Annual return percentage(max: .2): ");
		r = (scanner.nextDouble());
		if (r > .2 || r <= 0){
			System.out.println("Annual return(max : .03): ");
			r = scanner.nextDouble();
		}
		else {
			r = r/12;
		}
		System.out.print("Years till retirment: ");
		n = scanner.nextDouble()*12;
		
		p = 0;
		f = PV;
		t = false;

		PMT = FinanceLib.pmt(r, n, p, f, t);
		System.out.println("What you need saved: " + PV);
		System.out.println("Save each month: " + PMT*-1);
		
	}

}
