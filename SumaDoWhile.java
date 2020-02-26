public class SumaDoWhile{
	public static void main(String[]args){
	
	int n=10,i=1;
	int sum=0;
	do{
	sum+=i;
        i++;
	}while(i<=n);
	System.out.println("Suma"+sum);
	}

}