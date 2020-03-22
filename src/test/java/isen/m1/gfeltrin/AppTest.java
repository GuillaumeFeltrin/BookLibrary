package isen.m1.gfeltrin;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    /**
     * This test sets a title and check the following specs:
     * - the title cannot be null: "", null, "       ", " \t", "\ n"
     * - the title must be upper case
     * - the title cannot start or end with a space char
     * - Check the character used are in [A-Z-a-z!?]
     *
     */
    @Test
    public void testTitle(){
        //Book b = Library.getInstance().newBook("LORD OF THE RINGS");
        //assertTrue(b.getTitle().equals("LORD OF THE RINGS"));
    }

    /*@Test (expected = IllegalArgumentException.class)
    public void testIllegalTitle() throws IllegalArgumentException{
        try {
            Library.getInstance().newBook("LORD OF THE RINGS");
        }
        catch (IllegalArgumentException e){
            e.getStackTrace();
        }
    }*/

    @Before
    public void initBook(){
        //books = InMemoryBookDAO.getInstance();

    }

    @After
    public void resetBook(){

    }

    @Test
    public void testFind(){

    }

    @Test
    public void testDelete(){

    }

    @Test
    public void testUpdate(){

    }
}
