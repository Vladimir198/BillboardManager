package ru.netology.manager;

import ru.netology.domain.BillboardItem;

public class BillboardManager {
    private BillboardItem[] items = new BillboardItem[0];
    private int len = 10;

    public BillboardManager() {
    }

    public BillboardManager(int len) {
        this.len = len;
    }

    public void add(BillboardItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        BillboardItem[] tmp = new BillboardItem[length];
        /*
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }*/
        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public BillboardItem[] getAll() {

        if (len > items.length){
            len = items.length;
        }

        BillboardItem[] result = new BillboardItem[len];

        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    // наивная реализация
    public void removeById(int id) {
        int length = items.length - 1;
        BillboardItem[] tmp = new BillboardItem[length];
        int index = 0;
        for (BillboardItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        // меняем наши элементы
        items = tmp;
    }
}
