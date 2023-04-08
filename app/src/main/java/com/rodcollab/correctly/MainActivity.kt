package com.rodcollab.correctly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rodcollab.correctly.experiments.ExperimentRouter
import com.rodcollab.correctly.experiments.ExperimentRouter.RunExperiment
import com.rodcollab.correctly.experiments.layouts.Greetings
import com.rodcollab.correctly.experiments.layouts.RunBaseConcepts
import com.rodcollab.correctly.ui.theme.CorrectlyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp(modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable
private fun MyApp(
    modifier: Modifier = Modifier
) {

    RunExperiment(ExperimentRouter.Experiment.ComposeUi.LayoutBasic, modifier)

}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun DefaultPreview() {
    CorrectlyTheme {
        Greetings()
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    CorrectlyTheme {
        RunBaseConcepts(onContinueClicked = {})
    }
}

@Preview
@Composable
fun MyAppPreview() {
    CorrectlyTheme {
        MyApp(Modifier.fillMaxSize())
    }
}