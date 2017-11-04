
public class Test {

	public enum Month {

		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// while ciklus

		String copyFromMe = "Copy this string until you "

				+ "encounter the letter 'g'.";

		StringBuffer copyToMe = new StringBuffer();

		int i = 0;

		char c = copyFromMe.charAt(i);
				
		while (c != 'g') {

			copyToMe.append(c);

			c = copyFromMe.charAt(++i);

		}

		System.out.println(copyToMe);

		// do-while ciklus

		i = 0;

		c = copyFromMe.charAt(i);

		do {

			copyToMe.append(c);

			c = copyFromMe.charAt(++i);

		} while (c != 'g');

		System.out.println(copyToMe);

		// for ciklus

		int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };

		for (int j = 0; j < arrayOfInts.length; j++) {

			System.out.print(arrayOfInts[j] + " ");

		}

		System.out.println();

		// foreach gyüjtemények bejárása

		for (int element : arrayOfInts) {

			System.out.print(element + " ");

		}

		System.out.println();

		// egymásba ágyazott for ciklus

		int[][] m = new int[10][20];

		for (int k = 0; k < m.length; k++) {

			for (int l = 1; l < m[k].length; l++) {

				m[k][l] = k + 1;

				System.out.print(m[k][l] + " ");

			}

			System.out.println();

		}

		// if-else szerkezet

		boolean response = true;

		if (response) {

			System.out.println("OK");

		} else {

			System.out.println("FAIL");

		}

		int testscore = 76;

		int grade;

		if (testscore >= 90) {

			grade = 5;

		} else if (testscore >= 80) {

			grade = 4;

		} else if (testscore >= 70) {

			grade = 3;

		} else if (testscore >= 60) {

			grade = 2;

		} else {

			grade = 1;

		}

		System.out.println("Grade = " + grade);

		// több soros if-else vs. egy soros if-else példa

		char aChar = 'x';

		if (Character.isUpperCase(aChar)) {

			System.out.println("The character " + aChar + " is upper case.");

		} else {

			System.out.println("The character " + aChar + " is lower case.");

		}

		System.out.println("The character " + aChar + " is "

				+ (Character.isUpperCase(aChar) ? "upper" : "lower") + "case.");

		// switch-case szerkezet

		int month = 8;

		switch (month) {

		case 1:

			System.out.println("January");

			break;

		case 2:

			System.out.println("February");

			break;

		case 3:

			System.out.println("March");

			break;

		case 4:

			System.out.println("April");

			break;

		case 5:

			System.out.println("May");

			break;

		case 6:

			System.out.println("June");

			break;

		case 7:

			System.out.println("July");

			break;

		case 8:

			System.out.println("August");

			break;

		case 9:

			System.out.println("September");

			break;

		case 10:

			System.out.println("October");

			break;

		case 11:

			System.out.println("November");

			break;

		case 12:

			System.out.println("December");

			break;

		default:

			System.out.println("Not a month!");

			break;

		}

		month = 2;

		int year = 2000;

		int numDays = 0;

		switch (month) {

		case 1:

		case 3:

		case 5:

		case 7:

		case 8:

		case 10:

		case 12:

			numDays = 31;

			break;

		case 4:

		case 6:

		case 9:

		case 11:

			numDays = 30;

			break;

		case 2:

			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))

				numDays = 29;

			else

				numDays = 28;

			break;

		default:

			numDays = 0;

			break;

		}

		System.out.println("Number of Days = " + numDays);

		Month _month = Month.FEBRUARY;

		switch (_month) {

		case JANUARY:

		case MARCH:

		case MAY:

		case JULY:

		case AUGUST:

		case OCTOBER:

		case DECEMBER:

			numDays = 31;

			break;

		case APRIL:

		case JUNE:

		case SEPTEMBER:

		case NOVEMBER:

			numDays = 30;

			break;

		case FEBRUARY:

			if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))

				numDays = 29;

			else

				numDays = 28;

			break;

		default:

			numDays = 0;

			break;

		}

		System.out.println("Number of Days = " + numDays);

		// feltétel nélküli vezérlésátadás

		// break

		int searchfor = 12;

		i = 0;

		boolean foundIt = false;

		for (; i < arrayOfInts.length; i++) {

			if (arrayOfInts[i] == searchfor) {

				foundIt = true;

				break;

			}

		}

		if (foundIt) {

			System.out.println("Found " + searchfor + " at index " + i + '.');

		} else {

			System.out.println(searchfor + "not in the array");

		}

		// cimkézett break

		int[][] matrix = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 },

				{ 622, 127, 77, 955 } };

		searchfor = 12;

		i = 0;

		int j = 0;

		foundIt = false;

		search: for (; i < matrix.length; i++) {

			for (j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == searchfor) {

					foundIt = true;

					break search;

				}

			}

		}

		if (foundIt) {

			System.out.println("Found " + searchfor + " at " + i + ", " + j

					+ '.');

		} else {

			System.out.println(searchfor + "not in the array.");

		}

		// continue

		StringBuffer searchMe = new StringBuffer(

				"peter piper picked a peck of pickled peppers");

		int max = searchMe.length();

		int numPs = 0;

		for (int p = 0; p < max; p++) {

			// interested only in p's

			if (searchMe.charAt(p) != 'p')

				continue;

			// process p's

			numPs++;

			searchMe.setCharAt(p, 'P');

		}

		System.out.println("Found " + numPs + " p's in the string.");

		System.out.println(searchMe);

		// cimkézett continue

		String searchMeStr = "Look for a substring in me";

		String substring = "sub";

		foundIt = false;

		max = searchMeStr.length() - substring.length();

		test: for (int d = 0; d <= max; d++) {

			int n = substring.length();

			int q = d;

			int k = 0;

			while (n-- != 0) {

				if (searchMeStr.charAt(q++) != substring.charAt(k++)) {

					continue test;

				}

			}

			foundIt = true;

			break test;

		}

		System.out.println(foundIt ? "Found it" : "Didn't find it");

		// TÖMBÖK

		int[] anArray;

		anArray = new int[10];

		for (int z = 0; z < anArray.length; z++) {

			anArray[z] = z;

			System.out.print(anArray[z] + " ");

		}

		System.out.println();

		String[] anArrayStr = { "String One", "String Two", "String Three" };

		for (int o = 0; o < anArrayStr.length; o++) {

			System.out.println(anArrayStr[o].toLowerCase());

		}

		for (String s : anArrayStr) {

			System.out.println(s.toLowerCase());

		}

		// MATRIX

		String[][] cartoons = {

				{ "Flintstones", "Fred", "Wilma", "Pebbles", "Dino" },

				{ "Rubbles", "Barney", "Betty", "Bam Bam" },

				{ "Jetsons", "George", "Jane", "Elroy", "Judy", "Rosie",

						"Astro" },

				{ "Scooby Doo Gang", "Scooby Doo", "Shaggy", "Velma", "Fred",

						"Daphne" } };

		for (int n = 0; n < cartoons.length; n++) {

			System.out.print(cartoons[n][0] + ": ");

			for (int v = 1; v < cartoons[n].length; v++) {

				System.out.print(cartoons[n][v] + " ");

			}

			System.out.println();

		}

		// Tömb másolása másik tömbbe

		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a',

				't', 'e', 'd' };

		char[] copyTo = new char[7];

		System.arraycopy(copyFrom, 2, copyTo, 0, 7);

		System.out.println(new String(copyTo));

	}

}
