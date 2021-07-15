package com.tarc.navigationpath

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.tarc.navigationpath.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {
    private lateinit var binding: FragmentQuestionBinding
    private lateinit var currentQuestion: Question
    private lateinit var answers: MutableList<String>

    var questionIndex = 0
    var score: Int = 0

    private val question: MutableList<Question> = mutableListOf(
        question(
            text = "Which Order have been implemented by Malaysia government to prevent COVID-19?",
            answers = listOf(
                "Movement Control Order",
                "Multiple Choice Order",
                "More Coffee Order "
            )
        ),
        question(
            text = "What is FMCO?",
            answers = listOf(
                "Full Movement Control Oder",
                "Fun Movement Control Oder",
                "Forever Movement Control Oder"
            )
        )
    )

    private fun setQuestion() {
        currentQuestion = question[questionIndex]
        answers = currentQuestion.answers.toMutableList()

        answers.shuffle()

        binding.tvQuestion.text = currentQuestion.text
        binding.optA.text = answers[0]
        binding.optB.text = answers[1]
        binding.optC.text = answers[2]

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_question, container, false)

        return binding.root
    }

}