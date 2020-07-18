
public class App {

	public static void main(String[] args) {
		Human tom = new Human();
//		tom.walk();
//		walker(tom);
		
		Robot walle = new Robot();
//		walle.walk();
//		walker(walle);
		
		walker(() -> System.out.println("Custom thing walking"));
		
		Walkable aBlockofCode = () ->{
			System.out.println("Custom object is walking");
			System.out.println("the object fell down");
		};
		
		walker(aBlockofCode);
		
		ALambdaInterface helloVar = () ->{
			System.out.println("Tüdeldüü, hello");
		};
		
		AnotherLambdaInterface sumVar = (var1, var2 ) ->{
			return var1+var2;
		};
		
		helloVar.someMethod();
		
		System.out.println(sumVar.sum(6,4));
		
		AnotherLambdaInterface divide = (a,b) -> {
			if(a==0) {
				return 0;}
			return a/b;
			};
			
		System.out.println(divide.sum(10,5));
		
		
	
	Genericinterface<String> bla = (s) -> {
		String result = "";
		for(int i = s.length()-1; i>=0; i--) {
			result = result + s.charAt(i);
		}
		return result;
	};
	
	System.out.println(bla.doit("Floooooo"));
	
	Genericinterface<Integer> facto = (n) -> {
		int result = 1;
		for(int i =1; i <=n; i++) {
			result = result*i;
		}
		return result;
	};
	
	System.out.println(facto.doit(5));
	
	}	

	
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk();
	}
	
	public void sayHello() {
		System.out.println("Hello");
	}
	
	public int sum(int arg1, int arg2) {
		return arg1+arg2;
	}
	
	public int non0divide(int arg1, int arg2) {
		if(arg1==0) {
			return 0;
		}
		return arg1/arg2;
	}
	
	public String reverse(String s) {
		String result = "";
		for(int i = s.length()-1; i>=0; i--) {
			result = result + s.charAt(i);
		}
		return result;
	}
	
	public int factorial(int n) {
		int result = 1;
		for(int i =1; i <=n; i++) {
			result = result*i;
		}
		return result;
	}
	
	public interface Genericinterface<T> {
		public T doit(T s);
	}
	
	public interface Intthing {
		public int dosomething(int n);
	}
	
	

}
