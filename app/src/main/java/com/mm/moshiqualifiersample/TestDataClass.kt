package com.mm.moshiqualifiersample

import com.mm.data.TestQualifier
import com.mm.data.TestType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TestDataClass(
    @TestQualifier val type: TestType
)