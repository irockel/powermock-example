package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * All usages require @RunWith(PowerMockRunner.class) and @PrepareForTest annotated at class level.
 */
@RunWith(PowerMockRunner.class) 
@PrepareForTest(StaticFactory.class)
public class StaticFactoryTest {
    
    @Test
    public void testCreateItem() throws Exception {
        PowerMockito.mockStatic(StaticFactory.class);
        Mockito.when(StaticFactory.createItem()).thenReturn(new Item(Item.Type.mocked));
        
        Item newItem = StaticFactory.createItem();
        
        Assert.assertEquals("Item has to be a mocked one", newItem.getType(), Item.Type.mocked);
    }
}