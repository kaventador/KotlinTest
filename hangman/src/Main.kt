import kotlin.random.Random

class HangmanGame(private val wordToGuess: String) {
    private var guessedWord = CharArray(wordToGuess.length) { '_' }
    private var incorrectGuesses = 0
    private val maxIncorrectGuesses = 6
    private val guessedLetters = mutableListOf<Char>()
    private var ropeLength = 0
    private var hangmanState = arrayOf(
        "---",
        " |",
        " O",
        "/|\\",
        " |",
        " /\\"
    )

    init {
        println("Welcome to Hangman!")
    }

    fun play() {
        while (incorrectGuesses < maxIncorrectGuesses && '_' in guessedWord) {
            displayGameStatus()
            makeGuess()
        }

        displayGameResult()
    }

    private fun displayGameStatus() {
        println("\nWord: ${guessedWord.joinToString(" ")}")
        println("Incorrect Guesses: ${guessedLetters.joinToString(", ")}")
        println("Rope Length: $ropeLength")
        displayHangmanState()
    }

    private fun makeGuess() {
        println("Guess a letter: ")
        val guess = readLine()?.toLowerCase()?.get(0) ?: return

        if (guessedLetters.contains(guess)) {
            println("You already guessed '$guess'. Try again.")
            return
        }

        if (wordToGuess.contains(guess)) {
            updateGuessedWord(guess)
        } else {
            incorrectGuesses++
            ropeLength++
            println("Incorrect guess! Attempts left: ${maxIncorrectGuesses - incorrectGuesses}")
            guessedLetters.add(guess)
        }
    }

    private fun updateGuessedWord(guess: Char) {
        for (i in wordToGuess.indices) {
            if (wordToGuess[i] == guess) {
                guessedWord[i] = guess
            }
        }
    }

    private fun displayHangmanState() {
        for (i in 0 until ropeLength) {
            println(hangmanState[i])
        }
    }

    private fun displayGameResult() {
        if ('_' !in guessedWord) {
            println("\nCongratulations! You guessed the word: ${wordToGuess.toUpperCase()}")
        } else {
            println("\nSorry, you ran out of attempts. The correct word was: ${wordToGuess.toUpperCase()}")
            println("Hangman! The rope is fully drawn.")
            displayHangmanState()
        }
    }
}

fun main() {
    val wordList = listOf("tehran", "mashhad", "kashan", "semnan")
    val randomIndex = Random.nextInt(wordList.size)
    val randomWord = wordList[randomIndex]

    val hangmanGame = HangmanGame(randomWord)
    hangmanGame.play()
}
