/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE369_Divide_by_Zero__int_Property_divide_54c.java
Label Definition File: CWE369_Divide_by_Zero__int.label.xml
Template File: sources-sinks-54c.tmpl.java
*/
/*
 * @description
 * CWE: 369 Divide by zero
 * BadSource: Property Read data from a system property
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: divide
 *    GoodSink: Check for zero before dividing
 *    BadSink : Dividing by a value that may be zero
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */






public class CWE369_Divide_by_Zero__int_Property_divide_54c
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_Property_divide_54d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_Property_divide_54d()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data ) throws Throwable
    {
        (new CWE369_Divide_by_Zero__int_Property_divide_54d()).goodB2GSink(data );
    }
}
