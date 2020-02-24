public class While{
	public static void main(String[]args){
        int intNumber=0;
        byte byteNumber=0;
        short shortNumber=0;

        System.out.println("Primele 100 numere")
	while(intNumber<=100){
	System.out.println(intNumber);
        intNumber++;
	}
        System.out.println("Primele 50 nr pare");
 	while(byteNumber<=50){
	if(byteNumber%2==0){
	System.out.println(byteNumber);
	byteNumber++;
	}
	}
        System.out.println("Primele 50 nr impare");
	while(shortNumber<=50){
	if(shortNumber%2!=0){
	System.out.println("shortNumber");
	}
	}
	}
}