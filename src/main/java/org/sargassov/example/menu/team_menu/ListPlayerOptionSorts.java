package org.sargassov.example.menu.team_menu;



import java.util.ArrayList;

public class ListPlayerOptionSorts {
//    public static void sort(ArrayList<Player> playerList, int choise) {
//        int size;
//        for(int x = 0; x < playerList.size() - 1; x++){
//            for(int y = 0; y < playerList.size() - x - 1; y++){
//                String field1 = chooseStringField(playerList, y, choise);
//                String field2 = chooseStringField(playerList, y + 1, choise);
//                char[] first = field1.toCharArray();
//                char[] second = field2.toCharArray();
//                if(field1.length() < field2.length()){ size = field1.length(); }
//                else size = field2.length();
//                for(int z = 0; z < size; z++){
//                    if(first[z] > second[z]){
//                        Player temp = playerList.get(y);
//                        playerList.set(y, playerList.get(y + 1));
//                        playerList.set(y + 1, temp);
//                        break;
//                    }
//                    else if (first[z] < second[z]){
//                        break;
//                    }
//                }
//            }
//        }
//    }
//
//    public static void sort(ArrayList<Player> playerList, int choise, int difParametr) {
//        for(int x = 0; x < playerList.size() - 1; x++){
//            for(int y = 0; y < playerList.size() - x - 1; y++){
//                int first = chooseintField(playerList, y, choise);
//                int second = chooseintField(playerList, y + 1, choise);
//                if(choise == 3) { if(first <= second) continue; }
//                else { if(first >= second) continue; }
//                Player temp = playerList.get(y);
//                playerList.set(y, playerList.get(y + 1));
//                playerList.set(y + 1, temp);
//            }
//        }
//    }
//
//    public static void sort(ArrayList<Player> playerList, boolean difParametr){
//        for(int x = 0; x < playerList.size() - 1; x++){
//            for(int y = 0; y < playerList.size() - x - 1; y++){
//                if(! (playerList.get(y).isInjury) && playerList.get(y + 1).isInjury){
//                    Player temp = playerList.get(y);
//                    playerList.set(y, playerList.get(y + 1));
//                    playerList.set(y + 1, temp);
//                }
//            }
//        }
//
//    }
//
//    public static void sort(ArrayList<Player> playerList) {
//        for(int x = 0; x < playerList.size() - 1; x++){
//            for(int y = 0; y < playerList.size() - x - 1; y++){
//                if(playerList.get(y).strategyPlace == -100){
//                    Player temp = playerList.get(y);
//                    playerList.set(y, playerList.get(y + 1));
//                    playerList.set(y + 1, temp);
//                }
//                else if((playerList.get(y).strategyPlace > playerList.get(y + 1).strategyPlace) &&
//                        playerList.get(y).strategyPlace != -100 && playerList.get(y + 1).strategyPlace != -100){
//                    Player temp = playerList.get(y);
//                    playerList.set(y, playerList.get(y + 1));
//                    playerList.set(y + 1, temp);
//                }
//            }
//        }
//    }
//
//    public static void sort(ArrayList<Player> playerList, double difParametr) {
//        for(int x = 0; x < playerList.size() - 1; x++){
//            for(int y = 0; y < playerList.size() - x - 1; y++){
//                if(playerList.get(y).price < playerList.get(y + 1).price){
//                    Player temp = playerList.get(y);
//                    playerList.set(y, playerList.get(y + 1));
//                    playerList.set(y + 1, temp);
//                }
//            }
//        }
//    }
//
//    private static int chooseintField(ArrayList<Player> list, int place, int choise){
//        if(choise == 3) return list.get(place).number;
//        else if(choise == 5) return list.get(place).gkAble;
//        else if(choise == 6) return list.get(place).defAble;
//        else if(choise == 7) return list.get(place).midAble;
//        else if(choise == 8) return list.get(place).forwAble;
//        else if(choise == 9) return list.get(place).captainAble;
//        else if(choise == 11) return list.get(place).trainingAble;
//        else if(choise == 12) return list.get(place).yearBirth;
//        else if(choise == 14) return list.get(place).power;
//        else if(choise == 15) return list.get(place).tire;
//        else return list.get(place).timeBeforeTreat;
//    }
//
//    private static String chooseStringField(ArrayList<Player>list, int place, int choise){
//        if(choise == 1) return list.get(place).name;
//        else if(choise == 2) return list.get(place).natio;
//        else return Corrector.posInString(list.get(place).position);
//    }
}