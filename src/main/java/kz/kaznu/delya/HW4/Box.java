package kz.kaznu.delya.HW4;

public class Box {
    private int width;
    private int height;
    private int depth;
    public boolean isOpen;
    public String color;
    private String item;


    public Box(int width, int height, int depth, String color) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.color = color;
        this.isOpen = true;
        this.item = null;
    }

    public void openBox() {
        if (!isOpen) {
            isOpen = true;
            System.out.println("Коробка открыта");
        } else {
            System.out.println("Коробка уже открыта");
        }
    }

    public void closeBox() {
        if (isOpen) {
            isOpen = false;
            System.out.println("Коробка закрыта");
        } else {
            System.out.println("Коробка уже закрыта");
        }

    }

    public void repaint(String newColor) {
        color = newColor;
        System.out.println("Коробка перекрашена в " + newColor);
    }

    public void putItem(String newItem) {
        if (isOpen) {
            if (item == null) {
                item = newItem;
                System.out.println("В коробку положен предмет: " + newItem);
            } else {
                System.out.println("В коробке уже есть предмет: " + item);
            }
        } else {
            System.out.println("Коробка закрыта. Сначала откройте её.");
        }
    }

    public void removeItem() {
        if (isOpen) {
            if (item != null) {
                System.out.println("Из коробки извлекли предмет: " + item);
                item = null;
            } else {
                System.out.println("Коробка пустая");
            }
        } else {
            System.out.println("Коробка закрыта. Для начала откройте ее");
        }
    }

    public void infoBox() {
        System.out.println("Размеры коробки: " + width + "x" + height + "x" + depth);
        System.out.println("Цвет: " + color);
        System.out.println("Состояние: " + (isOpen ? "открыта" : "закрыта"));
        System.out.println("Содержимое: " + (item != null ? item : "пусто"));
    }
}
