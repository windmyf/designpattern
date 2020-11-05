package com.myf.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : myf
 * @Date : 2020/11/4 15:56
 * @Description : 组合模式
 * @Version : 1.0
 */
public class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter1 = new BranchNode("chapter1");
        BranchNode chapter2 = new BranchNode("chapter2");

        LeafNode c11 = new LeafNode("c11");
        LeafNode c12 = new LeafNode("c12");
        BranchNode b21 = new BranchNode("section21");
        LeafNode c211 = new LeafNode("c211");
        LeafNode c212 = new LeafNode("c212");

        root.add(chapter1);
        root.add(chapter2);

        chapter1.add(c11);
        chapter1.add(c12);

        chapter2.add(b21);

        b21.add(c211);
        b21.add(c212);

        tree(root, 0);

    }

    static void tree(Node b, int dept) {
        for (int i = 0; i < dept; i++) {
            System.out.print("--");
        }

        b.p();
        if (b instanceof BranchNode) {
            for (Node n : ((BranchNode) b).nodes) {
                tree(n, dept + 1);
            }
        }
    }
}

abstract class Node {
    abstract public void p();
}

class LeafNode extends Node {

    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void p() {
        System.out.println(content);
    }
}

class BranchNode extends Node {

    List<Node> nodes = new ArrayList<>();

    String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void p() {
        System.out.println(name);
    }

    public void add(Node n) {
        nodes.add(n);
    }
}
