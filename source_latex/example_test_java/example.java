public class CommandParserTest {
 
   public void testGetCommand1() {
        System.out.println("getCommand1");
        CommandParser instance=new CommandParser("join '#Medical'"); 
        String result = instance.getCommand();
        assertNull(result);
    } 

    public void testGetParameter2() {
        System.out.println("getParameter2");
        CommandParser instance=new CommandParser("/join '#Medical'");
        int index = 2;        
        String expResult = null;
        String result = instance.getParameter(index);
        assertEquals(expResult, result);
    }
}

