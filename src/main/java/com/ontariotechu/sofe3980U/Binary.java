package com.ontariotechu.sofe3980U;

/**
 * Unsigned integer Binary variable
 *
 */
public class Binary
{
	private String number="0";  // string containing the binary value '0' or '1'
	/**
	* A constructor that generates a binary object.
	*
	* @param number a String of the binary values. It should conatins only zeros or ones with any length and order. otherwise, the value of "0" will be stored.   Trailing zeros will be excluded and empty string will be considered as zero.
	*/
    public Binary(String number) {
		for (int i = 0; i < number.length(); i++) {
			// check each character if it's not 0 or 1
			char ch=number.charAt(i);
			if(ch!='0' && ch!='1') {
				number="0"; // if not store "0" and end the function
				return;
			}
		}
		// remove any trailing zeros
		int beg;
		for (beg = 0; beg < number.length(); beg++) {
			if (number.charAt(beg)!='0')
				break;
		}
		//beg has the index of the first non zero digit in the number
		this.number=number.substring(beg); // exclude the trailing zeros if any
		// uncomment the following code

		if(this.number=="") { // replace empty strings with a single zero
			this.number="0";
		}

    }
	/**
	* Return the binary value of the variable
	*
	* @return the binary value in a string format.
	*/
	public String getValue()
	{
		return this.number;
	}
	/**
	* Adding two binary variables.
	*
	* @param num1 The first addend object
	* @param num2 The second addend object
	* @return A binary variable with a value of <i>num1+num2</i>.
	*/
	public static Binary add(Binary num1,Binary num2)
	{
		// the index of the first digit of each number
		int ind1=num1.number.length()-1;
		int ind2=num2.number.length()-1;
		//initial variable
		int carry=0;
		String num3="";  // the binary value of the sum
		while(ind1>=0 ||  ind2>=0 || carry!=0) // loop until all digits are processed
		{
			int sum=carry; // previous carry
			if(ind1>=0){ // if num1 has a digit to add
				sum += (num1.number.charAt(ind1)=='1')? 1:0; // convert the digit to int and add it to sum
				ind1--; // update ind1
			}
			if(ind2>=0){ // if num2 has a digit to add
				sum += (num2.number.charAt(ind2)=='1')? 1:0; // convert the digit to int and add it to sum
				ind2--; //update ind2
			}
			carry=sum/2; // the new carry
			sum=sum%2;  // the resultant digit
			num3 =( (sum==0)? "0":"1")+num3; //convert sum to string and append it to num3
		}
		Binary result=new Binary(num3);  // create a binary object with the calculated value.
		return result;
		
	}

	/**
	 * Does a logical OR operation on two binary variables.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary or(Binary num1,Binary num2)
	{
		// Takes string containing bits for num1; parses the string into an integer.
		// Specified that the binary numeric system is being used within the second argument (radix 2),
		// converting it to decimal system (radix 10).
		int dec1 = Integer.parseInt(num1.number, 2);
		// Takes string containing bits for num2; converts to decimal.
		int dec2 = Integer.parseInt(num2.number, 2);

		// Bitwise OR operation for two integers is performed and stored within decResult.
		int decResult = dec1 | dec2;

		// Creates a binary object with value of previous calculation (the value is first converted
		// to a binary string before it is passed to the constructor.
		Binary result = new Binary(Integer.toBinaryString(decResult));
		return result;
		
	}

	/**
	 * Does a logical AND operation on two binary variables.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary and(Binary num1,Binary num2)
	{
		// Takes string containing bits for num1; parses the string into an integer.
		// Specified that the binary numeric system is being used within the second argument (radix 2),
		// converting it to decimal system (radix 10).
		int dec1 = Integer.parseInt(num1.number, 2);
		// Takes string containing bits for num2; converts to decimal.
		int dec2 = Integer.parseInt(num2.number, 2);

		// Bitwise AND operation for two integers is performed and stored within decResult.
		int decResult = dec1 & dec2;

		// Creates a binary object with value of previous calculation (the value is first converted
		// to a binary string before it is passed to the constructor.
		Binary result = new Binary(Integer.toBinaryString(decResult));
		return result;
		
	}

	/**
	 * Multiplies two binary variables.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary multiply(Binary num1,Binary num2)
	{
		// Takes string containing bits for num1; parses the string into an integer.
		// Specified that the binary numeric system is being used within the second argument (radix 2),
		// converting it to decimal system (radix 10).
		int dec1 = Integer.parseInt(num1.number, 2);
		// Takes string containing bits for num2; converts to decimal.
		int dec2 = Integer.parseInt(num2.number, 2);

		// Integer multiplication is performed and stored within decResult.
		int decResult = dec1 * dec2;

		// Creates a binary object with value of previous calculation (the value is first converted
		// to a binary string before it is passed to the constructor.
		Binary result = new Binary(Integer.toBinaryString(decResult));
		return result;
	}

	/**
	 * Does a logical OR operation on two binary variables.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary bitWiseOr(Binary num1, Binary num2)
	{
		// Carry Index of first digit of each number
		int ind1=num1.number.length()-1;
		int ind2=num2.number.length()-1;

		// INTILIZE VARIABLES
		String answer="";// Used throughout method to carry binary value
		int temp;// Temporary Variable

		// Loops as long as either variable are larger than 0
		// meaning more numbers remain to be looked at
		while(ind1>=0 || ind2>=0){// Will Loop until all digits are processed
			temp=0;// Clears temp variable after each loop

			// Checks if any Digits remain
			if (ind1 >= 0){// If less than 0 than no digits remain
				// Check if the digit at the current loop iteration’s index is a 1
				// If it happens to be a 1 then temp will carry the value 1,
				// if not, it will carry the value 0
				temp = (num1.number.charAt(ind1) == '1')? 1:temp;
				ind1--;// Update
			}
			if (ind2 >= 0){// If less than 0 than no digits remain
				// Check if the digit at the current loop iteration’s index is a 1
				// If it happens to be a 1 then temp will carry the value 1,
				// if not, it will carry the value 0
				temp = (num2.number.charAt(ind2) == '1')? 1:temp;
				ind2--;// Update
			}

			// If temp is 1 in this loop then answer will hold value 1, if not 0
			// Stores current digits calculation
			answer = ((temp==1)? "1":"0") + answer;
		}

		Binary result=new Binary(answer);// Create a binary object with the calculated value
		return result;// return the value to App.java
	}

	/**
	 * Does a logical AND operation on two binary variables.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary bitWiseAnd(Binary num1, Binary num2)
	{
		// Carry Index of first digit of each number
		int ind1=num1.number.length()-1;
		int ind2=num2.number.length()-1;

		// INTILIZE VARIABLES
		String answer="";// Used throughout method to carry binary value
		int temp1;// Temporary Variable
		int temp2;// Temporary Variable

		// Loops as long as either variable are larger than 0
		// meaning more numbers remain to be looked at
		while(ind1>=0 || ind2>=0){// Will Loop until all digits are processed
			// Clears temp variable after each loop
			temp1 = 0;
			temp2 = 0;

			// Checks if any Digits remain
			if (ind1 >= 0){// If less than 0 than no digits remain
				// Check if the digit at the current loop iteration’s index is a 1
				// If it happens to be a 1 then temp will carry the value 1,
				// if not, it will carry the value 0
				temp1 = (num1.number.charAt(ind1) == '1')? 1:0;
				ind1--;// Update
			}
			if (ind2 >= 0){// If less than 0 than no digits remain
				// Check if the digit at the current loop iteration’s index is a 1
				// If it happens to be a 1 then temp will carry the value 1,
				// if not, it will carry the value 0
				temp2 = (num2.number.charAt(ind2) == '1')? 1:0;
				ind2--;// Update
			}

			// If both temp values are 1 in this loop then answer will hold value 1, if not 0
			// Stores current digits calculation
			answer = ((temp1==1 && temp2==1)? "1":"0") + answer;
		}

		Binary result=new Binary(answer);// Create a binary object with the calculated value
		return result;// return the value to App.java
	}

	/**
	 * Multiplies two binary variables.
	 *
	 * @param num1 The first addend object
	 * @param num2 The second addend object
	 * @return A binary variable with a value of <i>num1+num2</i>.
	 */
	public static Binary bitWiseMultiply(Binary num1, Binary num2)
	{
		// Carry index of LSB of each number
		int ind1=num1.number.length()-1;
		int ind2=num2.number.length()-1;

		// INTILIZE VARIABLES
		Binary result = new Binary("0"); // Create a binary object to hold calculated value
		//Larger number will be treated as multiplicand, and smaller number as the multiplier
		Binary largeNum = (ind1>=ind2)? num1:num2;
		//Sets smallNum based on the value set for largeNum
		Binary smallNum = (largeNum==num1)? num2:num1;

		// Reassigns binary objects so largeNum > num1 and smallNum > num2
		// will be needed when performing shifts
		num1 = largeNum;
		num2 = smallNum;

		// Loops until all bits of the multiplier (smallNum) are read 
		for(int i=smallNum.number.length()-1; i>=0; i--)
		{
			// If bit at current position equals 1, the value of num1 is added to the result
			// Add function is called to perform the addition
			if(smallNum.number.charAt(i)=='1'){
				result = add(result,num1);
			}
			// 0 is concatenated to the multiplicand to prepare for the next iteration
			// Similar to moving from ones to tens place in decimal - an extra 0 is required
			// before the next intermediate addition operation can be performed
			num1.number+="0";
		}

		return result; // Return binary object containing product binary string
	}
}	
