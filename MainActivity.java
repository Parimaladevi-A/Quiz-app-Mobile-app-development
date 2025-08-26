package com.example.quizapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.quizapp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
private lateinit var questionText: TextView
private lateinit var scoreText: TextView
private lateinit var option1: Button
private lateinit var option2: Button
private lateinit var option3: Button
private lateinit var option4: Button
private val questionList = mutableListOf<Question>()
private var currentQuestionIndex = 0
private var score = 0
override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
setContentView(R.layout.activity_main)
questionText = findViewById(R.id.question_text)
scoreText = findViewById(R.id.score_text)
option1 = findViewById(R.id.option1)
option2 = findViewById(R.id.option2)
option3 = findViewById(R.id.option3)
option4 = findViewById(R.id.option4)
loadQuestions()
displayQuestion()
val optionClickListener = View.OnClickListener { view ->
val selectedOption = when (view.id) {
R.id.option1 -> 1
R.id.option2 -> 2
R.id.option3 -> 3
R.id.option4 -> 4
else -> 0
}
checkAnswer(selectedOption)

}
option1.setOnClickListener(optionClickListener)
option2.setOnClickListener(optionClickListener)
option3.setOnClickListener(optionClickListener)
option4.setOnClickListener(optionClickListener)
}
private fun loadQuestions() {
questionList.add(Question("What is the capital of France?", "Berlin", "Paris", "Madrid", "Rome", 2))
questionList.add(Question("What is 5 + 3?", "6", "7", "8", "9", 3))
questionList.add(Question("Which language is used for Android?", "Swift", "Kotlin", "Ruby", "Go", 2)) }
private fun displayQuestion() {
if (currentQuestionIndex < questionList.size) {
val q = questionList[currentQuestionIndex]
questionText.text = q.question
option1.text = q.option1
option2.text = q.option2
option3.text = q.option3
option4.text = q.option4
} else {
showFinalScore()
}
}
private fun checkAnswer(selectedOption: Int) {
val q = questionList[currentQuestionIndex]
if (selectedOption == q.correctAnswer) {
score++
Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
} else {
Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
}
scoreText.text = "Score: $score"
currentQuestionIndex++
displayQuestion()
}
private fun showFinalScore() {
questionText.text = "Quiz Completed! Final Score: $score"
option1.visibility = View.GONE
option2.visibility = View.GONE
option3.visibility = View.GONE
option4.visibility = View.GONE
}
}
