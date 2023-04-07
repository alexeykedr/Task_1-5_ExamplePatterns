package patterns.behavioral.iterator;

public class TouristMap implements Collection{
    private String name;
    private String[] points;

    public TouristMap(String name, String[] points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getPoints() {
        return points;
    }

    public void setPoints(String[] points) {
        this.points = points;
    }

    @Override
    public Iterator getIterator() {
        return new PointIterator();
    }

    private class PointIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index < points.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return points[index++];
        }
    }
}
