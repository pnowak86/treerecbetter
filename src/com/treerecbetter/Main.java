package com.treerecbetter;

import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        TreeItem mieszko = new TreeItem("Mieszko I");
        TreeItem bolek = new TreeItem("Bolesław Chrobry");
        TreeItem sygryda = new TreeItem("Sygryda Storråda");

        TreeItem bezprym = new TreeItem("bezprym");
        TreeItem regelinda = new TreeItem("Regelinda");
        TreeItem mieszko2 = new TreeItem("Mieszko II Lambert");

        TreeItem kazik = new TreeItem("Kazimierz Odnowiciel");
        TreeItem gertruda = new TreeItem("Gertruda");

        mieszko.addChild(bolek);
        mieszko.addChild(sygryda);

        bolek.addChild(mieszko2);
        bolek.addChild(regelinda);
        bolek.addChild(bezprym);

        bolek.addChild(kazik);
        bolek.addChild(gertruda);

        printTreeItem(mieszko);

    }

    public static void printTreeItem(TreeItem item) {
        System.out.println(item.getData());

        Iterator iterator = item.getChildren().iterator();
        while(iterator.hasNext()) {
            printTreeItem((TreeItem) iterator.next());
        }
    }
}
