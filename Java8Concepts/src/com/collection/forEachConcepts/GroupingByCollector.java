package com.collection.forEachConcepts;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByCollector {

	public static void main(String[] args) {
		List<Employee> empList=List.of(new Employee(1, "Suman"),new Employee(2, "Deepak"),new Employee(2, "Arun"));
// create map from employee list by id as key and employee as value
		
		Map<Integer, Set<Employee>> empMap=empList.stream().collect(Collectors.groupingBy(Employee::getId,Collectors.toSet()));
		empMap.forEach((e,v)->System.out.println(e+""+""+v));
		
		empMap.entrySet().stream().forEach((e)->{
//			System.out.println(e.getKey());
//			System.out.println(e.getValue());
			});
	}

}

class Employee{
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id ;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
}
