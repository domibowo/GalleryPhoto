package com.example.galleryphoto.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.galleryphoto.R

data class Photo(
    @StringRes val photoTitle: Int,
    @DrawableRes val image: Int,
    @StringRes val location: Int
)

object PhotoRepository {
    val photos = listOf(
        Photo(R.string.image_1, R.drawable.against_the_flow, R.string.location_shinjuku),
        Photo(R.string.image_2, R.drawable.beacon, R.string.location_shinjuku),
        Photo(R.string.image_3, R.drawable.blue_steel, R.string.location_shibuya),
        Photo(R.string.image_4, R.drawable.cineon, R.string.location_roppongi),
        Photo(R.string.image_5, R.drawable.city_fold, R.string.location_ginza),
        Photo(R.string.image_6, R.drawable.in_the_dead_of_winter, R.string.location_harajuku),
        Photo(R.string.image_7, R.drawable.looking_glass, R.string.location_shinjuku),
        Photo(R.string.image_8, R.drawable.lost_at_sea, R.string.location_shinjuku),
        Photo(R.string.image_9, R.drawable.mirrors, R.string.location_roppongi),
        Photo(R.string.image_10, R.drawable.old_vs_new, R.string.location_roppongi),
        Photo(R.string.image_11, R.drawable.parting_ways, R.string.location_shinjuku),
        Photo(R.string.image_12, R.drawable.smooth_tokyo, R.string.location_roppongi),
        Photo(R.string.image_13, R.drawable.still_flow, R.string.location_shinjuku),
        Photo(R.string.image_14, R.drawable.streaks, R.string.location_shinjuku),
        Photo(R.string.image_15, R.drawable.the_in_between, R.string.location_shinjuku),
        Photo(R.string.image_16, R.drawable.tower_sunset, R.string.location_roppongi),
        Photo(R.string.image_17, R.drawable.towering, R.string.location_roppongi),
        Photo(R.string.image_18, R.drawable.waiting, R.string.location_roppongi),
        Photo(R.string.image_19, R.drawable.walk, R.string.location_roppongi),
        Photo(R.string.image_20, R.drawable.weave, R.string.location_ginza),
    )
}