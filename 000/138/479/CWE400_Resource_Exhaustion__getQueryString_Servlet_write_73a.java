/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE400_Resource_Exhaustion__getQueryString_Servlet_write_73a.java
Label Definition File: CWE400_Resource_Exhaustion.label.xml
Template File: sources-sinks-73a.tmpl.java
*/
/*
 * @description
 * CWE: 400 Resource Exhaustion
 * BadSource: getQueryString_Servlet Parse id param out of the URL query string (without using getParameter())
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: write
 *    GoodSink: Write to a file count number of times, but first validate count
 *    BadSink : Write to a file count number of times
 * Flow Variant: 73 Data flow: data passed in a LinkedList from one method to another in different source files in the same package
 *
 * */



import java.util.LinkedList;

import javax.servlet.http.*;


import java.util.StringTokenizer;
import java.util.logging.Level;

public class CWE400_Resource_Exhaustion__getQueryString_Servlet_write_73a extends AbstractTestCaseServlet
{
    public void bad(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count;

        count = Integer.MIN_VALUE; /* initialize count in case id is not in query string */

        /* POTENTIAL FLAW: Parse id param out of the URL querystring (without using getParam) */
        {
            StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");

            while (tokenizer.hasMoreTokens())
            {
                String token = tokenizer.nextToken(); /* a token will be like "id=33" */
                if(token.startsWith("id=")) /* check if we have the "id" parameter" */
                {
                    try
                    {
                        count = Integer.parseInt(token.substring(3)); /* set count to the int 33 */
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                    }
                    break; /* exit while loop */
                }
            }
        }

        LinkedList<Integer> countLinkedList = new LinkedList<Integer>();
        countLinkedList.add(0, count);
        countLinkedList.add(1, count);
        countLinkedList.add(2, count);
        (new CWE400_Resource_Exhaustion__getQueryString_Servlet_write_73b()).badSink(countLinkedList , request, response );
    }

    public void good(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        goodG2B(request, response);
        goodB2G(request, response);
    }

    /* goodG2B() - use GoodSource and BadSink */
    private void goodG2B(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count;

        /* FIX: Use a hardcoded number that won't cause underflow, overflow, divide by zero, or loss-of-precision issues */
        count = 2;

        LinkedList<Integer> countLinkedList = new LinkedList<Integer>();
        countLinkedList.add(0, count);
        countLinkedList.add(1, count);
        countLinkedList.add(2, count);
        (new CWE400_Resource_Exhaustion__getQueryString_Servlet_write_73b()).goodG2BSink(countLinkedList , request, response );
    }

    /* goodB2G() - use BadSource and GoodSink */
    private void goodB2G(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int count;

        count = Integer.MIN_VALUE; /* initialize count in case id is not in query string */

        /* POTENTIAL FLAW: Parse id param out of the URL querystring (without using getParam) */
        {
            StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");

            while (tokenizer.hasMoreTokens())
            {
                String token = tokenizer.nextToken(); /* a token will be like "id=33" */
                if(token.startsWith("id=")) /* check if we have the "id" parameter" */
                {
                    try
                    {
                        count = Integer.parseInt(token.substring(3)); /* set count to the int 33 */
                    }
                    catch(NumberFormatException exceptNumberFormat)
                    {
                        IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                    }
                    break; /* exit while loop */
                }
            }
        }

        LinkedList<Integer> countLinkedList = new LinkedList<Integer>();
        countLinkedList.add(0, count);
        countLinkedList.add(1, count);
        countLinkedList.add(2, count);
        (new CWE400_Resource_Exhaustion__getQueryString_Servlet_write_73b()).goodB2GSink(countLinkedList , request, response );
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
