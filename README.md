# 🧠 Quiz Game

**Status:** ✅ Complete (v1.0)  
**Built:** June 2026  

A console-based Java application that delivers a 5-question multiple-choice quiz on Java programming concepts. The user answers each question with A/B/C/D, receives immediate feedback, and gets a final score with grade evaluation at the end.

---

## 🖥️ Sample Output

```
There are 5 questions related to Java. Each followed by 4 options from which only 1 is correct.

Good luck!!


Are you ready to play, y/n?
y

Number of primitive data types in Java are?
A. 6
B. 7
C. 8
D. 9
Enter your answer below.
c
Correct Answer!!

What is the size of float and double in Java?
A. 32 and 64
B. 32 and 32
C. 64 and 64
D. 64 and 32
Enter your answer below.
b
Wrong answer, correct answer: A

...

Your total score is (3/5)
Your percentage is: 60.00%
Your grade is C
```

---

## 🚀 Features

- **Menu-driven start** with y/n confirmation before quiz begins
- **5 multiple-choice questions** on Java fundamentals (primitive types, sizes, type conversion, arrays, method arguments)
- **Real-time feedback** on each answer (Correct / Wrong with correct answer shown)
- **Input validation** — only accepts A, B, C, or D (case-insensitive)
- **Automatic scoring** with percentage calculation
- **Grade evaluation** at the end based on percentage
- **Multi-file architecture** — questions stored separately from game logic for clean separation

---

## 📊 Grading System

| Grade | Percentage Range |
|-------|------------------|
| A+    | 90 – 100         |
| A     | 80 – 89          |
| B     | 70 – 79          |
| C     | 60 – 69          |
| D     | 50 – 59          |
| F     | Below 50         |

---

## 🛠️ Built With

- **Java** (Core Java, no external libraries)
- **Standard library:** `java.util.Scanner` for input handling

---

## 📂 Project Structure

```
Quiz-Game/
├── QuestionBank.java    (data holder — questions, options, correct answers)
└── QuizGame.java        (game logic — menu, display, input, scoring, grading)
```

### Why two files?

This project separates **data** from **logic** using two classes:

- **`QuestionBank.java`** is a pure data class. It stores all questions, options (as a 2D array), and correct answers as `public static` variables. It contains no methods.
- **`QuizGame.java`** contains all the game logic — main method, question display, answer validation, scoring, and grade calculation. It accesses data from `QuestionBank` directly.

This makes the project easier to maintain: adding more questions only requires editing `QuestionBank.java`, while changes to game flow happen in `QuizGame.java`. This is a basic application of the **separation of concerns** principle.

---

## ▶️ How to Run

### Compile
```bash
javac QuestionBank.java QuizGame.java
```

### Run
```bash
java QuizGame
```

---

## 📚 Concepts Practiced

- Multi-file Java project structure
- Static class-level variables and cross-class access
- 1D and 2D arrays (`String[]`, `String[][]`)
- Loops (for, while)
- Conditional statements (if-else-if ladder)
- Method decomposition (single responsibility per method)
- Input validation using `while` loop and `.equalsIgnoreCase()`
- Type casting for accurate division (`(double)` cast)
- Formatted output using `printf` with `%.2f` for decimal control
- Separation of concerns (data vs. logic)

---

## 🔮 Future Improvements

- **Read questions from external file** (`.txt` or `.csv`) using File I/O — would allow expanding question bank without code changes
- **Expand to 20+ questions across difficulty levels** (easy/medium/hard)
- **Shuffle question order** using `Random` class (only meaningful once question bank is larger)
- **Play again prompt** at end of quiz (meaningful once shuffle is added)
- **Time tracker** per question with bonus points for quick answers
- **Category selection** (e.g., OOP / Collections / Exception Handling)
- **Save scores** to a leaderboard file across multiple play sessions
- **Refactor with OOP** — create a `Question` class instead of parallel arrays after learning OOP

---

## 👨‍💻 Author

**Pradnya Jogi**  
Aspiring Backend Developer

- 💼 LinkedIn: [Pradnya Jogi](https://www.linkedin.com/in/pradnya-jogi-160a79251/)
