package com.darthyk.dijkstra;

public enum NodeName {
    A(0),
    B(1),
    C(2),
    D(3),
    E(4),
    F(5),
    G(6),
    H(7),
    I(8);

    private Integer num;

    NodeName(Integer num) {
        this.num = num;
    }

    public static NodeName getNode(Integer num) {
        NodeName[] values = NodeName.values();
        for (NodeName nodeName : values) {
            if (nodeName.getNum().equals(num)) {
                return nodeName;
            }
        }
        return null;
    }

    public Integer getNum() {
        return this.num;
    }
}
