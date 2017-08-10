package com.distributedMemeory.cache.HazelCast;

import com.hazelcast.config.Config;
import com.hazelcast.core.EntryEvent;
import com.hazelcast.core.EntryListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.MapEvent;
import com.hazelcast.core.ReplicatedMap;

public class ReplicatedEmergencyTNInfo {

    public static void main(String[] args) {
    	  Config cfg = new Config();
    	  //IF you want to configure user/pwd in program.
    	//  cfg.getGroupConfig().setName("dev").setPassword("dev-pass");    
        HazelcastInstance hz = Hazelcast.newHazelcastInstance(cfg);
        ReplicatedMap<String, String> map = hz.getReplicatedMap("emergency_tns");        
        map.addEntryListener(new MyEntryListener());
        System.out.println("EntryListener registered");
    }

    private static class MyEntryListener implements EntryListener<String, String> {

        @Override
        public void entryAdded(EntryEvent<String, String> event) {
            System.out.println("entryAdded: " + event.getMember());
            System.out.println("getSource: "+event.getSource());
        }

        @Override
        public void entryRemoved(EntryEvent<String, String> event) {
            System.out.println("entryRemoved: " + event.getMember());
        }

        @Override
        public void entryUpdated(EntryEvent<String, String> event) {
            System.out.println("entryUpdated: " + event);
        }

        @Override
        public void entryEvicted(EntryEvent<String, String> event) {
            System.out.println("entryEvicted: " + event);
        }

        @Override
        public void mapEvicted(MapEvent event) {
            System.out.println("mapEvicted:" + event);

        }

        @Override
        public void mapCleared(MapEvent event) {
            System.out.println("mapCleared: " + event);
        }
    }
}