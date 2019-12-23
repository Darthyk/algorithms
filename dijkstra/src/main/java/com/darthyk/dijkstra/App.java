package com.darthyk.dijkstra;

public class App {
    public static void main(String... args) {
        Network network = NetworkParser.getNetwork(args[0]);
        network = Network.calculateShortestPathsForNodes(network, NodeName.valueOf(args[1]));

        Node endNode = network.getNode(NodeName.valueOf(args[2]));
        System.out.println(endNode.getNodeName());
        Node previousNode = endNode.getShortestPreviousNode();
        while (previousNode != null) {
            System.out.println(previousNode.getNodeName());
            endNode = previousNode;
            previousNode = endNode.getShortestPreviousNode();
        }
    }
}
