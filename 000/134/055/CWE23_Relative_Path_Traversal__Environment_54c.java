/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE23_Relative_Path_Traversal__Environment_54c.java
Label Definition File: CWE23_Relative_Path_Traversal.label.xml
Template File: sources-sink-54c.tmpl.java
*/
/*
 * @description
 * CWE: 23 Relative Path Traversal
 * BadSource: Environment Read data from an environment variable
 * GoodSource: A hardcoded string
 * Sinks: readFile
 *    BadSink : no validation
 * Flow Variant: 54 Data flow: data passed as an argument from one method through three others to a fifth; all five functions are in different classes in the same package
 *
 * */





import java.io.*;


public class CWE23_Relative_Path_Traversal__Environment_54c
{
    public void badSink(String data ) throws Throwable
    {
        (new CWE23_Relative_Path_Traversal__Environment_54d()).badSink(data );
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(String data ) throws Throwable
    {
        (new CWE23_Relative_Path_Traversal__Environment_54d()).goodG2BSink(data );
    }
}
