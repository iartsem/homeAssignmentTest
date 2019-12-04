package parsers;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonObject;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GenericLazyMapParser {

    public static <T> T parse(String data, Class<T> clazz) { return new ObjectMapper().readValue(data, clazz) }  

    public static <T> T parse(Map data, Class<T> clazz) { return parse(new JSONObject(data).toString(), clazz) }  

    public static <T> T parse(JsonObject data, Class<T> clazz) { return parse(data.toString(), clazz) }  

    public static <T> T parse(InputStream data, Class<T> clazz) { return parse(data.toString(), clazz) }  

    public static <T> List<T> parseToList(Object data, Class<T> clazz) { ObjectMapper mapper = new ObjectMapper() 
        JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, clazz) 
        return data ? mapper.convertValue(data, type) : Collections.emptyList() }  

    public static <K, V> Map<K, V> parseToMap(Object data, Class<K> keyClazz, Class<V> valueClazz) { 
        ObjectMapper mapper = new ObjectMapper() JavaType keyType = mapper.getTypeFactory().constructType(keyClazz) 
        JavaType valueType = mapper.getTypeFactory().constructType(valueClazz) 
        JavaType mapType = mapper.getTypeFactory().constructMapType(Map.class, keyType, valueType) 
        return data ? mapper.convertValue(data, mapType) : Collections.emptyMap() }
}
