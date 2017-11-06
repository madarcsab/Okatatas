
public class test {


		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// �sszegz�s--------------------------------------------------------------------
			System.out
					.println("�sszegz�s\n-----------------------------------------------");
			int[] tomb = { 3, 8, 2, 4, 5, 1, 6 };

			int osszeg = 0;
			for (int i = 0; i < 7; i++)
				osszeg = osszeg + tomb[i];

			System.out.println(osszeg);

			// Sz�ml�l�--------------------------------------------------------------------
			System.out
					.println("Sz�ml�l�\n-----------------------------------------------");
			int n = 7;
			int szamlalo = 0;
			for (int i = 0; i < n; i++)
				if (tomb[i] > n-4)
					szamlalo++;

			System.out.println(szamlalo);

			// Eld�nt�s
			// t�tel--------------------------------------------------------------
			System.out
					.println("Eld�nt�s t�tel\n-----------------------------------------------");
			n = 7; // A t�mb elemeinek sz�ma
			int ker = 2; // Amir�l el szeretn�nk d�nteni, hogy van-e ilyen

			int i = 0;
			while (i < n && tomb[i] != ker)
				i++;

			if (i < n)
				System.out.println("Van ilyen sz�m.");
			else
				System.out.println("Nincs ilyen sz�m.");

			i = 0;
			while (tomb[i] != ker)
				i++;

			System.out.println("\n" + (i + 1));

			// Keres�s
			// t�tel--------------------------------------------------------------
			System.out
					.println("Keres�s t�tel\n-----------------------------------------------");
			i = 0;
			while (i < n && tomb[i] != ker)
				i++;

			if (i < n) {
				// Ha a k�rd�s az, hogy h�nyadik akkor i + 1 a v�ge
				// ha a k�rd�s az, hogy mi az indexe, akkor csak i
				System.out.println("Van ilyen a k�vetkez� helyen: " + (i + 1));

			} else {
				System.out.println("Nincs ilyen elem");
			}

			// Kiv�logat�s
			// t�tel--------------------------------------------------------------
			System.out
					.println("Kiv�logat�s t�tel\n-----------------------------------------------");
			int[] a = {3, 8, 2, 4, 5, 1, 6};
			n = 7;
			int[] b = new int[n];
			int j = 0;
			for (i = 0; i < n; i++)
				if (a[i] > 5)
					b[j++] = a[i];

			int m = j; // A "b" t�mb elemeinek sz�ma

			// Els� t�mb ki�ratva:
			for (int ii = 0; ii < n; ii++)
				System.out.print(a[ii] + " ");
			System.out.println();

			// M�sodik t�mb ki�ratva:
			for (int iii = 0; iii < m; iii++)
				System.out.print(b[iii] + " ");
			System.out.println();
			
			// Sz�tv�logat�s
			// t�tel--------------------------------------------------------------
			System.out
					.println("Sz�tv�logat�s t�tel\n-----------------------------------------------");
					n = 7; // A t�mb elemeinek sz�ma
					b = new int[n];
					int[] c = new int[n];
			 
					j=0;
					int k=0;
					for(i=0; i<n;i++)
						if(a[i] > 5)
							b[j++] = a[i];
						else
							c[k++] = a[i];
			 
					m = j; //A "b" t�mb elemeinek sz�ma
					int l = k; //A "c" t�mb elemeinek sz�ma
			 
					//Els� t�mb ki�ratva:
					for(i=0; i<n;i++)
						System.out.print(a[i] + " ");
					System.out.println();
			 
					//M�sodik t�mb ki�ratva:
					for(i=0; i<m;i++)
						System.out.print(b[i] + " ");
					System.out.println();
			 
					//Harmadik t�mb ki�ratva:
					for(i=0; i<l;i++)
						System.out.print(c[i] + " ");
					System.out.println();

					// Metszet
					// t�tel--------------------------------------------------------------
					System.out
							.println("Metszet t�tel\n-----------------------------------------------");
					
					n = 7; // Az els� t�mb elemeinek sz�ma
					int[] d = {4, 7, 9, 8, 2};
					m = 5; //A m�sodik t�mb elemeinek sz�ma
					int[] e = new int[n+m]; //A harmadik t�mb
								 
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
			 
					l = k; //A "c" t�mb elemeinek sz�ma
			 
					//Els� t�mb ki�ratva:
					for(i=0; i<n;i++)
						System.out.print(a[i] + " ");
					System.out.println();
			 
					//M�sodik t�mb ki�ratva:
					for(i=0; i<m;i++)
						System.out.print(d[i] + " ");
					System.out.println();
			 
					//Harmadik t�mb ki�ratva:
					for(i=0; i<l;i++)
						System.out.print(e[i] + " ");
					System.out.println();
		
					// Uni�
					// t�tel--------------------------------------------------------------
					System.out
							.println("Uni� t�tel\n-----------------------------------------------");
					n = 7; // Az els� t�mb elemeinek sz�ma
					m = 5; //A m�sodik t�mb elemeinek sz�ma
					c = new int[n+m]; //A harmadik t�mb
			 
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
			 
					l = k + 1; //A "c" t�mb elemeinek sz�ma
			 
					//Els� t�mb ki�ratva:
					for(i=0; i<n;i++)
						System.out.print(a[i] + " ");
					System.out.println();
			 
					//M�sodik t�mb ki�ratva:
					for(i=0; i<m;i++)
						System.out.print(b[i] + " ");
					System.out.println();
			 
					//Harmadik t�mb ki�ratva:
					for(i=0; i<l;i++)
						System.out.print(c[i] + " ");
					System.out.println();
					
					// Maximum kiv�laszt�s
					// t�tel--------------------------------------------------------------
					System.out
							.println("Maximum kiv�laszt�s t�tel\n-----------------------------------------------");
					int max = 0;
			 
					for(i=0; i<tomb.length;i++)
						if(tomb[i] > max)
							max = tomb[i];
			 
					System.out.println("Legnagyobb: " + max);
					
					// Minimum kiv�laszt�s
					// t�tel--------------------------------------------------------------
					System.out
							.println("Minimum kiv�laszt�s t�tel\n-----------------------------------------------");
					int min = tomb[0];
			 
					for(i=0; i<tomb.length;i++)
						if(tomb[i] < min)
							min = tomb[i];
			 
					System.out.println("Legkisebb: " + min);
					
					// Bubor�k rendez�s
					// t�tel--------------------------------------------------------------
					System.out
							.println("Bubor�k rendez�s t�tel\n-----------------------------------------------");
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
					
					// Bubor�k rendez�s
					// t�tel2--------------------------------------------------------------
					System.out
							.println("Bubor�k rendez�s t�tel2\n-----------------------------------------------");
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
					
					// Bubor�k rendez�s
					// t�tel2--------------------------------------------------------------
					System.out
							.println("Bubor�k rendez�s t�tel2\n-----------------------------------------------");
					
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
					
					// Rendez�s beszur�ssal
					// t�tel--------------------------------------------------------------
					System.out
							.println("Rendez�s besz�r�ssal t�tel\n-----------------------------------------------");
					int[] array = {35, 24, 83, 12, 7, 23};
			        rendezesBeszurassalR(array, array.length);
			        kiir(array);
			        
			        //�sszef�s�l�s
					// t�tel--------------------------------------------------------------
					System.out
							.println("�sszef�s�l�s t�tel\n-----------------------------------------------");
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
		
		//Norm�l megold�s a rendez�s beszur�ssal t�telre
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


