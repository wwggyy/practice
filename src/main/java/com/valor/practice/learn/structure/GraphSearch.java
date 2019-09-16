package com.valor.practice.learn.structure;

import org.springframework.util.Assert;

/**
 * @author: 01368324(王刚勇)
 * @date: 2019/9/12 15:51
 * Description: 图的广度优先搜索和深度优先搜索实现
 */
public class GraphSearch<E> {

    public StringBuffer searchPathDFS = new StringBuffer();
    public StringBuffer searchPathBFS = new StringBuffer();

    /**
     * 深度优先搜索实现
     *
     * @param root
     */
    public void searchDFS(GraphNode<? extends E> root) {
        if (root == null) {
            return;
        }

        // visited root
        if (searchPathDFS.length() > 0) {
            searchPathDFS.append("->");
        }
        searchPathDFS.append(root.data.toString());
        root.visited = true;

        for (GraphNode<? extends E> node : root.neighborList) {
            if (!node.visited) {
                searchDFS(node);
            }
        }
    }

    /**
     * 广度优先搜索实现,使用队列
     *
     * @param root
     */
    public void searchBFS(GraphNode<? extends E> root) throws Exception {
        Queue<GraphNode<? extends E>> queue = new Queue<GraphNode<? extends E>>(1<<3);

        // visited root
        if (searchPathBFS.length() > 0) {
            searchPathBFS.append("->");
        }
        searchPathBFS.append(root.data.toString());
        root.visited = true;

        // 加到队列队尾
        queue.insert(root);
        while (!queue.isEmpty()) {
            GraphNode<? extends E> r = queue.peek();
            for (GraphNode<? extends E> node : r.neighborList) {
                if (!node.visited) {
                    searchPathBFS.append("->");
                    searchPathBFS.append(node.data.toString());
                    node.visited = true;
                    queue.insert(node);
                }
            }
        }
    }
}