package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * All usages require @RunWith(PowerMockRunner.class) and @PrepareForTest annotated at class level.
 */
@RunWith(PowerMockRunner.class) 
@PrepareForTest(ItemHelper.class)
public class ItemHelperTest {
    
    @Test
    public void testDoSomethingWithItem() throws Exception {
        ItemHelper itemHelper = PowerMockito.spy(new ItemHelper());
        PowerMockito.doReturn(new Item(Item.Type.mocked)).when(itemHelper, "createItem");
        
        Item newItem = itemHelper.doSomethingWithItem();
        
        Assert.assertEquals("Item has to be a mocked one", newItem.getType(), Item.Type.mocked);
    }
}
