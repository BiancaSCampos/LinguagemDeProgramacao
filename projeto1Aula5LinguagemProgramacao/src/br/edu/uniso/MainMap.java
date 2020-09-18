package br.edu.uniso;

import java.util.HashMap;

public class MainMap {

    public static void main (String args[]){
        HashMap map = new HashMap();
        map.put(265, "Bianca");
        map.put(985, "Lucas");
        map.put(523, "Luis");

        System.out.println(map.get(265));
        System.out.println(map.get(985));
        System.out.println(map.get(523));
    }
}
