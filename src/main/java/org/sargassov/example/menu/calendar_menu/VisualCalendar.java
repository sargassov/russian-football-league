package org.sargassov.example.menu.calendar_menu;




public class VisualCalendar implements CalendarMenuInterface {
    @Override
    public void start() {

    }
//
//    @Override
//    public void getOption(Tournament rfpl) {
//        System.out.print(Corrector.getS(40));
//        Corrector.wordUpperCase("visual calendar menu\n\n");
//        VisualCalendarTable.startMonthForVisualCalendar = 7;
//
//        while (true){
//            int size = rfpl.calendar.get(VisualCalendarTable.startMonthForVisualCalendar).size();
//            if(rfpl.calendar.get(VisualCalendarTable.startMonthForVisualCalendar - 7).get(size - 1).isPassed)
//                VisualCalendarTable.startMonthForVisualCalendar++;
//            else break;
//        }
//
//        while(true){
//            new VisualCalendarTable().toPrint(rfpl);
//            System.out.println("\n\n\"0\" - To quit\n\"1\" - To look a prevoius month\n\"2\" - To look a next month\n" +
//                    "\"3\" - To look an event on current date: ");
//            int choise = Corrector.inputIntMethod(0, 3);
//
//            if(choise == 0) break;
//            else if(choise == 1) {
//                VisualCalendarTable.startMonthForVisualCalendar--;
//                if(VisualCalendarTable.startMonthForVisualCalendar < 0) VisualCalendarTable.startMonthForVisualCalendar = 11;
//                if(VisualCalendarTable.startMonthForVisualCalendar == 6) VisualCalendarTable.startMonthForVisualCalendar = 5;
//            }
//            else if(choise == 2){
//                VisualCalendarTable.startMonthForVisualCalendar++;
//                if(VisualCalendarTable.startMonthForVisualCalendar == 6) VisualCalendarTable.startMonthForVisualCalendar = 7;
//                if(VisualCalendarTable.startMonthForVisualCalendar > 11) VisualCalendarTable.startMonthForVisualCalendar = 0;
//            }
//            else lookEvent(rfpl);
//        }
//    }
//
//
//    private void lookEvent(Tournament rfpl){
//        System.out.println("Enter a number of day in this month: ");
//        int highBorderValueOfDays = VisualCalendarTable.startMonthForVisualCalendar - 7;
//        if(highBorderValueOfDays == -7) highBorderValueOfDays += 12;
//
//
//        String curMonth = VisualCalendarTable.months[VisualCalendarTable.startMonthForVisualCalendar];
//        int choise = Corrector.inputIntMethod(0, rfpl.calendar.get(highBorderValueOfDays).size());
//        if(choise == 0) return;
//        Day day = rfpl.calendar.get(highBorderValueOfDays).get(choise - 1);
//        System.out.println(day.date.get(Calendar.DAY_OF_MONTH) + " of " + curMonth);
//        if(day instanceof DayMatch){
//            System.out.println("There will be a match this day " + ((DayMatch) day).home.name + " "
//            + ((DayMatch) day).away.name + " at stadium " + ((DayMatch) day).stadium.getTitle());
//        }
//        else if(day instanceof DayTrain){
//            System.out.println("There will be a train this day ");
//        }
//        else System.out.println("There will be a weekend ");
//    }
}
