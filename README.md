# ⚽ Football League Management System

This project is a **Football League Management System**, developed as part of the **CSE 2105 - Data Structures** course. The system allows users to manage football teams, players, and matches through a **console-based interface**, utilizing various **data structures** to ensure efficient data handling.

## 🚀 Features

- **Team Management**: Stores and updates team details such as name, short name, advantages, and points.
- **Player Management**: Maintains player attributes like name, position, goals, and performance value.
- **Match Simulation**: Users can simulate matches, where results are determined by team strengths and a randomness factor.
- **Leaderboard System**: Automatically updates rankings based on match results, reflecting points and goal differences.
- **Queue System**: Ensures matches are played in a structured order, similar to real football leagues.
- **Search Functionality**: Allows searching for teams and players by their attributes.

## 🛠️ Technologies & Data Structures Used

- **Linked List** (Player Management)
- **Binary Search Tree (BST)** (Player Storage)
- **Queue** (Match Scheduling)
- **Stack** (Match Results)
- **Max-Heap** (Leaderboard Sorting)
- **Hash Table** (Team Management)

## 🎮 How to Use

1. **Run the Program**: The system launches with a **console menu**.
2. **Play Matches**: Select a match to be played.
3. **View Rankings**: Display the leaderboard and see team standings.
4. **Search for Teams & Players**: Retrieve details about teams or individual players.
5. **Simulate the Entire Season**: Play all matches automatically.

## 📌 Console Commands

| Command | Description |
|---------|------------|
| `1` | Play the next match |
| `2` | View the leaderboard |
| `3` | View all teams |
| `4` | Search for a team |
| `5` | Show fixture list |
| `6` | Simulate all matches |
| `7` | Exit the system |

## 📈 Match Simulation Logic

The match results are determined by:
- **Team Strength**: Calculated using player attributes and team advantages.
- **Randomized Events**: Simulating real-world football unpredictability.
- **Goalkeeper & Shooter Calculation**: The system compares player performance with defensive strengths.

## 📂 Project Structure

```plaintext
📦 Football League Management System
├── src/
│   ├── models/
│   │   ├── Player.java
│   │   ├── Team.java
│   │   ├── Match.java
│   │   ├── MatchResult.java
│   ├── data_structures/
│   │   ├── playerList.java
│   │   ├── PBinarySearchTree.java
│   │   ├── TeamHashTable.java
│   │   ├── MStack.java
│   │   ├── MQueue.java
│   │   ├── MaxHeap.java
│   ├── core/
│   │   ├── LeagueManagementProject.java **(Main)**
│   │   ├── SuperLeagueManagement.java **(Management Class)**
├── docs/
│   ├── Football_League_Management_Report.pdf
├── README.md
└── .gitignore

## 📜 Future Improvements

- **Graphical User Interface (GUI)**
- **Real-time player statistics tracking**
- **Integration with an external database for persistent storage**
- **Web-based management panel**

## 🔗 Project Repository

[GitHub Repository](https://github.com/keremmozakca/DS-Project-League-Management)

---

📌 **Developed for educational purposes in Data Structures course.**
