/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE789_Uncontrolled_Mem_Alloc__getQueryString_Servlet_HashSet_53d.java
Label Definition File: CWE789_Uncontrolled_Mem_Alloc.int.label.xml
Template File: sources-sink-53d.tmpl.java
*/
/*
 * @description
 * CWE: 789 Uncontrolled Memory Allocation
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: HashSet
 *    BadSink : Create a HashSet using data as the initial size
 * Flow Variant: 53 Data flow: data passed as an argument from one method through two others to a fourth; all four functions are in different classes in the same package
 *
 * */




import javax.servlet.http.*;

import java.util.HashSet;

public class CWE789_Uncontrolled_Mem_Alloc__getQueryString_Servlet_HashSet_53d
{
    public void badSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
        HashSet intHashSet = new HashSet(data);

    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {

        /* POTENTIAL FLAW: Create a HashSet using data as the initial size.  data may be very large, creating memory issues */
        HashSet intHashSet = new HashSet(data);

    }
}
