# AlaskaAirlinesInternship
Greed Kata Game

Questions that you came up with:
-How to store the data (integers/integer arrays vs HashMaps)

Assumptions you made:
-That the numbers rolled could only be between 1 and 6
-That the user prompt to roll five dice just meant a prompt to play the game
-That the user can play multiple games in a row if they would like to (I also added their total points across all games played at the end for them to see)

The different paths of solutions you contemplated:
Originally, I solved this problem using if/else statements, as such:
  if (i == 0) {
    totalPoints += (counts[i] / 3) * 1000;
    totalPoints += (counts[i] % 3) * 100;
  } else if (i == 4) {
    totalPoints += (counts[i] / 3) * 500;
    totalPoints += (counts[i] % 3) * 50;
  } else {
    totalPoints += (counts[i] / 3) * ((i + 1) * 100);
  }
  
Then, later I decided to use a HashMap of integers and integer arrays to store the data instead, as this would make my code more clear and readable.
