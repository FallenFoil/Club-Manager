package data;

public interface DataFacade {
    void saveData(Object o, String fich);
    Object fetchData(String fich);
}
