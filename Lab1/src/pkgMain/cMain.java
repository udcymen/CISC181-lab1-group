//Meng Cong 40%
//Trackenberg Ryan 40%
//Wang Jun 20%

package pkgMain;

import java.util.Scanner;

public class cMain {
	public static void main(String arg[])
	{
		Scanner input = new Scanner(System.in);
		double YTW, AR1, YR, AR2, RI, MSSI, PMT, PV, MS;
		System.out.println("Please input your years to work: ");
		YTW = input.nextDouble();
		System.out.println("Please input your annual return: ");
		AR1 = input.nextDouble();
		System.out.println("Please input your years retired: ");
		YR = input.nextDouble();
		System.out.println("Please input your annual return: ");
		AR2= input.nextDouble();
		System.out.println("Please input your required income: ");
		RI = input.nextDouble();
		System.out.println("Please input your monthly SSI: ");
		MSSI = input.nextDouble();
		PMT = RI - MSSI;
		PV = PMT / (AR2 / 12) * (1 - 1 / Math.pow(1 + (AR2 / 12), YR * 12));
		System.out.printf("What you need to save in total : $%.2f", PV);
		System.out.println(" ");
		MS = PV * ((AR1 / 12) / (Math.pow(1 + (AR1 / 12), YTW * 12) - 1));
		System.out.printf("What you need to save monthly : $%.2f", MS);
	}
}
