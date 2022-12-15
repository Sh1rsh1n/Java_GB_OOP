package seminars.seminar1.task1;

public class Main {
    public static void main(String[] args) {
        VkusVillWenderMachin wenderMachin = new VkusVillWenderMachin();
        wenderMachin.addProduct(1, new Goods("Lays", 12345, 49, 20));
        wenderMachin.addProduct(2, new Goods("Cola", 11111, 299, 1));
        wenderMachin.addProduct(3, new Goods("Lipton", 22222, 99, 10));
        wenderMachin.addProduct(4, new Goods("Milka", 15643, 150, 5));

        int number = wenderMachin.enterNumber();
        Goods goods = wenderMachin.showGoods(number);
        wenderMachin.goodsBuy(goods);
    }
}
