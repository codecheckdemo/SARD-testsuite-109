/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE190_Integer_Overflow__int_listen_tcp_multiply_54b.java
Label Definition File: CWE190_Integer_Overflow__int.label.xml
Template File: sources-sinks-54b.tmpl.java
*/
/*
 * @description
 * CWE: 190 Integer Overflow
 * BadSource: listen_tcp Read data using a listening tcp connection
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: multiply
 *    GoodSink: Ensure there will not be an overflow before multiplying data by 2
 *    BadSink : If data is positive, multiply by 2, which can cause an overflow
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */






public class CWE190_Integer_Overflow__int_listen_tcp_multiply_54b
{
    public void badSink(int data ) throws Throwable
    {
        (new CWE190_Integer_Overflow__int_listen_tcp_multiply_54c()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data ) throws Throwable
    {
        (new CWE190_Integer_Overflow__int_listen_tcp_multiply_54c()).goodG2BSink(data );
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data ) throws Throwable
    {
        (new CWE190_Integer_Overflow__int_listen_tcp_multiply_54c()).goodB2GSink(data );
    }
}
