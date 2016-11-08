public class Function {
    private static long fibonacci(long rang) {
	if(rang < 0)
	    throw new IllegalArgumentException("Le paramètre doit être un entier positif.");
	if (rang <= 1)
	    return rang;
	else
	    return fibonacci(rang-1) + fibonacci(rang-2);
    }


    public static void main(String[] args) {
	int rang = Integer.parseInt(args[0]);
	try{
	    System.out.println("Fibonnaci de " + rang + " est " + fibonacci(rang) + ".");
	}
	catch(IllegalArgumentException e){
	    System.err.println(e.getMessage());
	}
    }
}
