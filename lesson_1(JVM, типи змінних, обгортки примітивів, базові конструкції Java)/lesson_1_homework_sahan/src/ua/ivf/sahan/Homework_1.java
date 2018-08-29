package ua.ivf.sahan;

public class Homework_1 {
	public static void main(String[] args) {
		//TASK 1
			byte b = 2;
			char c = 'H';
			short s = 5;
			int i1 = 345;
			double d = 3212.56;
			long l = 4l;
			String s2 = "Hi teacher";
			float f = 3.54f;
			boolean b1 = true;
			
		//TASK 2
			System.out.println("Minimal byte value: " + Byte.MIN_VALUE);
			System.out.println("Maximum byte value: " + Byte.MAX_VALUE);
			System.out.println("Minimal short value: " + Short.MIN_VALUE);
			System.out.println("Miximum short value: " + Short.MAX_VALUE);
			System.out.println("Minimal int value: " + Integer.MIN_VALUE);
			System.out.println("Miximum int value: " + Integer.MAX_VALUE);
			System.out.println("Minimal double value: " + Double.MIN_VALUE);
			System.out.println("Miximum double value: " + Double.MAX_VALUE);
			System.out.println("Minimal char value: " + Character.MIN_VALUE);
			System.out.println("Miximum char value: " + Character.MAX_VALUE);
			System.out.println("Minimal long value: " + Long.MIN_VALUE);
			System.out.println("Miximum long value: " + Long.MAX_VALUE);
			System.out.println("Minimal float value: " + Float.MIN_VALUE);
			System.out.println("Miximum float value: " + Float.MAX_VALUE);
			
		//TASK 3
			int arr [] = {13, 35, 87, 54, 95, 5, 8, 123, 62, 40};
			
			int max = arr[0], min = arr[0], index = 0, index1 = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if (max < arr[i]) {
					max = arr[i];
					index = i;
				}
			}
			
			for(int i = 0; i < arr.length; i++) {
				if (min > arr[i]) {
					min = arr[i];
					index1 = i;
				}
			}
			
			System.out.println("Max value: " + max + ". Position in array: " + index);
			System.out.println("Min value: " + min + ". Position in array: " + index1);
	}
}
