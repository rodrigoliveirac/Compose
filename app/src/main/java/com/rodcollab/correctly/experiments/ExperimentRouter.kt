package com.rodcollab.correctly.experiments

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rodcollab.correctly.experiments.layouts.RunBaseConcepts

object ExperimentRouter  {

    @Composable
    fun RunExperiment(experiment: Experiment, modifier: Modifier) {
        val experimentComposable = when (experiment) {
            is Experiment.ComposeUi.BaseConcept -> RunBaseConcepts(modifier)
            is Experiment.ComposeUi.LayoutBasic -> RunLayoutBasic(modifier)
            else -> {}
        }
        return experimentComposable
    }

    sealed interface Experiment {

        sealed class ComposeUi {

            object BaseConcept : ComposeUi(), Experiment

            object LayoutBasic : ComposeUi(), Experiment
        }

    }
}