package org.pg4200.ex05;

import org.pg4200.les05.MyMapTreeBased;

import java.util.Objects;

public class TernaryTreeMap<K extends Comparable<K>, V> implements MyMapTreeBased {

    protected class TreeNode{
        public K key;
        public V value;

        public TreeNode left;
        public TreeNode middle;
        public TreeNode right;

        public TreeNode first;
        public TreeNode second;
    }




    @Override
    public void put(Comparable key, Object value) {

    }

    @Override
    public void delete(Comparable key) {

    }

    @Override
    public Object get(Comparable key) {
        Objects.requireNonNull(key);
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return MyMapTreeBased.super.isEmpty();
    }

    @Override
    public int getMaxTreeDepth() {
        return 0;
    }
}
