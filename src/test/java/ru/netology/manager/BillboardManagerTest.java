package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.BillboardItem;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BillboardManagerTest {

    BillboardManager manager = new BillboardManager();

    @Test
    public void shouldRemoveIfExists() {
        int idToRemove = 1;
        BillboardItem first = new BillboardItem(1,"комедия","Отель");
        BillboardItem second = new BillboardItem(2,"боевик","Бладшот" );
        BillboardItem third = new BillboardItem(3, "мультфильм","Тролли");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        manager.removeById(idToRemove);

        BillboardItem[] actual = manager.getAll();
        BillboardItem[] expected = new BillboardItem[]{third, second};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutput() {
        BillboardItem first = new BillboardItem(1,"комедия","Отель");
        BillboardItem second = new BillboardItem(2,"боевик","Бладшот" );
        BillboardItem third = new BillboardItem(3, "мультфильм","Тролли");
        manager.add(first);
        manager.add(second);
        manager.add(third);

        BillboardItem[] actual = manager.getAll();
        BillboardItem[] expected = new BillboardItem[]{third, second, first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputMin() {
        BillboardItem first = new BillboardItem();

        manager.add(first);

        BillboardItem[] actual = manager.getAll();
        BillboardItem[] expected = new BillboardItem[]{first};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputMax() {
        BillboardManager manager = new BillboardManager();

        BillboardItem first = new BillboardItem(1,"комедия","Отель");
        BillboardItem second = new BillboardItem(2,"боевик","Бладшот");
        BillboardItem third = new BillboardItem(3,"мультфильм","Тролли");
        BillboardItem fourth = new BillboardItem(4,"комедия","Отель");
        BillboardItem fifth = new BillboardItem(5,"комедия","Отель");
        BillboardItem sixth = new BillboardItem(6,"комедия","Отель");
        BillboardItem seventh = new BillboardItem(7,"комедия","Отель");
        BillboardItem eighth = new BillboardItem(8,"комедия","Отель");
        BillboardItem ninth = new BillboardItem(9,"комедия","Отель");
        BillboardItem tenth = new BillboardItem(10,"комедия","Отель");
        BillboardItem eleventh = new BillboardItem(11,"комедия","Отель");
        BillboardItem twelfth = new BillboardItem(12,"комедия","Отель");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        BillboardItem[] actual = manager.getAll();
        BillboardItem[] expected = new BillboardItem[]{twelfth, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOutputChangeTheQuantity() {
        BillboardManager manager = new BillboardManager(5);

        BillboardItem first = new BillboardItem(1,"комедия","Отель");
        BillboardItem second = new BillboardItem(2,"боевик","Бладшот");
        BillboardItem third = new BillboardItem(3,"мультфильм","Тролли");
        BillboardItem fourth = new BillboardItem(4,"комедия","Отель");
        BillboardItem fifth = new BillboardItem(5,"комедия","Отель");
        BillboardItem sixth = new BillboardItem(6,"комедия","Отель");
        BillboardItem seventh = new BillboardItem(7,"комедия","Отель");
        BillboardItem eighth = new BillboardItem(8,"комедия","Отель");
        BillboardItem ninth = new BillboardItem(9,"комедия","Отель");
        BillboardItem tenth = new BillboardItem(10,"комедия","Отель");
        BillboardItem eleventh = new BillboardItem(11,"комедия","Отель");
        BillboardItem twelfth = new BillboardItem(12,"комедия","Отель");

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelfth);

        BillboardItem[] actual = manager.getAll();
        BillboardItem[] expected = new BillboardItem[]{twelfth, eleventh, tenth, ninth, eighth};
        assertArrayEquals(expected, actual);
    }
}
