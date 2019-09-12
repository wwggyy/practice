package com.valor.practice.learn.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/9/12 14:59
 * Description: 无向简单图的节点
 */
public class GraphNode<T> {
    T data;
    List<GraphNode<T>> neighborList;
    boolean visited;

    public GraphNode(T data){
        this.data = data;
        neighborList = new ArrayList<GraphNode<T>>(1<<3);
        visited = false;
    }

    public boolean equals(GraphNode<T> node){
        return this.data.equals(node.data);
    }

    /**
     * 还原图中所有节点为未访问
     */
    public void restoreVisited(){
        restoreVisited(this);
    }

    /**
     * 还原node的图所有节点为未访问
     * @param node
     */
    private void restoreVisited(GraphNode<T> node){
        if(node.visited){
            node.visited = false;
        }

        List<GraphNode<T>> neighbors = node.neighborList;
        for(int i = 0; i < neighbors.size(); i++){
            restoreVisited(neighbors.get(i));
        }

    }
}