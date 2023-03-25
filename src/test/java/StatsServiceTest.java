import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.services.StatsService;

public class StatsServiceTest {
    @Test
    public void minMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expectedMinMonth = 7;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);


    }

    @Test
    public void maxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 6;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expectedSum = 141;
        int actualSum = service.sum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void averageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expectedAverageSales = 14;
        int actualAverageSales = service.average(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    public void minAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expectedMinAverageSales = 3;
        int actualMinAverageSales = service.minAverage(sales);

        Assertions.assertEquals(expectedMinAverageSales, actualMinAverageSales);
    }

    @Test
    public void maxAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 7, 14, 14, 18};
        int expectedMaxAverageSales = 5;
        int actualMaxAverageSales = service.maxAverage(sales);

        Assertions.assertEquals(expectedMaxAverageSales, actualMaxAverageSales);
    }
}
