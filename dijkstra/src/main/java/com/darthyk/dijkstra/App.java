package com.darthyk.dijkstra;

public class App {
    public static void main(String... args) {
        Network network = NetworkParser.getNetwork();
        network = Network.calculateShortestPathsForNodes(network, NodeName.A);

        Node endNode = network.getNode(NodeName.I);
        System.out.println(endNode.getNodeName());
        Node previuosNode = endNode.getShortestPreviousNode();
        while (previuosNode != null) {
            System.out.println(previuosNode.getNodeName());
            endNode = previuosNode;
            previuosNode = endNode.getShortestPreviousNode();
        }
    }
}
