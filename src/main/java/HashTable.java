import java.util.LinkedList;

/**
 * Самопальная хеш-таблица.
 */
public class HashTable<K, V> {

    /**
     * Связный список элементов.
     */
    LinkedList items;

    /**
     * Ключ.
     */
    private K key;

    /**
     * Значение.
     */
    private V value;

    public HashTable(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public <K, V> void put(K key, V value) {
        // todo: реализация вставки значения по ключу.
    }

    public <V> V get(K key) {
        // todo: реализация возврат значение.
        return value;
    }
}
