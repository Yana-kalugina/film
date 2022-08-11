import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    @Test
    public void findLastMin() {
        AfishaManager manager = new AfishaManager(1);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = { "film5" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastConditionalMax() {
        AfishaManager manager = new AfishaManager(5);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = { "film5", "film4", "film3", "film2", "film1" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOverConditionalMax() {
        AfishaManager manager = new AfishaManager(15);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = { "film5", "film4", "film3", "film2", "film1" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastInTheMiddle() {
        AfishaManager manager = new AfishaManager(3);
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = { "film5", "film4", "film3" };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllMin() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("film1");

        String[] expected = { "film1" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllConditionalMax() {
        AfishaManager manager = new AfishaManager();
        manager.addFilm("film1");
        manager.addFilm("film2");
        manager.addFilm("film3");
        manager.addFilm("film4");
        manager.addFilm("film5");

        String[] expected = { "film1", "film2", "film3", "film4", "film5" };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}
