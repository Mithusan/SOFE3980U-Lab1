package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest 
{
    /**
     * Test The constructor with a valid binary vallue
     */
    @Test
    public void normalConstructor()
    {
		Binary binary=new Binary("1001001");
        assertTrue( binary.getValue().equals("1001001"));
    }
    /**
     * Test The constructor with an invalid binary value of out-of-range digits
     */
    @Test
    public void constructorWithInvalidDigits()
    {
		Binary binary=new Binary("1001001211");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value of alphabetic characters
     */
    @Test
    public void constructorWithInvalidChars()
    {
		Binary binary=new Binary("1001001A");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * Test The constructor with an invalid binary value that has a sign
     */
    @Test
    public void constructorWithNegativeSign()
    {
		Binary binary=new Binary("-1001001");
        assertTrue( binary.getValue().equals("0"));
    }
    /**
     * T	est The constructor with a zero tailing valid binary value
     */
    @Test
    public void constructorWithZeroTailing()
    {
		Binary binary=new Binary("00001001");
        assertTrue( binary.getValue().equals("1001"));
    }
    /**
     * Test The constructor with an empty string
     */
    @Test
    public void constructorEmptyString()
    {
		Binary binary=new Binary("");
        assertTrue( binary.getValue().equals("0"));
    }
	/**
     * Test The add functions with two binary numbers of the same length
     */
    @Test
    public void add()
    {
		Binary binary1=new Binary("1000");
		Binary binary2=new Binary("1111");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("10111"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is less than the second
     */
    @Test
    public void add2()
    {
		Binary binary1=new Binary("1010");
		Binary binary2=new Binary("11");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with two binary numbers, the length of the first argument is greater than the second
     */
    @Test
    public void add3()
    {
		Binary binary1=new Binary("11");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1101"));
    }
	/**
     * Test The add functions with a binary numbers with zero
     */
    @Test
    public void add4()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("1010");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("1010"));
    }
	/**
     * Test The add functions with two zeros
     */
    @Test
    public void add5()
    {
		Binary binary1=new Binary("0");
		Binary binary2=new Binary("0");
		Binary binary3=Binary.add(binary1,binary2);
        assertTrue( binary3.getValue().equals("0"));
    }

    //-------------------------------------------------------------------------------
    //OR
    @Test
    public void or(){
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.or(binary1,binary2);
        assertTrue(binary3.getValue().equals("1111"));
    }

    @Test
    public void or2(){
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.or(binary1,binary2);
        assertTrue(binary3.getValue().equals("1011"));
    }

    @Test
    public void or3(){
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.or(binary1,binary2);
        assertTrue(binary3.getValue().equals("1011"));
    }

    @Test
    public void or4(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.or(binary1,binary2);
        assertTrue(binary3.getValue().equals("1010"));
    }

    @Test
    public void or5(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.or(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    //-------------------------------------------------------------------------------
    //BitWiseOR
    @Test
    public void bitWiseOr(){
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.bitWiseOr(binary1,binary2);
        assertTrue(binary3.getValue().equals("1111"));
    }

    @Test
    public void bitWiseOr2(){
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.or(binary1,binary2);
        assertTrue(binary3.getValue().equals("1011"));
    }

    @Test
    public void bitWiseOr3(){
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.bitWiseOr(binary1,binary2);
        assertTrue(binary3.getValue().equals("1011"));
    }

    @Test
    public void bitWiseOr4(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.bitWiseOr(binary1,binary2);
        assertTrue(binary3.getValue().equals("1010"));
    }

    @Test
    public void bitWiseOr5(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.bitWiseOr(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    //-------------------------------------------------------------------------------
    //AND
    @Test
    public void and(){
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.and(binary1,binary2);
        assertTrue(binary3.getValue().equals("1000"));
    }

    @Test
    public void and2(){
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.and(binary1,binary2);
        assertTrue(binary3.getValue().equals("10"));
    }

    @Test
    public void and3(){
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.and(binary1,binary2);
        assertTrue(binary3.getValue().equals("10"));
    }

    @Test
    public void and4(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.and(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    @Test
    public void and5(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.and(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    //-------------------------------------------------------------------------------
    //BitwiseAND
    @Test
    public void bitWiseAnd(){
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.bitWiseAnd(binary1,binary2);
        assertTrue(binary3.getValue().equals("1000"));
    }

    @Test
    public void bitWiseAnd2(){
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.bitWiseAnd(binary1,binary2);
        assertTrue(binary3.getValue().equals("10"));
    }

    @Test
    public void bitWiseAnd3(){
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.bitWiseAnd(binary1,binary2);
        assertTrue(binary3.getValue().equals("10"));
    }

    @Test
    public void bitWiseAnd4(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.bitWiseAnd(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    @Test
    public void bitWiseAnd5(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.bitWiseAnd(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    //-------------------------------------------------------------------------------
    //MULTIPLY
    @Test
    public void mult(){
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("1111000"));
    }

    @Test
    public void mult2(){
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("11110"));
    }

    @Test
    public void mult3(){
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("11110"));
    }

    @Test
    public void mult4(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    @Test
    public void mult5(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.multiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    //-------------------------------------------------------------------------------
    //BitwiseMULTIPLY
    @Test
    public void bitWiseMultiply(){
        Binary binary1=new Binary("1000");
        Binary binary2=new Binary("1111");
        Binary binary3=Binary.bitWiseMultiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("1111000"));
    }

    @Test
    public void bitWiseMultiply2(){
        Binary binary1=new Binary("1010");
        Binary binary2=new Binary("11");
        Binary binary3=Binary.bitWiseMultiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("11110"));
    }

    @Test
    public void bitWiseMultiply3(){
        Binary binary1=new Binary("11");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.bitWiseMultiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("11110"));
    }

    @Test
    public void bitWiseMultiply4(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("1010");
        Binary binary3=Binary.bitWiseMultiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }

    @Test
    public void bitWiseMultiply5(){
        Binary binary1=new Binary("0");
        Binary binary2=new Binary("0");
        Binary binary3=Binary.bitWiseMultiply(binary1,binary2);
        assertTrue(binary3.getValue().equals("0"));
    }
}
