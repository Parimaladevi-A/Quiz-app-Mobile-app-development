# Quiz-app-Mobile-app-development

A simple multiple-choice quiz app built in Kotlin for Android.
Test your knowledge with questions, get instant feedback, and track your score!

Features
--
Displays multiple-choice questions with four options

Instant feedback on answers (Correct/Wrong) using Toast messages

Tracks and displays the current score

Shows final score at the end of the quiz

Simple and clean UI using Android's native components



How to Run
--

Clone or download this repository.

Open the project in Android Studio.

Build and run the app on an emulator or physical Android device.

Code Overview
--
MainActivity.kt manages the quiz logic, UI updates, and score tracking.

Questions are stored in a Question data class and loaded into a list.

Button clicks are handled by a shared OnClickListener that checks the answer and updates the score.

When all questions are answered, the final score is displayed and answer buttons are hidden.

File Structure
--

activity_main.xml: Defines the UI layout with a question text, four option buttons, and score display.

MainActivity.kt: Contains the main app logic and UI control.

Controls
--

Tap on one of the four options to answer the question.

The app will provide instant feedback and automatically proceed to the next question.

After the last question, the final score is shown.

Requirements
--

Android Studio

Minimum SDK version compatible with your setup (usually API 21+)
