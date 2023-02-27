package org.veenron.demo.mp.persist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage<T extends Identifiable> {

    private Map<String, T> data = new HashMap<>();



    public T getOne(String uid) {
        if (data.containsKey(uid)) {
            return data.get(uid);
        }
        return null;
    }

    public List<T> getAll() {
        return List.copyOf(data.values());
    }

    public T store(T t) {
        data.put(t.getUid(), t);
        return t;
    }

    public T update(T t) {
        if (!data.containsKey(t.getUid())) {
            return null;
        }
        data.put(t.getUid(), t);
        return t;
    }





}
