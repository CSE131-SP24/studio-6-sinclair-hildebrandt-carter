package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) { //base case(known value)
			return 0;
		}else {
			return 1/(Math.pow(2,n))+geometricSum(n-1);
		}
			// FIXME compute the geometric sum for the first n terms recursively
			
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p%q==0) {
			return q;
		}else {
			return gcd(q,p%q);
		}
			// FIXME compute the gcd of p and q using recursion
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[] reversed = new int[array.length];	
		int i =(array.length)-1;
			// FIXME create a helper method that can recursively reverse the given array
			return reverseHelper(array,reversed, i);
		
	}
	public static int[] reverseHelper(int[] array, int[] reversed, int i) {
		if (i<0) {
			return reversed;
		}else {
			reversed[i]=array[array.length-i-1];
		return reverseHelper(array,reversed,i-1);
		}
		
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
			double bound =5.0;
			StdDraw.setXscale(-bound,bound);
			StdDraw.setYscale(-bound,bound);
		// FIXME
			if (radius < radiusMinimumDrawingThreshold) {
				return;  // abandon recursion
			}
			StdDraw.circle(xCenter, yCenter, radius);
			circlesUponCircles(xCenter-radius,yCenter,radius/3.0,radiusMinimumDrawingThreshold);//left hand circle
			circlesUponCircles(xCenter+radius,yCenter,radius/3.0,radiusMinimumDrawingThreshold);//right hand circle
			circlesUponCircles(xCenter,yCenter-radius,radius/3.0,radiusMinimumDrawingThreshold);//bottom circle
			circlesUponCircles(xCenter,yCenter+radius,radius/3.0,radiusMinimumDrawingThreshold);//top circle

	}

}
