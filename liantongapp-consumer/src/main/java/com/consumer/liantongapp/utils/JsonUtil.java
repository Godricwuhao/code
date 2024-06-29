package com.consumer.liantongapp.utils;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.PathNotFoundException;
import com.jayway.jsonpath.Predicate;
import com.jayway.jsonpath.ReadContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtil {
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	private static final Configuration conf = Configuration.defaultConfiguration();

	static {
		// 忽略不存在属性=
		OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		// jsonpath叶子节点不存在时返回null
		conf.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
	}

	/**
	 * 将POJO转为JSON
	 */
	public static <T> String toJson(T obj) {
		String json;
		try {
			json = OBJECT_MAPPER.writeValueAsString(obj);
		} catch (Exception e) {
			log.error("convert POJO to JSON failure", e);
			throw new RuntimeException(e);
		}
		return json;
	}

	/**
	 * 将JSON转为POJO
	 */
	public static <T> T fromJson(String json, Class<T> type) {
		T pojo;
		try {
			OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			pojo = OBJECT_MAPPER.readValue(json, type);
		} catch (Exception e) {
			log.error("convert to POJO failure json:" + json, e);
			throw new RuntimeException(e);
		}
		return pojo;
	}

	public static JsonNode parse(String json) {
		JsonNode jsonNode;
		try {
			jsonNode = OBJECT_MAPPER.readTree(json);
		} catch (Exception e) {
			log.error("非法json字符串 json:" + json, e);
			throw new RuntimeException(e);
		}

		return jsonNode;
	}

	public static ArrayNode createArray() {
		return OBJECT_MAPPER.createArrayNode();
	}

	public static ObjectNode createObject() {
		return OBJECT_MAPPER.createObjectNode();
	}

	public static JsonNode get(JsonNode jsonNode, String name) {
		return jsonNode.get(name) == null ? OBJECT_MAPPER.createArrayNode() : jsonNode.get(name);
	}

	public static String getAsText(JsonNode node, String name) {
		JsonNode jsonNode = node.get(name);
		if (jsonNode != null) {
			return jsonNode.asText();
		}
		return "";
	}

	public static int getAsInt(JsonNode node, String name) {
		JsonNode jsonNode = node.get(name);
		if (jsonNode != null) {
			return jsonNode.asInt();
		}
		return 0;
	}

	public static boolean getAsBoolean(JsonNode node, String name) {
		JsonNode jsonNode = node.get(name);
		if (jsonNode != null) {
			return jsonNode.asBoolean();
		}
		return false;
	}

	public static boolean containKey(JsonNode node, String name) {
		JsonNode jsonNode = node.get(name);
		if (jsonNode != null) {
			return true;
		}
		return false;
	}

	public static List<Object> getAsList(JsonNode node, String name) {
		List<Object> result = new ArrayList<>();
		ArrayNode arrayNode = (ArrayNode) node.get(name);
		if (arrayNode != null) {
			for (int i = 0; i < arrayNode.size(); i++) {
				result.add(arrayNode.get(i).asText());
			}
		}
		return result;
	}

	public static <T> T read(String json, String path, Class<T> type, Predicate... filters) {
		ReadContext readContext = JsonPath.using(conf).parse(json);
		try {
			return readContext.read(path, type, filters);
		} catch (PathNotFoundException e) {
			log.warn("PathNotFound json:{} path:{}", json, path, e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

	public static <T> T read(String json, String path, Predicate... filters) {
		ReadContext readContext = JsonPath.using(conf).parse(json);
		try {
			return readContext.read(path, filters);
		} catch (PathNotFoundException e) {
			log.warn("PathNotFound json:{} path:{}", json, path, e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

}
