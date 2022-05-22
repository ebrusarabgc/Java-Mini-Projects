package SimpleSingerList;

import java.util.ArrayList;

public class Singers {
    private final ArrayList<String> singerList = new ArrayList<>();

    public void printSingers() {
        System.out.println("There are " + singerList.size() + " singers in the singer list.");

        for (int i = 0; i < singerList.size(); i++) {
            if (i == 0) {
                System.out.println("1st Singer: " + singerList.get(i));
            } else if (i == 1) {
                System.out.println("2nd Singer: " + singerList.get(i));
            } else if (i == 2) {
                System.out.println("3rd Singer: " + singerList.get(i));
            } else {
                System.out.println((i+1) + "th Singer: " + singerList.get(i));
            }
        }
    }

    public void addSinger(String singer) {
        singerList.add(singer);

        System.out.println("The singer list is updated.");
    }

    public void changeSinger(int pos, String singer) {
        singerList.set(pos, singer);

        System.out.println("The singer list is updated.");
    }

    public void removeSinger(int pos) {
        String name = singerList.get(pos);

        singerList.remove(pos);

        System.out.println("The singer named " + name + " is removed from the singer list.");
    }

    public void searchSinger(String name) {
        int pos = singerList.indexOf(name);

        if (pos >= 0) {
            System.out.println("The singer was found.");
            System.out.println("The singer named " + name + " is in the" + pos + "th position.");
        } else {
            System.out.println("The singer was not found.");
        }
    }
}
