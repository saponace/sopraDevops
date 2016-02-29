

public class Function {


	public long fibonacci(long rang) {
		if (rang <= 1){
			return rang;
		}
        else {
        	return fib(rang-1) + fib(rang-2);
		}
	}

	public static void main(String[] args) {
        int rang = Integer.parseInt(args[0]);
        System.out.println("Fibonnaci de" + rang + "est" + fibonacci(rang));
    }

}