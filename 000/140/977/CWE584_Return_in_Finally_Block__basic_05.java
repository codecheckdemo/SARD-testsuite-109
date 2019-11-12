/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE584_Return_in_Finally_Block__basic_05.java
Label Definition File: CWE584_Return_in_Finally_Block__basic.label.xml
Template File: point-flaw-05.tmpl.java
*/
/*
* @description
* CWE: 584 Return in Finally Block
* Sinks:
*    GoodSink: no return in finally block
*    BadSink : return in finally
* Flow Variant: 05 Control flow: if(privateTrue) and if(privateFalse)
*
* */





public class CWE584_Return_in_Finally_Block__basic_05 extends AbstractTestCase
{
    /* The two variables below are not defined as "final", but are never
     * assigned any other value, so a tool should be able to identify that
     * reads of these will always return their initialized values.
     */
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    public void bad() throws Throwable
    {
        if (privateTrue)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                if(true)
                {
                    return; /* FLAW: will always return and prevent finally from completing normally */
                }
                /* INCIDENTAL: 571 Always returns true */
                /* We need the "if(true)" above because the Java Language Spec requires that unreachable code generate a compiler error */
            }
        }
    }

    /* good1() changes privateTrue to privateFalse */
    private void good1() throws Throwable
    {
        if (privateFalse)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            IO.writeLine("Benign, fixed string");
        }
        else
        {

            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                /* FIX: cleanup code here and continue */
                IO.writeLine("In finally block, cleaning up");
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if (privateTrue)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch(IllegalArgumentException exceptIllegalArgument)
            {
                IO.writeLine("preventing incidental issues");
            }
            finally
            {
                /* FIX: cleanup code here and continue */
                IO.writeLine("In finally block, cleaning up");
            }
        }
    }

    public void good() throws Throwable
    {
        good1();
        good2();
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