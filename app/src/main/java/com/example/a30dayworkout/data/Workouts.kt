package com.example.a30dayworkout.data

import androidx.annotation.StringRes
import com.example.a30dayworkout.R

data class Workouts(
    @StringRes var title : Int,
    var imageId : Int,
    @StringRes var description : Int
)

var workoutList = listOf(
    Workouts(title = R.string.day_1_title, imageId = R.drawable.day_1_image, description = R.string.day_1_description),
    Workouts(title = R.string.day_2_title, imageId = R.drawable.day_2_image, description = R.string.day_2_description),
    Workouts(title = R.string.day_3_title, imageId = R.drawable.day_3_image, description = R.string.day_3_description),
    Workouts(title = R.string.day_4_title, imageId = R.drawable.day_4_image, description = R.string.day_4_description),
    Workouts(title = R.string.day_5_title, imageId = R.drawable.day_5_image, description = R.string.day_5_description),
    Workouts(title = R.string.day_6_title, imageId = R.drawable.day_6_image, description = R.string.day_6_description),
    Workouts(title = R.string.day_7_title, imageId = R.drawable.day_7_image, description = R.string.day_7_description),
    Workouts(title = R.string.day_8_title, imageId = R.drawable.day_8_image, description = R.string.day_8_description),
    Workouts(title = R.string.day_9_title, imageId = R.drawable.day_9_image, description = R.string.day_9_description),
    Workouts(title = R.string.day_10_title, imageId = R.drawable.day_10_image, description = R.string.day_10_description),
    Workouts(title = R.string.day_11_title, imageId = R.drawable.day_11_image, description = R.string.day_11_description),
    Workouts(title = R.string.day_12_title, imageId = R.drawable.day_12_image, description = R.string.day_12_description),
    Workouts(title = R.string.day_13_title, imageId = R.drawable.day_13_image, description = R.string.day_13_description),
    Workouts(title = R.string.day_14_title, imageId = R.drawable.day_14_image, description = R.string.day_14_description),
    Workouts(title = R.string.day_15_title, imageId = R.drawable.day_15_image, description = R.string.day_15_description),
    Workouts(title = R.string.day_16_title, imageId = R.drawable.day_16_image, description = R.string.day_16_description),
    Workouts(title = R.string.day_17_title, imageId = R.drawable.day_17_image, description = R.string.day_17_description),
    Workouts(title = R.string.day_18_title, imageId = R.drawable.day_18_image, description = R.string.day_18_description),
    Workouts(title = R.string.day_19_title, imageId = R.drawable.day_19_image, description = R.string.day_19_description),
    Workouts(title = R.string.day_20_title, imageId = R.drawable.day_20_image, description = R.string.day_20_description),
    Workouts(title = R.string.day_21_title, imageId = R.drawable.day_21_image, description = R.string.day_21_description),
    Workouts(title = R.string.day_22_title, imageId = R.drawable.day_22_image, description = R.string.day_22_description),
    Workouts(title = R.string.day_23_title, imageId = R.drawable.day_23_image, description = R.string.day_23_description),
    Workouts(title = R.string.day_24_title, imageId = R.drawable.day_24_image, description = R.string.day_24_description),
    Workouts(title = R.string.day_25_title, imageId = R.drawable.day_25_image, description = R.string.day_25_description),
    Workouts(title = R.string.day_26_title, imageId = R.drawable.day_26_image, description = R.string.day_26_description),
    Workouts(title = R.string.day_27_title, imageId = R.drawable.day_27_image, description = R.string.day_27_description),
    Workouts(title = R.string.day_28_title, imageId = R.drawable.day_28_image, description = R.string.day_28_description),
    Workouts(title = R.string.day_29_title, imageId = R.drawable.day_29_image, description = R.string.day_29_description),
    Workouts(title = R.string.day_30_title, imageId = R.drawable.day_30_image, description = R.string.day_30_description)
)