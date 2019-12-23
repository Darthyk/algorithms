package com.darthyk.dijkstra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class NetworkParser {
    public static Network getNetwork(String filePath) {
        BufferedReader reader;
        String s = "S";
        String dash = "-";
        String space = " ";
        Network network = new Network();
        try {
            File file = new File(filePath);
            reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                String[] lineChars = line.split(space);
                Map<Integer, Integer> relations = new HashMap<Integer, Integer>();
                NodeName nodeName = null;
                for(int i = 0; i < lineChars.length; i++) {
                    if(lineChars[i].equals(s)) {
                        nodeName = NodeName.getNode(i);
                        continue;
                    }
                    if(lineChars[i].equals(dash)) {
                        continue;
                    }
                    Integer ribValue = Integer.valueOf(lineChars[i]);
                    relations.put(i, ribValue);
                }
                List<Rib> ribs = new ArrayList<Rib>();
                Set<Map.Entry<Integer, Integer>> entries = relations.entrySet();
                for (Map.Entry<Integer, Integer> entry : entries) {
                    ribs.add(new Rib(entry.getValue(), nodeName, NodeName.getNode(entry.getKey())));
                }
                Node node = new Node(ribs, nodeName, Integer.MAX_VALUE);
                network.addNode(node);
                line = reader.readLine();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return network;
    }
}
