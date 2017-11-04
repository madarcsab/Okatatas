
public class HF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String copyFromMe = "Copy from this line " + "When you have 'w'.";
	
	StringBuffer copyToMe = new StringBuffer();
	
	int i = 0;
	char c = copyFromMe.charAt(i);
	
	while (c != 'w') {
		
		copyToMe.append(c);
		
		c = copyFromMe.charAt(++i);
		
	}
	System.out.println(copyToMe);
	
	
	
	int huszig = 0;
		
	for (int j = 1; j <= 2; j++) {
		
		huszig = huszig + 10;
		System.out.println(huszig);
	
	}
	
	System.out.println();
		
	int huszig1 = 0;
	
	for (int k = 1; k <= 7; k++) {
		
		huszig1 = huszig1 + 3;
		System.out.println(huszig1);
		
	}
	
	System.out.println();
		
	int huszig2 = 0;
	
	for (int l = 1; l <= 4; l++) {
		
		huszig2 = huszig2 + 5;
		System.out.println(huszig2);
		
	}
	
	}

}

