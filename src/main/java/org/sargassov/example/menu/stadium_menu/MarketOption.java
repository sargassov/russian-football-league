package org.sargassov.example.menu.stadium_menu;





public class MarketOption implements StadiumMenuInterface{
    @Override
    public void start() {

    }
//
//    private static int sVal = 40;
//    private static Tournament rfpl;
//
//    @Override
//    public void getOption(Tournament rfpl) {
//
//        MarketOption.rfpl = rfpl;
//        System.out.print("\n\n\n\n" + Corrector.getS(sVal));
//        Corrector.wordUpperCase("marketing mode " + rfpl.myTeam.name);
//        System.out.println("\n\n\n");
//
//        if(rfpl.myTeam.markets.size() != 0){
//            System.out.println("Your club already has a market program:");
//            new AvalibleMarketTable().toPrint(rfpl);
//        }
//
//        new MarketTable().toPrint(rfpl);
//
//        int chooseTypeOfMarketing = Corrector.inputIntMethod(0, 4);
//
//        if(chooseTypeOfMarketing == 0) return;
//        long cost = chooseTimePeriod(chooseTypeOfMarketing);
//
//        int chooseTimePeriod = Corrector.inputIntMethod(0, 3);
//
//        if(chooseTimePeriod == 0);
//        else if(chooseTimePeriod == 2) cost *= 2;
//        else if(chooseTimePeriod == 3) cost *= 4;
//
//        System.out.print(Corrector.getS(sVal) + "You chase market program for " + cost +
//                "M EURO\n" + Corrector.getS(sVal) + "Do you want to continue?\n\n");
//
//        int continued = Corrector.inputIntMethod(0, 1);
//        if(continued == 0) return;
//        else{
//            if(!financeControll(cost)) return;
//            rfpl.myTeam.wealth -= cost;
//            rfpl.myTeam.marketExpenses -= cost;
//            makeMarket(chooseTypeOfMarketing, chooseTimePeriod);
//        }
//    }
//
//    private boolean financeControll(double cost) {
//        if(rfpl.myTeam.wealth >= cost) {
//            return true;
//        }
//        else {
//            System.out.println(Corrector.getS(sVal) + "Your club hasn't money for this transaction!");
//            return false;
//        }
//    }
//
//    private void makeMarket(int chooseTypeOfMarketing, int chooseTimePeriod) {
//
//        MarketType marketType;
//        if(chooseTypeOfMarketing == 1) marketType = MarketType.RADIO;
//        else if(chooseTypeOfMarketing == 2) marketType = MarketType.TV;
//        else if(chooseTypeOfMarketing == 3) marketType = MarketType.INTERNET;
//        else marketType = MarketType.BILLBOARD;
//
//        MarketPeriod marketPeriod;
//        if(chooseTimePeriod == 1) marketPeriod = MarketPeriod.WEEK;
//        else if(chooseTimePeriod == 2) marketPeriod = MarketPeriod.TWO_WEEKS;
//        else marketPeriod = MarketPeriod.MONTH;
//
//        Market market = new Market(marketType, marketPeriod);
//        rfpl.myTeam.markets.add(market);
//
//    }
//
//    private long chooseTimePeriod(int markType) {
//
//        long cost;
//        System.out.print(Corrector.getS(sVal) + "You chase a ");
//
//        if(markType == 1) {
//            System.out.print("RADIO company with cost 1M Euro\n\n");
//            cost = 1_000_000;
//        }
//        else if(markType == 2) {
//            System.out.print("TV company with cost 3.5M Euro\n\n");
//            cost = 3_500_000;
//        }
//        else if (markType == 3) {
//            System.out.print("INTERNET company with cost 2.2M Euro\n\n");
//            cost = 2_200_000;
//        }
//        else {
//            System.out.print("BILLBOARD company with cost 0.5M Euro\n\n");
//            cost = 500_000;
//        }
//
//        System.out.println(Corrector.getS(sVal) + "HOW LONG IT WILL BE?\n");
//        System.out.println(Corrector.getS(sVal) + "Market company to a week (press 1)\n" +
//                Corrector.getS(sVal) + "Market company for two weeks (press 2)\n" +
//                Corrector.getS(sVal) + "Market company to a month (press 3)" +
//                Corrector.getS(sVal) + "To Quit (press 0): ");
//
//        return cost;
//    }
}
