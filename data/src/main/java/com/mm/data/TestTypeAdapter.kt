package com.mm.data

import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class TestQualifier

enum class TestType(val type: String) {
    Main("main");
}

class TestTypeAdapter {
    @FromJson
    @TestQualifier
    fun fromJson(type: String): TestType {
        return when (type) {
            else -> TestType.Main
        }
    }

    @ToJson
    fun toJson(@TestQualifier type: TestType): String {
        return when (type) {
            else -> "main"
        }
    }
}
