package is.ru.stringcalculator;

public class Calculator {

	public static int add(String text) {
		
		if(text.equals("")) {
			return 0;
		}
		else if(text.length() == 1) {
			return toInt(text);
		}	

		else if(text.length() == 3) {
			String [] numbers = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		}
			//If the string holds more than 3 chars
			//then there are 3 or more numbers in the string
		else if(text.length() > 3) {
			
			String [] numbers = text.split(",|\n");
			int total = 0;
	
			for(int i = 0; i < numbers.length; i++)
			{
				total += toInt(numbers[i]);
			}
			return total;
		}

		else return 1;
	}

	private static int toInt(String number) {
		return Integer.parseInt(number);
	}

	private static String [] splitNumbers(String numbers){
		return numbers.split(",|\n");
	}
}