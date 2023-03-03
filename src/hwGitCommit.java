import java.util.HashMap;
import java.util.Map;

public class hwGitCommit {

  enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER,
  }
  enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN,
  }
  public static Map<Month, Integer> buildMonthsMap() {
    Map<Month, Integer> months = new HashMap<>();

    months.put(Month.JANUARY, 31);
    months.put(Month.FEBRUARY, 28);
    months.put(Month.MARCH, 31);
    months.put(Month.APRIL, 30);
    months.put(Month.MAY, 31);
    months.put(Month.JUNE, 30);
    months.put(Month.JULY, 31);
    months.put(Month.AUGUST, 31);
    months.put(Month.SEPTEMBER, 30);
    months.put(Month.OCTOBER, 31);
    months.put(Month.NOVEMBER, 30);
    months.put(Month.DECEMBER, 31);

    return months;
  }
  public static Season findSeason(Month month) {

    Season season = switch (month) {
      case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
      // после return не нужен break
      case MARCH, APRIL, MAY -> Season.SPRING;
      case JUNE, JULY, AUGUST -> Season.SUMMER;
      case SEPTEMBER, OCTOBER, NOVEMBER -> Season.AUTUMN;
    };
    return season;
  }

}
