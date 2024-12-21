package Concepts.DataStructures.Hashmaps;

import java.util.*;

public class HashMapCustom {
    private Entity[] entities;

    public HashMapCustom() {
        this.entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);

        entities[hash] = new Entity(key, value);
    }

    public String get(String key) throws Exception{
        int hash = Math.abs(key.hashCode() % entities.length);

        if(entities[hash] != null && entities[hash].getKey().equals(key)){
            return entities[hash].getValue();
        }else{
            throw new Exception("Key not found");
        }
    }

    public void removeKey(String key){
        int hash = Math.abs(key.hashCode() % entities.length);

        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    public class Entity{
        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
