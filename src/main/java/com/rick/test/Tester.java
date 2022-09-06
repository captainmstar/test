package com.rick.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {

		
//		System.out.println("sumOfDigits == " + sumOfDigits(12345));
		/*
		 * Sample Input: 17 28 30
			99 16 8
			Output: 2 1
		 */
		//List<Integer> result = compareTriplets(List.of(17,28,30), List.of(99,16,8));
		//System.out.println("result == " + result);
//		List<List<Integer>> arr = List.of(List.of(1,2,3), List.of(4,5,6), List.of(9,8,9));
//		System.out.println("result == " + diagonalDifference(arr));
		
//		int[] arr = new int[] {-4,3,-9,0,4,1};
//		plusMinus(arr);
		
//		staircase(10);
		
//		int[] arr = new int[] {793810624, 895642170, 685903712, 623789054, 468592370};
//		miniMaxSum(arr);
		//2572095760 2999145560
		
//		int[] arr = new int[] {3, 2, 1, 3};
//		System.out.println(birthdayCakeCandles(arr));
		
//		String time = "07:05:45PM";
//		System.out.println(timeConversion(time));
		
//		List<Integer> grades = List.of(73,67,38,33);
//		System.out.println(gradingStudents(grades));
		
//		7 11
//		5 15
//		-2 2 1
//		5 -6
//		int[] apples = new int[] {2,3,-4};
//		int[] oranges = new int[] {3,-2,-4};
//		countApplesAndOranges(7, 10, 4, 12, apples, oranges);
		
//		//0 3 4 2
//		System.out.println(kangaroo(0,3,4,2));
//		//0 2 5 3
//		System.out.println(kangaroo(0,2,5,3));
		
//		List<Integer> a = List.of(2,4);
//		List<Integer> b = List.of(16,32,96);
//		System.out.println(getTotalX(a,b));
		
//		3 4 21 36 10 28 35 5 24 42
//		int[] apples = new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
//		int[] result = breakingRecords(apples);
//		System.out.println(result[0] + " " + result[1]);
		
		//1 1 1 1 1 1
		//3 2
		//should be 0
//		List<Integer> test = List.of(1,1,1,1,1,1);
//		System.out.println(birthday(test, 3,2));
//		
////		1 2 1 3 2
////		3 2
//		//Should be 2
//		test = List.of(1,2,1,3,2);
//		System.out.println(birthday(test, 3,2));
//		
//		//4
//		//4 1
//		test = List.of(4);
//		System.out.println(birthday(test, 4,1));
		
		//6 3
		//1 3 2 6 1 2
//		int[] test = new int[] {1, 3, 2, 6, 1, 2};
//		System.out.println(divisibleSumPairs(6, 3, test));
//		
//		test = new int[] {1, 2,3,4,5,6};
//		System.out.println(divisibleSumPairs(6, 5, test));
		
		//1 4 4 4 5 3
//		List<Integer> test = List.of(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4);
//		System.out.println(migratoryBirds(test));
		
//		System.out.println(dayOfProgrammer(2017));
		
		//4 1
		//3 10 2 9
		//12
		//Should be 5
//		List<Integer> test = List.of(3, 10, 2, 9);
//		bonAppetit(test, 1, 12);
		
		//4 1
		//3 10 2 9
		//7
		//Should be Bon Appetit
//		test = List.of(3, 10, 2, 9);
//		bonAppetit(test, 1, 7);
		
		//9
		//10 20 20 10 10 30 50 10 20
//		int[] test = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
//		System.out.println(sockMerchant(9, test));
		
//		System.out.println(pageCount(6, 2));
		
		System.out.println(countingValleys(8, "UDDDUDUU"));
	}
	
	 // Complete the countingValleys function below.
	 //https://www.hackerrank.com/challenges/counting-valleys/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
    static int countingValleys(int n, String s) {
    	if(s == null || s.isBlank()) {
    		return 0;
    	}
    	int elevation = 0, numValleys = 0;
		String[] hike = s.split("");
		for(String step : hike) {
			if("U".equals(step)) {
				elevation++;
			} else if ("D".equals(step)) {
				elevation--;
				if(elevation == -1) {//took a step into valley
					numValleys++;
				}
			}
		}
		return numValleys;
    }
	
	
	/*
     * Complete the pageCount function below.
     * https://www.hackerrank.com/challenges/drawing-book/problem
     */
    static int pageCount(int n, int p) {
    	int page1 = Math.abs((p) / 2);
        if(n%2==0){
            n++;
        }
        int page2 = Math.abs((p - (n)) / 2);
        return page1 < page2 ? page1 : page2;
    }
	
	// Complete the sockMerchant function below.
	//https://www.hackerrank.com/challenges/sock-merchant/problem
    static int sockMerchant(int n, int[] ar) {
    	Map<Integer, Long> map = Arrays.stream(ar).mapToObj(Integer::valueOf).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    	int pairs = 0;
    	for(Long count : map.values()) {
    		pairs += count/2;
    	}
    	return pairs;
    }
	
	// Complete the bonAppetit function below.
	//https://www.hackerrank.com/challenges/bon-appetit/problem?h_r=next-challenge&h_v=zen
    static void bonAppetit(List<Integer> bill, int k, int b) {
    	int billTotal = 0;
    	for(int i = 0; i < bill.size(); i++) {
    		if(i != k) {
    			billTotal += bill.get(i);
    		}
    	}
    	if(billTotal/2 == b) {
    		System.out.println("Bon Appetit");
    	} else {
    		System.out.println(b - (billTotal/2));
    	}
    }
	
	// Complete the dayOfProgrammer function below.
	//https://www.hackerrank.com/challenges/day-of-the-programmer/problem?h_r=next-challenge&h_v=zen
    static String dayOfProgrammer(int year) {
    	if(year == 1918) {
    		return "26.08.1918";
    	} else {
    		boolean isLeapYear = false;
    		if((year < 1918 && year%4 == 0) || (year > 1918 && ((year%400 == 0) || (year%4 == 0 && year%100 != 0)))) {
    			isLeapYear = true;
    		}
    		return isLeapYear ? String.format("12.09.%d", year) : String.format("13.09.%d", year);
    	}
    }
	
	// Complete the migratoryBirds function below.
	//https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
    static int migratoryBirds(List<Integer> arr) {
    	Map<Integer, Long> birdCount = arr.stream().sorted().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
    	Optional<Entry<Integer, Long>> maxEntry = birdCount.entrySet()
    		        .stream()
    		        .max(Comparator.comparing(Map.Entry::getValue));
    	return maxEntry.get().getKey();
    }
	
	// Complete the divisibleSumPairs function below.
	//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem?h_r=next-challenge&h_v=zen
    static int divisibleSumPairs(int n, int k, int[] ar) {
    	int result = 0;
    	for(int i = 0; i < ar.length - 1; i++) {
    		int iValue = ar[i];
    		for(int j = i + 1; j < ar.length; j++) {
    			if((iValue + ar[j])%k == 0) {
    				result++;
    			}
    		}
    	}
    	return result;
    }
	
	// Complete the birthday function below.
	//https://www.hackerrank.com/challenges/the-birthday-bar/problem
    static int birthday(List<Integer> s, int d, int m) {

    	int result = 0, from = 0;
    	int to = m;
    	while(to <= s.size()) {
    		List<Integer> subList = s.subList(from++, to++);
    		int sum = subList.stream().mapToInt(Integer::valueOf).sum();
    		if(sum == d) {
    			result++;
    		}
    	}
    	return result;
    }
	
	// Complete the breakingRecords function below.
	//	https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?h_r=next-challenge&h_v=zen
    static int[] breakingRecords(int[] scores) {
    	int bestScore = scores[0], worstScore = scores[0];
    	int bestCount = 0, worstCount = 0;
    	
    	for(int i = 1; i < scores.length; i++) {
    		if(scores[i] > bestScore) {
    			bestScore = scores[i];
    			bestCount++;
    		} else if(scores[i] < worstScore) {
    			worstScore = scores[i];
    			worstCount++;
    		}
    	}
    	
    	return new int[] {bestCount, worstCount};
    }
	
	/*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	int x=1,r=0,j=0,count=0;
        int[] d = new int[101];
        for(x=1;x<101;x++){
        	int c=0;
        		for(int i=0;i<a.size();i++) {
        			if(x%a.get(i)==0&&x>=a.get(i)){
        				c++;
        			}
        			}
        		if(c==a.size()){
        			d[j]=x;
    				r++;
    				j++;
        		}
        		}
        for(j=0;j<r;j++){
        	int c=0;
            for(int i=0;i<b.size();i++){
         	   if(b.get(i)%d[j]==0){
         		   c++;
         	   }
            }
            if(c==b.size()){
         	   count++;
            }
        }
        return count;
    }
	
	// Complete the kangaroo function below.
	//https://www.hackerrank.com/challenges/kangaroo/problem
    static String kangaroo(int x1, int v1, int x2, int v2) {
    	int x1Point = x1;
    	int x2Point = x2;
    	for(int i = 0; i < 10001; i++) {
    		x1Point += v1;
    		x2Point += v2;
    		if(x1Point == x2Point) {
    			return "YES";
    		}
    	}
    	return "NO";

    }
	
	// Complete the countApplesAndOranges function below.
	//https://www.hackerrank.com/challenges/apple-and-orange/problem
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
//    	BiPredicate<Integer, Integer> p = (tree, d) -> {
//    		if((tree + d) >= s && (tree + d) <= t) {
//    			return true;
//    		}
//    		return false;
//    	};
    	//apples
    	int appleCount = (int)Arrays.stream(apples).filter(d -> {
    		if((a + d) >= s && (a + d) <= t) {
			return true;
		}
		return false;}).count();
    	//oranges
    	int orangeCount = (int)Arrays.stream(oranges).filter(d -> {if((b + d) >= s && (b + d) <= t) {
			return true;
		}
		return false;}).count();
    	System.out.println(appleCount);
    	System.out.println(orangeCount);
    }
	
	/*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     * https://www.hackerrank.com/challenges/grading/problem
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    	int f = 38;
    	List<Integer> result = grades.stream().map(grade -> {
    		//failing grade
    		if(grade < f) {
    			return grade;
    		}
    		//always round up grade for test
    		int ceiling = (int)Math.ceil(grade/5.0);
    		int roundUp = 5 * ceiling;
    		if((roundUp - grade) < 3) {
    			return roundUp;
    		}
    		return grade;
    	}).collect(Collectors.toList());
    	return result;
    }
	
	static String timeConversion(String s) {
		Date date = null;
		try {
			date = new SimpleDateFormat("hh:mm:ssa").parse(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        return date != null ? formatter.format(date) : null;
    }
	
	/*
     * Complete the timeConversion function below.
     * https://www.hackerrank.com/challenges/time-conversion/problem?h_r=next-challenge&h_v=zen
     */
    static String timeConversionBest(String s) {
        LocalDateTime lt = LocalDateTime.parse(s, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        return lt.format(formatter);
    }
	
	// Complete the birthdayCakeCandles function below.
	//https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    static int birthdayCakeCandles(int[] ar) {
    	int max = Arrays.stream(ar).max().orElse(0);
    	return (int)Arrays.stream(ar).filter(v -> v == max).count();
    }
	
	// Complete the miniMaxSum function below.
	//https://www.hackerrank.com/challenges/mini-max-sum/problem?h_r=next-challenge&h_v=zen
    static void miniMaxSum(int[] arr) {
    	Arrays.sort(arr);
    	long max = Arrays.stream(arr).skip(1).mapToLong(Long::valueOf).sum();
    	long min = Arrays.stream(arr).limit(arr.length - 1).mapToLong(Long::valueOf).sum();
    	System.out.println(min + " " + max);
    }
	
	//Complete the staircase function below.
	//https://www.hackerrank.com/challenges/staircase/problem
    static void staircase(int n) {
    	char[] arr = new char[n];
    	Arrays.fill(arr, ' ');
    	String s = new String(arr);
    	for(int i = n - 1; i >= 0; i--) {
//    		s.rep
    		System.out.println(s.toString());
    	}
    }
	
	// Complete the staircase function below.
	//https://www.hackerrank.com/challenges/staircase/problem
    static void staircaseFirst(int n) {
    	int spaceIndex = n - 1;
    	for(int i = 0; i < n; i++) {
    		StringBuilder sb = new StringBuilder();
    		for(int j = 0; j < spaceIndex; j++) {
    			sb.append(" ");
    		}
    		for(int k = spaceIndex; k < n; k++) {
    			sb.append("#");
    		}
    		spaceIndex--;
    		System.out.println(sb.toString());
    	}
    	
    }
	
	
	// Complete the plusMinus function below.
	//https://www.hackerrank.com/challenges/plus-minus/problem?h_r=next-challenge&h_v=zen
    static void plusMinus(int[] arr) {

    	long positiveCount = Arrays.stream(arr).filter(v -> v > 0).count();
    	long negativeCount = Arrays.stream(arr).filter(v -> v < 0).count();
    	long zeroCount = Arrays.stream(arr).filter(v -> v == 0).count();
    	
    	System.out.println(String.format("%.6f", (float)positiveCount/arr.length));
    	System.out.println(String.format("%.6f", (float)negativeCount/arr.length));
    	System.out.println(String.format("%.6f", (float)zeroCount/arr.length));
    }
	
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     * https://www.hackerrank.com/challenges/diagonal-difference/problem
     */
	public static int diagonalDifference(List<List<Integer>> arr) {
		int leftToRightSum = 0;
		int rightToLeftSum = 0;
		for(int i = 0, j = arr.size() - 1; i < arr.size(); i++, j--) {
			leftToRightSum += arr.get(i).get(i);
			rightToLeftSum += arr.get(i).get(j);
		}
		return Math.abs(leftToRightSum - rightToLeftSum);
	}
	
	// Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
    	return Arrays.stream(ar).sum();
    }
	
	// Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	Integer aliceFinalScore = 0;
    	Integer bobFinalScore = 0;
    	for(int i = 0; i < 3; i++) {
    		Integer aliceScore = a.get(i);
    		Integer bobScore = b.get(i);
    		if(aliceScore > bobScore) {
    			aliceFinalScore++;
    		} else if(bobScore > aliceScore) {
    			bobFinalScore++;
    		}
    	}
    	return Arrays.asList(aliceFinalScore, bobFinalScore);
    }
	
	/*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
    	return Arrays.stream(ar).sum();
    }

	static int sumOfDigits(int x) {
		if (x == 0) {
			return 0;
		}
		return x % 10 + sumOfDigits(x / 10);
	}
	
}
