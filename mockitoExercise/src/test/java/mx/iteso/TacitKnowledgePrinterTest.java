package mx.iteso;


import org.junit.Before;

import org.junit.Test;


import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import static mx.iteso.TacitKnowledgePrinter.*;



public class TacitKnowledgePrinterTest
{



    //Test printNumbers with a limit of 10

    //Verify calculate being called 10 times

    //Verify expected result


    //Test printNumbers with a limit of 0

    //Verify Exception


    //What else can we test?

    //What should we verify?



    private Printer printer;

    private TacitKnowledgePrinter tacitPrinter;

    private String s;

    private int limit = 0;



    @Before

    public void setUp()
    {

        printer = mock(Printer.class);

        tacitPrinter = new TacitKnowledgePrinter(printer);

    }



    @Test

    public void verifyTenTimes()
    {

        tacitPrinter.printNumbers(10);

        verify(printer, times(10)).print(anyString());

        AssertEquals("Knowledge", tacitPrinter.calculate(10));

    }




    @Test
            (expected = RuntimeException.class)

    public void throwExceptionLimitZero() throws RuntimeException
    {

        tacitPrinter.printNumbers(0);

    }



    @Test

    public void calculateLimitFifteen()
    {

        AssertEquals("12Tacit4KnowledgeTacit78TacitKnowledge11Tacit1314TacitKnowledge", tacitPrinter.printNumbers(15));

    }



}
