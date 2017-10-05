package com.tarantsoff.sciense.algorithm.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

/**
 * Created by Andrii Tarantsov on 10/5/17.
 */
public class BFSTest{

    private Node first;
    private Node second;
    private Node third;
    private Node fourth;
    private Node fifth;
    private Node sixth;
    private Node seventh;

    @Test
    public void testSimple() throws Exception {

        final Map<Node, Set<Node>> graph = new HashMap<>();
        graph.put(first, asNodesSet(new Node[]{second, third}));
        graph.put(second, asNodesSet(new Node[]{fourth, fifth}));
        graph.put(fifth, asNodesSet(new Node[] {second, sixth, seventh}));

        Assert.fail("The work still in progress");

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

    private static HashSet<Node> asNodesSet(Node[] neighbors) {
        return new HashSet<>(Arrays.asList(neighbors));
    }
}