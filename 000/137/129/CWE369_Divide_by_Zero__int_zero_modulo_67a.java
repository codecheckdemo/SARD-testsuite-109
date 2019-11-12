/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_zero_modulo_67a.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-67a.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: zero Set data to a hardcoded value of zero
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: modulo
 *    GoodSink: Check for zero before modulo
 *    BadSink : Modulo by a value that may be zero
 * Flow Variant: 67 Data flow: data passed in a class from one method to another in different source files in the same package
 *
 * */






public class CWE369_Divide_by_Zero__int_zero_modulo_67a extends AbstractTestCase
{
    static class Container
    {
        public int containerOne;
    }

    public void bad() throws Throwable
    {
        int data;

        data = 0; /* POTENTIAL FLAW: data is set to zero */

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE369_Divide_by_Zero__int_zero_modulo_67b()).badSink(dataContainer  );
    }

    public void good() throws Throwable
    {
        goodG2B();
        goodB2G();
    }

    /* goodG2B() - use goodsource and badsink */
    private void goodG2B() throws Throwable
    {
        int data;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        data = 2;

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE369_Divide_by_Zero__int_zero_modulo_67b()).goodG2BSink(dataContainer  );
    }

    /* goodB2G() - use badsource and goodsink */
    private void goodB2G() throws Throwable
    {
        int data;

        data = 0; /* POTENTIAL FLAW: data is set to zero */

        Container dataContainer = new Container();
        dataContainer.containerOne = data;
        (new CWE369_Divide_by_Zero__int_zero_modulo_67b()).goodB2GSink(dataContainer  );
    }

    /* Below is the main(). It is only used when building this testcase on
     * its own for testing or for building a binary to use in testing binary
     * analysis tools. It is not used when compiling all the testcases as one
     * application, which is how source code analysis tools are tested.
     */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }

}
