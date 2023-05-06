import org.example.StatisticaService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticaServiceTest {
    @Test
    public void SumSaleMonthTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sale);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        assertEquals(expected, actual);
            }

    @Test
    public void MidSaleMonthTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.midSales(sale);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        assertEquals(expected, actual);
    }

    @Test
    public void MaxSaleCountTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesCount(sale);
        long expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void MinSaleCountTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesCount(sale);
        long expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void minMidCountSalesTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minMidCountSales(sale);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void maxMidCountSalesTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxMidCountSales(sale);
        long expected = 5;
        assertEquals(expected, actual);
    }
}