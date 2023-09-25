package br.com.mgsystems.dao.generic;

import java.util.HashMap;
import java.util.Map;

public class SingletonMap {

    private static SingletonMap singletonMap;

    /**
     * Simula o banco de dados
     */
    protected Map<Class, Map<?, ?>> map;

    private SingletonMap() {
        map = new HashMap<>();
    }

    /**
     * M�todo que garante o retorno de apenas uma inst�ncia desse objeto
     *
     * @return SingletonMap
     */
    public static SingletonMap getInstance() {
        if (singletonMap == null) {
            singletonMap = new SingletonMap();
        }
        return singletonMap;
    }

    public Map<Class, Map<?, ?>> getMap() {
        return this.map;
    }
}
