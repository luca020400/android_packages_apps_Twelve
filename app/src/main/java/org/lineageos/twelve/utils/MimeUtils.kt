/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.twelve.utils

import androidx.media3.common.MimeTypes
import androidx.media3.common.util.UnstableApi

object MimeUtils {
    @androidx.annotation.OptIn(UnstableApi::class)
    fun mimeTypeToDisplayName(mimeType: String) = MimeTypes.normalizeMimeType(mimeType).let {
        it.takeIf { it.contains('/') }
            ?.substringAfterLast('/')
            ?.uppercase()
    }
}
