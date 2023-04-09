import org.example.StatisticaService;
import org.junit.jupiter.api.Test;

public class StatisticaServiceTest {
    @Test
    public void SumSaleMonthTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sumSales(sale);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
    }

    @Test
    public void MidSaleMonthTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.midSales(sale);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
    }

    @Test
    public void MaxSaleMonthTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesMonth(sale);
        long expected = 6;
    }

    @Test
    public void MinSaleMonthTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sale);
        long expected = 9;
    }

    @Test
    public void CalcMonthMinMidTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sale);
        long expected = 5;
    }

    @Test
    public void CalcMonthMaxMidTest() {
        StatisticaService service = new StatisticaService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesMonth(sale);
        long expected = 5;
    }
}