
public class test {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// Összegzés--------------------------------------------------------------------
			System.out
					.println("Összegzés\n-----------------------------------------------");
			int[] tomb = { 3, 8, 2, 4, 5, 1, 6 };

			int osszeg = 0;
			for (int i = 0; i < 7; i++)
				osszeg = osszeg + tomb[i];

			System.out.println(osszeg);

			// Számláló--------------------------------------------------------------------
			System.out
					.println("Számláló\n-----------------------------------------------");
			int n = 7;
			int szamlalo = 0;
			for (int i = 0; i < n; i++)
				if (tomb[i] > n-4)
					szamlalo++;

			System.out.println(szamlalo);

			// Eldöntés
			// tétel--------------------------------------------------------------
			System.out
					.println("Eldöntés tétel\n-----------------------------------------------");
			n = 7; // A tömb elemeinek száma
			int ker = 2; // Amirõl el szeretnénk dönteni, hogy van-e ilyen

			int i = 0;
			while (i < n && tomb[i] != ker)
				i++;

			if (i < n)
				System.out.println("Van ilyen szám.");
			else
				System.out.println("Nincs ilyen szám.");

			i = 0;
			while (tomb[i] != ker)
				i++;

			System.out.println("\n" + (i + 1));

			// Keresés
			// tétel--------------------------------------------------------------
			System.out
					.println("Keresés tétel\n-----------------------------------------------");
			i = 0;
			while (i < n && tomb[i] != ker)
				i++;

			if (i < n) {
				// Ha a kérdés az, hogy hányadik akkor i + 1 a vége
				// ha a kérdés az, hogy mi az indexe, akkor csak i
				System.out.println("Van ilyen a következõ helyen: " + (i + 1));

			} else {
				System.out.println("Nincs ilyen elem");
			}

			// Kiválogatás
			// tétel--------------------------------------------------------------
			System.out
					.println("Kiválogatás tétel\n-----------------------------------------------");
			int[] a = {3, 8, 2, 4, 5, 1, 6};
			n = 7;
			int[] b = new int[n];
			int j = 0;
			for (i = 0; i < n; i++)
				if (a[i] > 5)
					b[j++] = a[i];

			int m = j; // A "b" tömb elemeinek száma

			// Elsõ tömb kiíratva:
			for (int ii = 0; ii < n; ii++)
				System.out.print(a[ii] + " ");
			System.out.println();

			// Második tömb kiíratva:
			for (int iii = 0; iii < m; iii++)
				System.out.print(b[iii] + " ");
			System.out.println();
			
			// Szétválogatás
			// tétel--------------------------------------------------------------
			System.out
					.println("Szétválogatás tétel\n-----------------------------------------------");
					n = 7; // A tömb elemeinek száma
					b = new int[n];
					int[] c = new int[n];
			 
					j=0;
					int k=0;
					for(i=0; i<n;i++)
						if(a[i] > 5)
							b[j++] = a[i];
						else
							c[k++] = a[i];
			 
					m = j; //A "b" tömb elemeinek száma
					int l = k; //A "c" tömb elemeinek száma
			 
					//Elsõ tömb kiíratva:
					for(i=0; i<n;i++)
						System.out.print(a[i] + " ");
					System.out.println();
			 
					//Második tömb kiíratva:
					for(i=0; i<m;i++)
						System.out.print(b[i] + " ");
					System.out.println();
			 
					//Harmadik tömb kiíratva:
					for(i=0; i<l;i++)
						System.out.print(c[i] + " ");
					System.out.println();

					// Metszet
					// tétel--------------------------------------------------------------
					System.out
							.println("Metszet tétel\n-----------------------------------------------");
					
					n = 7; // Az elsõ tömb elemeinek száma
					int[] d = {4, 7, 9, 8, 2};
					m = 5; //A második tömb elemeinek száma
					int[] e = new int[n+m]; //A harmadik tömb
								 
					for(i=0; i<n;i++)
					{
						j = 0;
						while(j<m && d[j] != a[i]) 
							j++;
						if(j<m && d[j] == a[i])
						{
							e[k] = a[i];
							k++;
						}
					}
			 
					l = k; //A "c" tömb elemeinek száma
			 
					//Elsõ tömb kiíratva:
					for(i=0; i<n;i++)
						System.out.print(a[i] + " ");
					System.out.println();
			 
					//Második tömb kiíratva:
					for(i=0; i<m;i++)
						System.out.print(d[i] + " ");
					System.out.println();
			 
					//Harmadik tömb kiíratva:
					for(i=0; i<l;i++)
						System.out.print(e[i] + " ");
					System.out.println();
		
					// Unió
					// tétel--------------------------------------------------------------
					System.out
							.println("Unió tétel\n-----------------------------------------------");
					n = 7; // Az elsõ tömb elemeinek száma
					m = 5; //A második tömb elemeinek száma
					c = new int[n+m]; //A harmadik tömb
			 
					for(i=0; i<n; i++)
						c[i] = a[i];
			 
					k = n-1;
			 
					for(j=0; j<m;j++)
					{
						i = 0;
						while(i<n && a[i] != b[j])
							i++;
						if(i>=n)
						{
							k++;
							c[k] = b[j];	
						}
					}
			 
					l = k + 1; //A "c" tömb elemeinek száma
			 
					//Elsõ tömb kiíratva:
					for(i=0; i<n;i++)
						System.out.print(a[i] + " ");
					System.out.println();
			 
					//Második tömb kiíratva:
					for(i=0; i<m;i++)
						System.out.print(b[i] + " ");
					System.out.println();
			 
					//Harmadik tömb kiíratva:
					for(i=0; i<l;i++)
						System.out.print(c[i] + " ");
					System.out.println();
					
					// Maximum kiválasztás
					// tétel--------------------------------------------------------------
					System.out
							.println("Maximum kiválasztás tétel\n-----------------------------------------------");
					int max = 0;
			 
					for(i=0; i<tomb.length;i++)
						if(tomb[i] > max)
							max = tomb[i];
			 
					System.out.println("Legnagyobb: " + max);
					
					// Minimum kiválasztás
					// tétel--------------------------------------------------------------
					System.out
							.println("Minimum kiválasztás tétel\n-----------------------------------------------");
					int min = tomb[0];
			 
					for(i=0; i<tomb.length;i++)
						if(tomb[i] < min)
							min = tomb[i];
			 
					System.out.println("Legkisebb: " + min);
					
					// Buborék rendezés
					// tétel--------------------------------------------------------------
					System.out
							.println("Buborék rendezés tétel\n-----------------------------------------------");
					for(i = tomb.length-1; i>0; i--)
						for(j=0; j<i; j++)
							if(tomb[j] > tomb[j+1])
							{
								int tmp = tomb[j];
								tomb[j] = tomb[j+1];
								tomb[j+1] = tmp;
							}
			 
					for(i=0; i<n; i++)
						System.out.print(tomb[i] + " ");
					System.out.println();
					
					// Buborék rendezés
					// tétel2--------------------------------------------------------------
					System.out
							.println("Buborék rendezés tétel2\n-----------------------------------------------");
					for(i= tomb.length-2; i>0; i--)
						for(j=0; j<=i; j++)
							if(tomb[j] > tomb[j+1])
							{
								int tmp = tomb[j];
								tomb[j] = tomb[j+1];
								tomb[j+1] = tmp;
							}
			 
					for(i=0; i<n; i++)
						System.out.print(tomb[i] + " ");
					System.out.println();
					
					// Buborék rendezés
					// tétel2--------------------------------------------------------------
					System.out
							.println("Buborék rendezés tétel2\n-----------------------------------------------");
					
					int[] t={3, 4, 6, 8, 18, 50, 52, 61, 68, 70};	
					 
					n = t.length;		
			 
					int q = 0;
					int u = n-1;
					int kk;
					ker = 52;
					do {
						kk = (q+u) / 2;
						if(ker<t[kk]) u = kk-1;
						if(ker>t[kk]) q = kk+1;
					}while(q<=u && t[kk]!=ker);
					boolean van = q<=u;
					int index = 0;
			 
					if(van) {			
						index = kk;
					}
					System.out.println(van + " " + index);
					
					// Rendezés beszurással
					// tétel--------------------------------------------------------------
					System.out
							.println("Rendezés beszúrással tétel\n-----------------------------------------------");
					int[] array = {35, 24, 83, 12, 7, 23};
			        rendezesBeszurassalR(array, array.length);
			        kiir(array);
			        
			        //Összefésülés
					// tétel--------------------------------------------------------------
					System.out
							.println("Összefésülés tétel\n-----------------------------------------------");
			        int[] z = { 1, 3, 5, 7, 9};
					int[] x = {2, 4, 6, 8 };
			 
					int[] w = new int[z.length+x.length];
			 
					n = z.length;
					m = x.length;
			 
					i = 0;
					j = 0;
					k = -1;
					while(i<n && j<m) {
						k++;
						if(z[i]<x[j]) {
							w[k] = z[i];
							i++;
						}else if(z[i] == x[j]) {
							w[k] = z[i];
							i++;
							j++;				
						}else if(z[i] > x[j]) {
							w[k] = x[j];
							j++;
						}
					}
					while(i<n) {
						k++;
						w[k] = z[i];
						i++;
					}
					while(j<m) {
						k++;
						w[k] = x[j];
						j++;
					}
			 
					kiir(w, k);
		}
		
		private static void rendezesBeszurassalR(int[] t, int n) {        
	        if(n>0) { // eredeti: n>1
	            rendezesBeszurassalR(t, n-1);
	            int x = t[n-1]; // eredeti: t[n]
	            int j = n-2; // eredeti: n-1
	            while(j>= 0 && t[j]>x) {
	                t[j+1] = t[j];
	                j = j-1;
	            }
	            t[j+1] = x;
	        }
	    }
		
		//Normál megoldás a rendezés beszurással tételre
		private static void rendezesBeszurassal(int[] t) {
	        for (int i = 0; i < t.length; i++) {  //eredeti: i=1
	            int x = t[i];
	            int j = i - 1;
	            while(j>=0 && t[j]>x) {
	                t[j+1] = t[j];
	                j = j - 1;
	            }
	            t[j+1] = x;
	        }
	    }
		
	    private static void kiir(int[] t) {
	        for (int i = 0; i < t.length; i++) {
	            System.out.print(t[i]+" ");
	        }
	        System.out.println();
	    }
	    
	    private static void kiir(int[] tomb, int meret) {		
			for (int i = 0; i < meret + 1; i++) {			
				System.out.print(tomb[i] + " ");
			}
	    }
	}


