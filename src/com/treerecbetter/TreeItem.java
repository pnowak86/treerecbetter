package com.treerecbetter;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by marcin on 24.05.2017.
 */
public class TreeItem {
    private Set<TreeItem> children = new HashSet<>();
    private Object data;

    public TreeItem(Object data) {
        this.data = data;
    }

    public void addChild(TreeItem child) {
        this.children.add(child);
    }

    public Set<TreeItem> getChildren() {
        return this.children;
    }

    public Object getData() {
        return this.data;
    }
}
