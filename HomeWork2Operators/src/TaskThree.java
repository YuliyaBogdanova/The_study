//Имеется 645 000 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//А) минут + секунд,
//В) часов + минут + секунд,
//С) дней + часов + минут + секунд,
//D) недель + дней + часов + минут + секунд

public class TaskThree {
    public static void main(String[] args) {

        int a = 645000;
        int sec = a%60; // остаток по секундам
        int allMin = (a - sec)/60; //целых минут в а
        int min = allMin%60; //остаток по минутам
        int allHour = (allMin - min)/60; //целых часов в а
        int hour = allHour%24; //остаток по часам
        int allDay = (allHour - hour)/24; //целых дней в а
        int day = allDay%7; //остаток по дням
        int allWeek = (allDay - day)/7; //недель в а

        System.out.println("В " +a+ " секунд " +allMin+ " минут и " +sec+" секунд");
        System.out.println("В " +a+ " секунд " +allHour+ " часов " +min+ " минут и " +sec+" секунд");
        System.out.println("В " +a+ " секунд " +allDay+ " дней " +hour+ " часов " +min+ " минут и " +sec+" секунд");
        System.out.println("В " +a+ " секунд " +allWeek+ " недель " +day+ " дней " +hour+ " часов " +min+ " минут и " +sec+" секунд");
    }
}
