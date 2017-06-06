
/**
 * Created by user on 06.06.2017.
 *
 * Увы с синтаксисом Date и дочерних классов не знаком,
 * поэтому попробую написать обычным способом
 *
 * 1.   Событие отрабатывается определённые дни недели, N  неделей
 * 2.   Отрабатывается каждые 8 часов(C 00:00)
 * 3.   Каждый месяц
 *
 */
public class Schedule {

//Будем исходить из среды и пятницы: 3 и 5, неделя 24.
    String setDayFAndWeeks(int daysF,int weeks)  {
    String date = null;

    int b=weeks;
    for (int a=0;a<weeks;a++) {

        date = daysF + "." + b + "." + 2017 + " hours 00:00";

        b++;
    }
    return date;
}
    String setDaySAndWeeks(int daysS,int weeks)  {
        String date = null;

        int b=weeks;
        for (int a=0;a<weeks;a++) {

            date = daysS + "." + b + "." + 2017 + " hours 00:00";

            b++;
        }
        return date;
    }
//Теперь сделаю событие на 8 часов, 7 месяца на 31 день
    void everyHours(int day,int numberOfDays){
        String data = null;
        int time = 0;
      for (int date=day;date<(day+numberOfDays+1);){
          if (time==24){
              time=0;
              data = date + "." + 7 + "." + 2017 + " hours "+time+":00";

              date++;
          }else {
        time=time+8;
          data = date + "." + 7 + "." + 2017 + " hours "+time+":00";
          }
          System.out.println(data);
      }

    }

    void everiMounf(int mounfs){
        String data;
        int c =mounfs;
        for (int i=0;i<(mounfs+1);i++){

            if (c==12){
                c=1;
                data = 1 + "." + c + "." + 2017 + " hours 00:00";
            }else {c++;
                data = 1 + "." + c + "." + 2017 + " hours 00:00";
            }

            System.out.println(data);
        }
    }


    void tikTak(String a){
        if (a=="Режим a"||a=="режим a"||a=="Режим А"||a=="режим A"){
            setDayFAndWeeks(2,7);
            setDaySAndWeeks(5,7);
        }else if (a=="Режим б"||a=="режим б"||a=="Режим Б"||a=="режим Б"){
            everyHours(7,8);
        }
    }
}

class ScheduleTestDrive{
    public static void main(String[] args)  {
        Schedule sh = new Schedule();
        sh.everyHours(7,5);
    }
}