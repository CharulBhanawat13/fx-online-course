package com.example.online_courses.datafetcher;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Node {
    List<Node> nodes = new ArrayList<>();
    List<File> files = new ArrayList<>();
    boolean isLeafNode;
    boolean isFile;


    public Node getMetaDataforNode(Path path) {

        return null;
    }

    public void getDataForNode() {

    }

}
