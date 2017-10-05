package com.tarantsoff.sciense.algorithm;

import com.tarantsoff.sciense.algorithm.domain.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Andrii Tarantsov on 10/5/17.
 */
public class BFSGraphWalker {

    private final Map<Node, Set<Node>> graph;

    public BFSGraphWalker(Map<Node, Set<Node>> graph) {
        this.graph = graph;
    }

    public List<Node> findPath(Node from, Node to) {
        return new LinkedList<>();
    }
}
