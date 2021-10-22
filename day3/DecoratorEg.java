package CoreJava;

interface Car {

	public void assemble();
}

class BasicCar implements Car {

	public void assemble() {
		System.out.print("Basic Car.");
	}

}

class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car c){
		this.car=c;
	}
	
	public void assemble() {
		this.car.assemble();
	}

}
class AbsCar extends CarDecorator {

	public AbsCar(Car c) {
		super(c);
	}
	
	@Override
	public void assemble(){
		super.assemble();
		System.out.println(" Adding AbsCar feature");
	}
}

public class DecoratorEg {
	public static void main(String[] args) {
		
		Car absCar = new AbsCar(new BasicCar());
		absCar.assemble();
		
	}
 }

