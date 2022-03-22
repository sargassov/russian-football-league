package org.sargassov.example.new_game_creator;


import org.sargassov.example.models.League;

public class OpenSource {

    private League league;
//    private ExecutorService service;
//    private Phaser phaser;

//    private static final String playersFile = "FootballManger\\src\\main\\java\\FootballManager\\Sources\\players.txt";
//    private static final String PLAYERS_FILE_NOT_FOUND = "FILE WITH PLAYERS NOT FOUND";
//    private static final String clubFile = "FootballManger\\src\\main\\java\\FootballManager\\Sources\\clubs.txt";
//    private static final String CLUBS_FILE_NOT_FOUND = "FILE WITH TEAMS NOT FOUND";
//    private static final String youngersFile = "FootballManger\\src\\main\\java\\FootballManager\\Sources\\youthacademy.txt";
//    private static final String YOUNGERS_FILE_NOT_FOUND ="FILE WITH YOUNGERS NOT FOUND";
//    private static final String sponsorsFile = "FootballManger\\src\\main\\java\\FootballManager\\Sources\\sponsors.txt";
//    private static final String SPONSORS_FILE_NOT_FOUND ="FILE WITH SPONSORS NOT FOUND";
//    private static final String banksFile = "FootballManger\\src\\main\\java\\FootballManager\\Sources\\banks.txt";
//    private static final String BANKS_FILE_NOT_FOUND ="FILE WITH BANKS NOT FOUND";
//    private static final int numberOfThreads = 3;
//    private static final int phasesWhenBegin = 2;

    public void unpack(){


        new SponsorsUnpack().readAndUnpack();
        new TeamUnpack().readAndUnpack();
        new PlayerUnpack().readAndUnpack();

//        service.submit(new ReaderSponsorsThread(rfpl, phaser));
//        phaser.arriveAndAwaitAdvance();
//
//        service.submit(new ReaderTeamsThread(rfpl, phaser));
//        phaser.arriveAndAwaitAdvance();
//
//        service.submit(new ReaderPlayersThread(rfpl, phaser));
//        phaser.arriveAndAwaitAdvance();
//
//        service.submit(new ReaderYoungersThread(rfpl, phaser));
//        phaser.arriveAndAwaitAdvance();
//
//        service.submit(new ReaderBanksThread(rfpl, phaser));
//        phaser.arriveAndAwaitAdvance();
//
//        service.shutdown();
    }



//
//    static class ReaderBanksThread extends Thread{
//
//        private Tournament rfpl;
//        private Phaser phaser;
//
//        public ReaderBanksThread(Tournament rfpl, Phaser phaser){
//            this.phaser = phaser;
//            this.rfpl = rfpl;
//            rfpl.banks = new ArrayList<>();
//
//            Corrector.notNullChecking(rfpl);
//            Corrector.notNullChecking(phaser);
//        }
//
//        @Override
//        public void run() {
//            Path path = Paths.get(banksFile);
//
//            if(Files.exists(path)){
//                try{
//                    Bank.setRfpl(rfpl);
//                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    for(String line : lines) rfpl.banks.add(new Bank(line));
//
//                } catch (IOException e) {
//                    System.out.println(BANKS_FILE_NOT_FOUND);
//                    e.printStackTrace();
//                } finally {
//                    phaser.arriveAndAwaitAdvance();
//                }
//            }
//        }
//    }
//
//    static class ReaderSponsorsThread extends Thread{
//
//        private Tournament rfpl;
//        private Phaser phaser;
//
//
//        public ReaderSponsorsThread(Tournament rfpl, Phaser phaser){
//            this.phaser = phaser;
//            this.rfpl = rfpl;
//            rfpl.sponsorList = new ArrayList<>();
//
//            Corrector.notNullChecking(rfpl);
//            Corrector.notNullChecking(phaser);
//        }
//
//        @Override
//        public void run() {
//            Path path = Paths.get(sponsorsFile);
//
//            if(Files.exists(path)){
//                try{
//                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    for(String line : lines){ rfpl.sponsorList.add(new Sponsor(line)); }
//
//                } catch (IOException e) {
//                    System.out.println(SPONSORS_FILE_NOT_FOUND);
//                    e.printStackTrace();
//                } finally {
//                    phaser.arriveAndAwaitAdvance();
//                }
//            }
//            else {
//                try {
//                    throw new Exception();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//
//    static class ReaderYoungersThread extends Thread{
//        private Tournament rfpl;
//        private Phaser phaser;
//
//        public ReaderYoungersThread(Tournament rfpl, Phaser phaser){
//            this.rfpl = rfpl;
//            this.phaser = phaser;
//
//            Corrector.notNullChecking(rfpl);
//            Corrector.notNullChecking(phaser);
//        }
//
//        @Override
//        public void run() {
//            rfpl.youthPool = new ArrayList<>();
//
//            Path path = Paths.get(youngersFile);
//
//            if(Files.exists(path)){
//                try{
//                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    System.out.println("LINE============="+lines.size());
//                    for(String line : lines){
//                        rfpl.youthPool.add(new Player(line, 0));
//                    }
//                    phaser.arriveAndAwaitAdvance();
//                    System.out.println("LINE============="+lines.size());
//                } catch (IOException e) {
//                    System.out.println(YOUNGERS_FILE_NOT_FOUND);
//                    e.printStackTrace();
//                } finally {
//
//                }
//            }
//        }
//    }
//
//    static class ReaderTeamsThread extends Thread{
//        private Phaser phaser;
//        private Tournament rfpl;
//
//        public ReaderTeamsThread(Tournament rfpl, Phaser phaser){
//            this.phaser = phaser;
//            this.rfpl = rfpl;
//
//            Corrector.notNullChecking(rfpl);
//            Corrector.notNullChecking(phaser);
//        }
//
//        @Override
//        public void run() {
//            Path path = Paths.get(clubFile);
//
//            if(Files.exists(path)){
//                try{
//                    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    int x = 0;
//                    for(String line : lines){
//                        rfpl.teams[x] = new Team(line, rfpl);
//                        System.out.println(x + "." + rfpl.teams[x].name);
//                        ++x;
//                    }
//
//                    Arrays.sort(rfpl.teams, new Comparator<Team>() {
//                        @Override
//                        public int compare(Team o1, Team o2) {
//                            return o1.name.compareTo(o2.name);
//                        }
//                    });
//
//                } catch (IOException e) {
//                    System.out.println(CLUBS_FILE_NOT_FOUND);
//                    e.printStackTrace();
//                } finally {
//                    phaser.arriveAndAwaitAdvance();
//                }
//            }
//        }
//    }
//
//    static class ReaderPlayersThread extends Thread{
//        private Tournament rfpl;
//        private Phaser phaser;
//
//        public ReaderPlayersThread(Tournament rfpl, Phaser phaser){
//            this.rfpl = rfpl;
//            this.phaser = phaser;
//
//            Corrector.notNullChecking(rfpl);
//            Corrector.notNullChecking(phaser);
//        }
//
//        @Override
//        public void run() {
//            Path filePath = Paths.get(playersFile);
//            if (Files.exists(filePath)) {
//                try {
//                    List<String> lines = Files.readAllLines(filePath, StandardCharsets.UTF_8);
//                    for(String line : lines){
//                        Player player = new Player(line);
//                        for(Team t : rfpl.teams){
//                            if(t.name.equals(player.team.name)){
//                                t.playerList.add(player);
//                                break;
//                            }
//                        }
//                    }
//
//                    for(Team t : rfpl.teams){
//                        t.playerList.sort(Comparator.comparing(o -> o.name));
//                    }
//
//                } catch (IOException e) {
//                    System.out.println(PLAYERS_FILE_NOT_FOUND);
//                    e.printStackTrace();
//                } finally {
//                    phaser.arriveAndAwaitAdvance();
//                }
//            }
//        }
//    }
}
