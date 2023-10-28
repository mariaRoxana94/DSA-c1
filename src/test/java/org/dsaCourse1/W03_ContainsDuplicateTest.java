package org.dsaCourse1;


import org.junit.Assert;
import org.junit.Test;

public class W03_ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() {

        int [] arr = {1,3,4,4,5};

        Assert.assertTrue(W03_ContainsDuplicate.containsDuplicate(arr));


        arr = new int[]{1, 3, 4, 6, 5};
        Assert.assertFalse(W03_ContainsDuplicate.containsDuplicate(arr));
    }
}