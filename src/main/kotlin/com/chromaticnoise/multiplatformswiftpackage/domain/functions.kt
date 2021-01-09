package com.chromaticnoise.multiplatformswiftpackage.domain

internal fun <T> String.ifNotBlank(f: (String) -> T?): T? = takeIf { it.isNotBlank() }?.let { f(it) }

internal fun slashTerminatedUrl(url: String): String = url.takeIf { it.endsWith("/") } ?: "$url/"
