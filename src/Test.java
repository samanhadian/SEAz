class Test
{
    public static void main(String[] args)
    {
        testSum();
		testDivide();
		testSubtract();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
    private static void testDivide()
    {
        int a = 8;
        int b = 2;
        int expected = 4;
        BasicMath bm = new BasicMath();
        int result = bm.divide(a, b);
        if (result == expected)
        {
            System.out.println("divide: OK");
        }
        else
        {
            System.out.println("divide: Failed, expected = " + expected + ", result = " + result);
		}
	}
    private static void testSubtract()
    {
        int a = 6;
        int b = 5;
        int expected = 1;
        BasicMath bm = new BasicMath();
        int result = bm.subtract(a, b);
        if (result == expected)
        {
            System.out.println("subtract: OK");
        }
        else
        {
            System.out.println("subtract: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
