package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore:Int): ViewModel() {
 //the final score
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private val _eventPlayAgain = MutableLiveData<Boolean>()
    val eventPlayAgain: LiveData<Boolean>
        get() = _eventPlayAgain

    init{
        //Initialization of the score variable
        _score.value = finalScore

        _eventPlayAgain.value = false
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }


    fun onPlayAgain(){
        _eventPlayAgain.value = true
    }

    //Always reset the methods that create something like a return to nav
    fun onResetPlayAgain(){
        _eventPlayAgain.value = false
    }

}