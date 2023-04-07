package patterns.creational.singleton;

public class DBEntityRunner {
    public static void main(String[] args) {
        System.out.println(DBEntity.getDbEntity());
        DBEntity.getDbEntity().showDBEntity();
        DBEntity.setDbEntity();
        System.out.println(DBEntity.getDbEntity());




    }
}
