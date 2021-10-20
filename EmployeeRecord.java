package CoreJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class EmployeeRecord {
        public static void main(String[] args)
        {
            Employee e1 = new Employee(1,23,"M","Aman","B");
            Employee e2 = new Employee(2,13,"F","Meera","H");
            Employee e3 = new Employee(3,43,"M","Raj","M");
            Employee e4 = new Employee(4,26,"M","Jon","Lowman");
            Employee e5 = new Employee(5,19,"F","Kat","Maria");
             
            List<Employee> employees = new ArrayList<Employee>();
            employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5}));
            Predicate<Employee> isAdultMale=p -> p.getAge() > 21 && p.getGender().equalsIgnoreCase("M");                 
            Predicate<Employee> isAdultFemale= p -> p.getAge() > 18 && p.getGender().equalsIgnoreCase("F");  
          //  System.out.println(filterEmployees(employees, isAdultMale(35).negate()));
            System.out.println( filterEmployees(employees, isAdultMale) );
            
            //and
            System.out.println( filterEmployees(employees, isAdultFemale.and(isAgeMoreThan(10))) );
          //or
            System.out.println( filterEmployees(employees, isAdultFemale.or(isAgeMoreThan(10))) );
              
            // negate()
            System.out.println(filterEmployees(employees, isAgeMoreThan(35).negate()));
         
    }
        public static Predicate<Employee> isAgeMoreThan(Integer age) {
            return p -> p.getAge() > age;
        }
  public static List<Employee> filterEmployees (List<Employee> employees, 
                Predicate<Employee> predicate) 
{
return employees.stream()
.filter( predicate )
.collect(Collectors.<Employee>toList());
}
    }


     class Employee {
        
    	   public Employee(Integer id, Integer age, String gender, String fName, String lName){
    	       this.id = id;
    	       this.age = age;
    	       this.gender = gender;
    	       this.firstName = fName;
    	       this.lastName = lName;
    	   } 
    	     
    	   public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public Integer getAge() {
			return age;
		}


		public void setAge(Integer age) {
			this.age = age;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		private Integer id;
    	   private Integer age;
    	   private String gender;
    	   private String firstName;
    	   private String lastName;
    	 
    	  
    	    @Override
    	    public String toString() {
    	        return this.id.toString()+" - "+this.firstName.toString(); 
    	    }
    	}



