package PokerDemo;

import java.util.*;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokers = new HashMap<Integer, String>();
        String[] colors = {"♦", "♠", "♥", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        ArrayList<String> pokerNumbers = new ArrayList<String>();

        for (String number : numbers) {
            for (String color : colors)
                pokerNumbers.add(color + number);
            }

        for (int i = 0; i < pokerNumbers.size(); i++) {
            pokers.put(i, pokerNumbers.get(i));
        }

        pokers.put(52, "sJoker");
        pokers.put(53, "lJoker");
        ArrayList<Integer> keys = new ArrayList<Integer>();
        for (int i = 0; i < 54; i++) {
            keys.add(i);
        }

        Collections.shuffle(keys);
        TreeSet<Integer> aPokers = new TreeSet<Integer>();
        TreeSet<Integer> bPokers = new TreeSet<Integer>();
        TreeSet<Integer> cPokers = new TreeSet<Integer>();
        TreeSet<Integer> backPokers = new TreeSet<Integer>();
        for (int i = 0; i < keys.size(); i++) {
            if (i >= 51) {
                backPokers.add(keys.get(i));
            }
            if (i % 3 == 0) aPokers.add(keys.get(i));
            else if (i % 3 == 1) bPokers.add(keys.get(i));
            else cPokers.add(keys.get(i));
        }

        lookPokers(aPokers,pokers);
        lookPokers(bPokers,pokers);
        lookPokers(cPokers,pokers);
        lookPokers(backPokers,pokers);
    }

    public static void lookPokers(TreeSet<Integer> memberPokers,HashMap<Integer, String> pokers){
        ArrayList<String> see=new ArrayList<String>();
        for(Integer i:memberPokers){
            see.add(pokers.get(i));
        }
        System.out.println(see);
    }
}
