package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {

	public static String multiply(int num1, int num2) {
		int result = num1 * num2;
		return String.format("%d x %d = %d", num1, num2, result);
	}

	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked"))
				return i;
		}
		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).equals(true))
				return i;
		}
		return -1;
	}

	public static double findTallest(List<Double> peeps) {
		double biggest = peeps.get(0);
		double current;
		for (int i = 0; i < peeps.size(); i++) {
			current = peeps.get(i);
			if (current > biggest) {
				biggest = current;
			}
		}
		return biggest;
	}

	public static String findLongestWord(List<String> words) {
		String biggest = words.get(0);
		String current;
		for (int i = 0; i < words.size(); i++) {
			current = words.get(i);
			if (current.length() > biggest.length()) {
				biggest = current;
			}
		}
		return biggest;
	}

	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).equals("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> d) {
		for (int i = 0; i < d.size(); i++) {
			for (int k = 0; k < d.size() - 1; k++) {
				if (d.get(k) > d.get(k + 1)) {
					double temp = d.get(k);
					d.set(k, d.get(k + 1));
					d.set(k + 1, temp);
				}
			}
		}
		return d;
	}
	
	public static List<String> sortDNA(List<String> seq) {
		for (int i = 0; i < seq.size(); i++) {
			for (int k = 0; k < seq.size() - 1; k++) {
				if (seq.get(k).length() > seq.get(k + 1).length()) {
					String temp = seq.get(k);
					seq.set(k, seq.get(k + 1));
					seq.set(k + 1, temp);
				}
			}
		}
		return seq;
	}
	public static List<String> sortWords(List<String> words) {
		for (int i = 0; i < words.size(); i++) {
            for (int k = 0; k < words.size() - 1; k++) {
                if( words.get(k).compareTo(words.get(k+1)) > 0 ) {
                    String temp = words.get(k);
                    words.set(k, words.get(k+1));
                    words.set(k+1, temp);
                }
            }
        }
		return words;
	}

    public static boolean isPrime(int number) {
        if (number == 2) return true;
        for (int i = 2; i <= Math.ceil(Math.sqrt(number)); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static boolean isSquare(int number) {
    	double sqrt = Math.sqrt(number);
    	if (sqrt == Math.floor(sqrt)) {
    		return true;
    	}
    	return false;
    }
    public static boolean isCube(int number) {
    	double cbrt = Math.cbrt(number);
    	if (cbrt == Math.floor(cbrt)) {
    		return true;
    	}
    	return false;
    }
    
}
