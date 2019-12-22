package com.darthyk.dijkstra;

import java.util.List;

public class Node {
    private List<Rib> ribs;

    private NodeName nodeName;

    private Integer nodePath;

    public Node getShortestPreviousNode() {
        return shortestPreviousNode;
    }

    public void setShortestPreviousNode(Node shortestPreviousNode) {
        this.shortestPreviousNode = shortestPreviousNode;
    }

    private Node shortestPreviousNode;

    public Node(List<Rib> ribs, NodeName nodeName, Integer nodePath) {
        setRibs(ribs);
        setNodeName(nodeName);
        setNodePath(nodePath);
    }

    public Integer getNodePath() {
        return nodePath;
    }

    public void setNodePath(Integer nodePath) {
        this.nodePath = nodePath;
    }

    public void setNodeName(NodeName nodeName) {
        this.nodeName = nodeName;
    }

    public NodeName getNodeName() {
        return nodeName;
    }

    public void setRibs(List<Rib> ribs) {
        this.ribs = ribs;
    }

    public List<Rib> getRibs() {
        return ribs;
    }
}
