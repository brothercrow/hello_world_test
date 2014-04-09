package helloworld;

public class helloworldtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userQty[]= {1,2,1,1,4};
		
		System.out.println("This should say Hello World!");
		System.out.printf("\t qty\t product\t price\t total\n");
		System.out.printf("%10d%10d%10d%10d%10d\n", userQty[0],userQty[1],userQty[2],userQty[3],userQty[4]);
		System.out.printf("%d", userQty[1]*4);
	}

}
