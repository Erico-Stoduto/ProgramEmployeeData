package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double rate;
   
	//Este método faz a subtração do salário bruto menos a taxa imposta pelo usuário
	public double netSalary() {
		return grossSalary - rate;
	}

    //Este método faz o cálculo sobre o do salário bruto  
	public void increaseSalary(double percentage) {

		grossSalary += grossSalary * percentage / 100.0;
	}

	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f", netSalary());
	}
}
