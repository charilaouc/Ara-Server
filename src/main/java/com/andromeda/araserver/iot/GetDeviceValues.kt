package com.andromeda.araserver.iot

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.type.CollectionType
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.registerKotlinModule
import java.io.IOException

class GetDeviceValues {
    @Throws(IOException::class)
    fun <T> yamlArrayToObjectList(yaml: String?, tClass: Class<T>?): ArrayList<T>? {
        val mapper = ObjectMapper(YAMLFactory()).registerKotlinModule()
        val listType: CollectionType = mapper.typeFactory.constructCollectionType(ArrayList::class.java, tClass)
        return mapper.readValue(yaml, listType)
    }
}