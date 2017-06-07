import java.util.Calendar;

import java.util.GregorianCalendar;

/**
 * Created by user on 07.06.2017.
 *
 * 1. Объект класса должен содержать в себе дату для абстрактного метода.
 * 2. Рассписание нескольких типов: 2 дня в неделю  допустим среда и пятница
 * 3. Каждый день каждые 8 часов
 * 4. каждый месяц
 * 5. заданное время, разовое выполнение
 * 6. Написать класс, а так-же функцию вычисляющую следующую дату события.
 *
 *
 *
 */
public class test {

 private Calendar calendar = new GregorianCalendar();

   public Calendar setCalendar(){
        return calendar;
    }

    //Допуситм пусть будет среда и пятница
    Calendar event2DaysOnWeek(){
        Calendar c1;

        while (calendar.get(Calendar.DAY_OF_WEEK)<4||calendar.get(Calendar.DAY_OF_WEEK)>6){
            calendar.add(Calendar.DAY_OF_MONTH,1);
        }


        while (calendar.get(Calendar.DAY_OF_WEEK)>4&&calendar.get(Calendar.DAY_OF_WEEK)<6){
            calendar.add(Calendar.DAY_OF_MONTH,1);
        }
        c1=calendar;
        return c1;
        }
    //Допустим пусть будет условие на 00:00, 8:00 и 16:00
    Calendar eventEvery8Hours(){
        Calendar c1;

        if (calendar.get(Calendar.HOUR_OF_DAY)<8){
            calendar.set(Calendar.HOUR_OF_DAY,8);
            calendar.set(Calendar.MINUTE,00);
            calendar.set(Calendar.SECOND,00);
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        }else if (calendar.get(Calendar.HOUR)>8&&calendar.get(Calendar.HOUR)<16){
            calendar.set(Calendar.HOUR_OF_DAY,16);
            calendar.set(Calendar.MINUTE,00);
            calendar.set(Calendar.SECOND,00);
            System.out.println(calendar.getTime());
        }else if (calendar.get(Calendar.HOUR_OF_DAY)>16&&calendar.get(Calendar.HOUR_OF_DAY)<23){
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,00);
            calendar.set(Calendar.SECOND,00);
            System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        }

        c1=calendar;
        return c1;
    }
    //Допустим пусть будет условие на 01.Месяц.2017 00:00
    Calendar eventEveryMonf(){
        Calendar c1;
        for (int i =0;i<7;i++){
            if (calendar.get(Calendar.DAY_OF_MONTH)>1){
            calendar.add(Calendar.MONTH,1);
            calendar.set(Calendar.DAY_OF_MONTH,1);
            calendar.set(Calendar.HOUR_OF_DAY,0);
            calendar.set(Calendar.MINUTE,00);
            calendar.set(Calendar.SECOND,00);
            }
        }



        c1=calendar;
        return c1;
    }

    //Допустим пусть будет условие на 10.Месяц.2017 17:58
    Calendar eventOneTime(){
        Calendar c1;
        System.out.println(calendar.getTime());
        calendar.set(Calendar.DAY_OF_MONTH,10);
        calendar.set(Calendar.HOUR_OF_DAY,17);
        calendar.set(Calendar.MINUTE,58);
        System.out.println(calendar.getTime());
        c1=calendar;
        return c1;
    }

    void eventUseAllEvents(){
        event2DaysOnWeek();
        eventEvery8Hours();
        eventEveryMonf();
        eventOneTime();
    }



    }





abstract class testTestDrive{
    public static void main(String[] args) {
        test test = new test();
        test.setCalendar();
    }



}
