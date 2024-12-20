package acessmod;

@FunctionalInterface
interface SalaryCalculator {
	double calculateSalary(double baseSalary);
	
}

public class Lamada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double baseSalary = 50000;
		SalaryCalculator withBonus = (sal) -> sal + (sal * 0.10);
		//calculate salary with a deduction of 5%
		SalaryCalculator withDeduction=(sal)->sal-(sal*0.05);
		
		// if provide increment
		
		SalaryCalculator withIncrement = (sal)->{
			if(sal<20000) {
				return sal+(sal*0.15);
			}
			else {
				return sal;
			}
		};
		SalaryCalculator nochange =(salary)->salary;
		System.out.println("Base salary "+ baseSalary);
		
		System.out.println("salary without change"+ nochange.calculateSalary(baseSalary));
		System.out.println("salary with bonus"+ withBonus.calculateSalary(baseSalary));
		System.out.println(" salary eith deduction 5 %"+ withDeduction.calculateSalary(baseSalary));
		System.out.println(" salary increment for those whose slary is less than 20k "+ withIncrement.calculateSalary(baseSalary));
		
	}

}
