package de._Coho04_.GameRandomizer;

import com.github.theholywaffle.teamspeak3.TS3Api;
import com.github.theholywaffle.teamspeak3.TS3Config;
import com.github.theholywaffle.teamspeak3.TS3Query;

import java.util.*;

public class Main {

    public static final TS3Config config = new TS3Config();
    public static final TS3Query query = new TS3Query(config);
    public static final TS3Api api = query.getApi();
    public static final ArrayList<String> words = new ArrayList<>();

    public static void main(String[] args) {
        config.setHost("89.163.143.186");

        query.connect();

        api.login("serveradmin", "+DbxnR0K");
        api.selectVirtualServerByPort(9987);
        api.setNickname("Ban-Hammer");
        System.out.println("BotOnline");

        Gui.Gui();
    }


}
