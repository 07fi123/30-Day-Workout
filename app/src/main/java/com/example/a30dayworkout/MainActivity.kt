package com.example.a30dayworkout


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30dayworkout.data.Workouts
import com.example.a30dayworkout.data.workoutList
import com.example.a30dayworkout.ui.theme.A30dayWorkoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            A30dayWorkoutTheme {
                WorkoutList()
            }
        }
    }
}
@Composable
fun WorkoutList(){
    Scaffold(
        topBar = {
            WorkoutTopAppBar()
        }
    ){
        LazyColumn (contentPadding = it){
            itemsIndexed(workoutList){ index, newWorkout ->
                WorkoutCard(
                    workout = newWorkout,
                    day = index+1,
                    modifier = Modifier.padding(dimensionResource(id = R.dimen.small_padding)),
                )
            }
        }
    }
}
@Composable
fun WorkoutCard(
    workout: Workouts,
    day: Int,
    modifier: Modifier,
){
    var expand by remember {
        mutableStateOf(false)
    }
    Card(onClick = {expand=!expand},
        modifier = modifier
            .clip(MaterialTheme.shapes.medium)) {
        Column(
            modifier = Modifier
                .padding(dimensionResource(id = R.dimen.large_padding))
                .animateContentSize(
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioNoBouncy,
                        stiffness = Spring.StiffnessHigh
                    )
                )
        ) {
            Text(text = "Day $day",
                style = MaterialTheme.typography.displaySmall,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(dimensionResource(id = R.dimen.small_padding))
            )


            Image(
                //  painter = rememberAsyncImagePainter(model = Workout.imageId),
                painter = painterResource(id = workout.imageId),
                contentDescription = "Image $day",
                modifier = Modifier
                    .height(dimensionResource(id = R.dimen.image_height))
                    .clip(MaterialTheme.shapes.small)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop)
            if(expand){
                Text(
                    text = stringResource(id = workout.title),
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                        .padding(dimensionResource(id = R.dimen.large_padding))

                )
                Text(
                    text = stringResource(id = workout.description),
                    style = MaterialTheme.typography.bodyLarge)

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutTopAppBar(){
    CenterAlignedTopAppBar(
        title = {
            Text(stringResource(R.string.app_name))
                },
        modifier = Modifier,
        windowInsets = TopAppBarDefaults.windowInsets,
        navigationIcon = {
            IconButton(onClick = { /* Handle navigation icon click */ }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = { /* Handle action icon click */ }) {
                Icon(imageVector = Icons.Filled.Search, contentDescription = "Search")
            }
        }
    )

}


@Preview
@Composable
fun AppDisplay(){
    A30dayWorkoutTheme {
        WorkoutList()
    }
}


