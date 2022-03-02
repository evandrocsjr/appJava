package academy.devjojo.maratonajava.javacore.Minterfaces.domain;

public interface DataLoader {
    void load();

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissões.");
    }

    static void retrieveMaxDataSize() { // nao pode ser sobescrito
        System.out.println("Dentro do retrieveMaxDataSize na interface.");
    }
}
