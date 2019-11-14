package com.pxd.base.linklist.base;

import com.pxd.base.commons.linklist.LinkListBuilder;
import com.pxd.base.commons.linklist.LinkListCounter;
import com.pxd.base.commons.linklist.LinkListNode;
import com.pxd.base.commons.linklist.LinkListPrinter;

import java.util.Arrays;

/**
 * Created by panxudong on 2019/11/13.
 * Description:
 */
public class BaseOperation {

    public static void main(String[] args) {
        LinkListNode node = LinkListBuilder.newInstance().appendNodes(Arrays.asList(2, 8, 5, 0, 7, 6, 1, 9, 4, 3)).buildForSingle();
        LinkListPrinter.print(node);
        System.out.println("size:" + LinkListCounter.count(node));
    }
}