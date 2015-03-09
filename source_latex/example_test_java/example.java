public class CommandParserTest {

   public void testGetCommand1() {
        System.out.println("getCommand1");
        CommandParser instance=new CommandParser("join '#Medical'"); 
        String result = instance.getCommand();
        assertNull(result);
    } 

    public void testGetParameter() {
        System.out.println("getParameter");
        CommandParser instance=new CommandParser("/join '#Medical'");
        int index = 1;        
        String expResult = "#Medical";
        String result = instance.getParameter(index);
        assertEquals(expResult, result);
    }
}

