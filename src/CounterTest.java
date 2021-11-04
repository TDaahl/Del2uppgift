import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CounterTest {

    @Test
    public void CharacterCalcTest(){

        //Arrange
        String Words = "tre";

        Counter counter = new Counter();
        counter.cAmount(Words.length());

        //Act
        int actual = counter.getChars();

        //Assert
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void isStopWordTest(){
        //Arrange
        Counter counter = new Counter();
        String Words = "stop";
        counter.isStopWord(Words);

        Assertions.assertTrue(counter.isStopWord(Words));

    }
    @Test
    public void getLinesTest(){
        //Arrange
        Counter counter = new Counter();
        counter.lAmount();

        //Act
        int actual = counter.getLines();

        //Assert
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void isStopWordTest2(){
        //Arrange
        Counter counter = new Counter();
        String Words = "one stop two";
        counter.isStopWord(Words);

        Assertions.assertTrue(counter.isStopWord(Words));

    }

}
