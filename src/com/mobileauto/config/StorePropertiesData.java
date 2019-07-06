package com.mobileauto.config;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Properties;

public class StorePropertiesData {

	public HashMap<String, String> storePropIntoHashMap(Properties properties) {

		HashMap<String, String> dataMap = new HashMap<String, String>();

		for (Entry<Object, Object> entry : properties.entrySet()) {
			dataMap.put((String) entry.getKey(), (String) entry.getValue());
		}

		return dataMap;

	}

}
