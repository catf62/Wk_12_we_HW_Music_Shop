import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop biggars;
    ISell stradivarius1;
    ISell boomBoomBoom1;
    ISell coranglais1;
    ISell string1;
    ISell taikoSticks;
    ISell reedyReed1;

   @Before
    public void before(){
       biggars = new Shop();
       stradivarius1 = new Violin(ItemType.STRINGS, "Wood", 4,
               "Stradivarius 1", 300.00, 650.00);
       boomBoomBoom1 = new Timpani(ItemType.PERCUSSION, "Copper", 5,
               "Boom Boom Boom 1", 450.00, 750.00);
       coranglais1 = new CorAnglais(ItemType.WOODWIND, "Wood", "Reedy reed",
               "Best Cor Anglais", 400.00, 600.00);
       string1 = new ViolinString(ItemType.ACCESSORIES, 10.00,
               15.00, "Best Cat Gut Ever");
       taikoSticks = new Drumsticks(ItemType.ACCESSORIES, 10.00, 15.00,
                   "Taiko Drumming Sticks");
       reedyReed1 = new Reed(ItemType.ACCESSORIES, 10.00, 15.00, "Reedy Reedo");
   }


   @Test
    public void stockSizeStartsAtZero(){
       assertEquals(0, biggars.getStockSize());
   }

   @Test
    public void canAddItemToStock(){
       biggars.addItemToStock(stradivarius1);
       assertEquals(1, biggars.getStockSize());
       biggars.addItemToStock(boomBoomBoom1);
       assertEquals(2, biggars.getStockSize());
   }

   @Test
    public void canRemoveItemFromStock(){
       biggars.addItemToStock(stradivarius1);
       biggars.addItemToStock(boomBoomBoom1);
       assertEquals(2, biggars.getStockSize());
       biggars.removeItemFromStock(boomBoomBoom1);
       assertEquals(1, biggars.getStockSize());
   }

   @Test
    public void canGetStock(){
       biggars.addItemToStock(stradivarius1);
       biggars.addItemToStock(boomBoomBoom1);
       assertEquals("["+stradivarius1.toString()+", "+boomBoomBoom1.toString()+"]", biggars.getStock());
   }

   @Test
    public void canRemoveSpecificItemFromStock(){
       biggars.addItemToStock(stradivarius1);
       biggars.addItemToStock(boomBoomBoom1);
       assertEquals("["+stradivarius1.toString()+", "+boomBoomBoom1.toString()+"]", biggars.getStock());
       biggars.removeItemFromStock(boomBoomBoom1);
       assertEquals("["+stradivarius1.toString()+"]", biggars.getStock());
   }

   @Test
    public void canCalculateTotalStockProfit(){
       biggars.addItemToStock(stradivarius1);
       biggars.addItemToStock(boomBoomBoom1);
       biggars.addItemToStock(coranglais1);
       biggars.addItemToStock(string1);
       biggars.addItemToStock(taikoSticks);
       biggars.addItemToStock(reedyReed1);
       assertEquals(865.00, biggars.calculateFullStockProfit(), 0.001);
   }
}
