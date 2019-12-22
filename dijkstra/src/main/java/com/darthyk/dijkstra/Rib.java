package com.darthyk.dijkstra;

public class Rib {
    private Integer weight;

    private NodeName startNode;

    private NodeName endNode;

    public Rib(final Integer weight, final NodeName startNode, final NodeName endNode) {
        setWeight(weight);
        setStartNode(startNode);
        setEndNode(endNode);
    }

    public void setEndNode(NodeName endNode) {
        this.endNode = endNode;
    }

    public NodeName getEndNode() {
        return endNode;
    }

    public void setStartNode(NodeName startNode) {
        this.startNode = startNode;
    }

    public NodeName getStartNode() {
        return startNode;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }
}
