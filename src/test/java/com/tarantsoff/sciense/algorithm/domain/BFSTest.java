package com.tarantsoff.sciense.algorithm.domain;

import com.tarantsoff.sciense.algorithm.BFSGraphWalker;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by Andrii Tarantsov on 10/5/17.
 */
public class BFSTest {

    private Node first;
    private Node second;
    private Node third;
    private Node fourth;
    private Node fifth;
    private Node sixth;
    private Node seventh;

    private static HashSet<Node> asNodesSet(Node[] neighbors) {
        return new HashSet<>(Arrays.asList(neighbors));
    }

    @Test
    public void testSimple() throws Exception {

        final Map<Node, Set<Node>> graph = new HashMap<>();
        link(graph, first, second, third);
        link(graph, second, fourth, fifth);
        link(graph, fifth, sixth, seventh);
        //
        BFSGraphWalker walker = new BFSGraphWalker(graph);
        List<Node> path = walker.findPath(first, seventh);
        Assert.assertEquals(
                "Path length from node " + first + " to node " + seventh,
                4,
                path.size());

    }

    private void link(Map<Node, Set<Node>> graph, Node first, Node... neiboardg) {
        HashSet<Node> nodes = asNodesSet(neiboardg);
        graph.put(first, nodes);
    }

    @Before
    public void setUpNodes() {
        first = new Node("first");
        second = new Node("second");
        third = new Node("third");
        fourth = new Node("fourth");
        fifth = new Node("fifth");
        sixth = new Node("sixth");
        seventh = new Node("seventh");
    }
}