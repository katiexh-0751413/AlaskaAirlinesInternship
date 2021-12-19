# AlaskaAirlinesInternship
Greed Kata Game

Questions that you came up with:
-How to store the data (integers/integer arrays vs HashMaps)

Assumptions you made:
-That the numbers rolled could only be between 1 and 6
-That the user prompt to roll five dice just meant a prompt to play the game
-That the user can play multiple games in a row if they would like to (I also added their total points across all games played at the end for them to see)

The different paths of solutions you contemplated:
Originally, I solved this problem using if/else statements. Then, later I decided to use a HashMap of integers and integer arrays to store the data instead, as this would make my code cleaner. Now, instead of checking for every type of possibility (single 1 vs. single 5 vs. triple 1, etc.), I can just do all the calculations in two lines.
