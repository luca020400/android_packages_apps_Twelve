/*
 * SPDX-FileCopyrightText: 2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.twelve.database.entities

import androidx.room.ColumnInfo

data class PlaylistWithBoolean(
    @ColumnInfo(name = "playlist_id") val id: Long,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "last_modified") val lastModified: Long,
    @ColumnInfo(name = "track_count", defaultValue = "0") val trackCount: Long,
    @ColumnInfo(name = "value") val value: Boolean
) {
    fun toPair() = Playlist(id, name, lastModified, trackCount) to value
}
