package Concepts.DataStructures.Hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMapCustomOptimized<K, V>{
    ArrayList<LinkedList<Entity>> list;
    private int size = 0;
    private float loadFactor = 0.5f;

    public HashMapCustomOptimized() {
        this.list = new ArrayList<>();
        for(int i=0; i<10; i++){
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());

        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.getKey().equals(key)){
                entity.setValue(value);
                return;
            }
        }

        if((float) (size) / list.size() > loadFactor){
            reHash();
        }

        entities.add(new Entity(key, value));
        size++;
    }

    private void reHash(){
        System.out.println("We are now rehashing");
        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for(int i=0; i<old.size()*2; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries : old){
            for(Entity entry : entries){
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.getKey().equals(key)){
                return entity.getValue();
            }
        }

        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity : entities){
            if(entity.getKey().equals(key)){
                entities.remove(entity);
                break;
            }
        }
        size--;
    }

    public boolean containsKey(K key){
        return get(key)!=null;
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();

        builder.append("{");
        for(LinkedList<Entity> entities : list){
            for(Entity entity : entities){
                builder.append(entity.getKey() + "=" + entity.getValue());
                builder.append(", ");
            }
        }

        builder.append("}");

        return builder.toString();
    }

    public class Entity{
        K key;
        V value;

        public Entity(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
