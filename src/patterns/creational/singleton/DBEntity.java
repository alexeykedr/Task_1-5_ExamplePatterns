package patterns.creational.singleton;

public class DBEntity {
    private static DBEntity dbEntity;


    public static synchronized DBEntity getDbEntity() {
        if (dbEntity == null) {
            dbEntity = new DBEntity();
        }
        return dbEntity;
    }

    private DBEntity() {
    }

    public static void setDbEntity() {
        dbEntity = new DBEntity();
    }


    public void showDBEntity() {
        System.out.println(dbEntity + " it is showDBEntity");
        System.out.println(dbEntity.toString() + " it is toString");
    }
}
