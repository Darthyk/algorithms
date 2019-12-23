package com.darthyk.dijkstra;

public class App {
    public static void main(String... args) {
        Network network = NetworkParser.getNetwork();
        network = Network.calculateShortestPathsForNodes(network, NodeName.A);

        Node endNode = network.getNode(NodeName.I);
        System.out.println(endNode.getNodeName());
        Node previousNode = endNode.getShortestPreviousNode();
        while (previousNode != null) {
            System.out.println(previousNode.getNodeName());
            endNode = previousNode;
            previousNode = endNode.getShortestPreviousNode();
        }
    }
}
