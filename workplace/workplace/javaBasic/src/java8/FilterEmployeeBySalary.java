package java8;

public class FilterEmployeeBySalary implements MyPredicate<Employee>{

	@Override
	public boolean test(Employee t) {
		return t.getSalary() >= 50;
	}
	
}
