package com.darthyk.dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<Node> nodes;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public void setNode(Node newNode) {
        for(Node node : nodes) {
            if (node.getNodeName().equals(newNode.getNodeName())) {
                nodes.set(nodes.indexOf(node),newNode);
            }
        }
    }

    public Node getNode(NodeName nodeName) {
        for(Node node : nodes) {
            if (node.getNodeName().equals(nodeName)) {
                return node;
            }
        }
        return null;
    }

    public void addNode(Node node) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<Node>();
        }
        this.nodes.add(node);
    }

    public static Network calculateShortestPathsForNodes(Network network, NodeName startNodeName) {
        Node startNode = network.getNode(startNodeName);
        startNode.setNodePath(0);
        List<NodeName> visitedNodes = new ArrayList<NodeName>();
        visitedNodes.add(startNode.getNodeName());
        for(Node node : network.getNodes()) {
            if(node.getNodeName().equals(startNode.getNodeName()) || !node.getNodePath().equals(Integer.MAX_VALUE)) {
                continue;
            }
            List<Rib> ribs = node.getRibs();
            for(Rib rib : ribs) {
                Node relatedNode = network.getNode(rib.getEndNode());
                Integer fullNodePath = relatedNode.getNodePath() + rib.getWeight();
                if(visitedNodes.contains(relatedNode.getNodeName()) && node.getNodePath() > fullNodePath) {
                    node.setNodePath(fullNodePath);
                    network.setNode(node);
                    node.setShortestPreviousNode(relatedNode);
                }
            }
            visitedNodes.add(node.getNodeName());
        }
        return network;
    }
}
