package CoreJava;

public enum SingletonEnum {
	   INSTANCE;
	   private String empName;
	   private int salary;
	   private void build(SingletonBuilder builder) {
	      this.empName = builder.empName;
	      this.salary = builder.salary;
	   }
	   public static SingletonEnum getSingleton() { // static getter
	      return INSTANCE;
	   }
	   public void print() {
	      System.out.println("empName: "+empName + ", salary: "+salary);
	   }
	   public static class SingletonBuilder {
	      private final String empName;
	      private int salary;
	      private SingletonBuilder() {
	         empName = null;
	      }
	      public SingletonBuilder(String empName) {
	         this.empName = empName;
	      }
	      public SingletonBuilder salary(int salary) {
	         this.salary = salary;
	         return this;
	      }
	      public void build() {
	         SingletonEnum.INSTANCE.build(this);
	      }
	   }
	   public static void main(String[] args) {
	      new SingletonBuilder("Adithya").salary(25).build();
	      SingletonEnum.getSingleton().print();
	   }
	}