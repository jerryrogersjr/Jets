## Jets Project
This is my third end of week project with Skill Distillery. The program
will display a menu and give actionable options with a Jet theme.

### Example
```
1: List Fleet
2: Fly All Jets
3: View Fastest Jet
4: View Jet w/ Longest Range
5: Load all Cargo Jets
6: Dogfight
7: Add a Jet to the Fleet
8: Remove a Jet from the Fleet
9: Quit
7
What type of Jet would you like to add?
press 1 for FighterJet
press 2 for CargoPlane
press 3 for JetAirliner
enter 'quit' to Exit this Menu
1
Enter Model Name:
Blaster
Enter Speed:
234
Enter Range:
456
Enter Price:
8787878

1: List Fleet
2: Fly All Jets
3: View Fastest Jet
4: View Jet w/ Longest Range
5: Load all Cargo Jets
6: Dogfight
7: Add a Jet to the Fleet
8: Remove a Jet from the Fleet
9: Quit
```
### Overview

The Jets program will display Jets in an airfield, allow you to employ the
jets, add jets, remove jets, and display stats on all jets.

User Story #1
Create a JetsApplication with a main method to launch your program.

User Story #2
Jets are found at an AirField. Create the AirField class, which has an empty List of Jets.

User Story #3
On program startup, populate the AirField with at least 5 Jets of different types.

These jets must be read from a text file, where each line in the file contains data for a single Jet object.

This file exists at the root of your Eclipse project. It can be comma- or tab-separated; either implementation is acceptable.
The method to parse a file into Jet objects should return a List<Jet>. Its parameter can be a String file name.
Remember to use String.split(regex) to break each line in the file into data to create an individual jet.
User Story #4
There is a menu with these options:

List fleet
Fly all jets
View fastest jet
View jet with longest range
Load all Cargo Jets
Dogfight!
Add a jet to Fleet
Remove a jet from Fleet
Quit
User Story #5
List fleet prints out the model, speed, range, and price of each jet. (There must be at least 5 jets stored when the program starts).

User Story #6
Fly all Jets calls the fly() method on the entire fleet of jets. fly() prints out the jet details and the amount of time the jet can fly until it runs out of fuel (based on speed and range).

User Story #7
The view fastest jet and longest range options both print out all of the information about a jet.

Note: these methods must search the collection of jets to find the appropriate jet.
User Story #8
The user is presented with an option specific to the interfaces you created. For example, Load all Cargo Jets, above, finds all implementors of the CargoCarrier interface and calls loadCargo() on each. (Note that the menu text is italicized because your options may be different, depending on your interfaces.)

User Story #9
A user can add custom jets to the fleet.

This can be a JetImpl (basic jet).
Stretch Goal: This leads to a sub-menu where the user chooses the type of Jet.
Users then enter information for the Jet, and it is added to the AirField.

User Story #10
A user can remove a jet from the fleet.

The user is presented with a sub-menu to select a jet to delete by number.
Stretch Goal: a user can remove a jet (or jets) by name.
User Story #11
Quit exits the program.

### How to Run

Assuming you have Java already loaded on your machine:

Editor (eclipse):

File, open, navigate to the file(s), and open. Run as java file and get results, etc.

### Technologies/Topics Used

-MacBook Pro -java version "1.8.0_221" -terminal -iTerm2 -Eclipse -Atom

-Java Fundamentals
-Object-Oriented Programming in Java
-Java Libraries

### Lessons Learned

This project implemented a lot of great lessons in general. However, I spent a
lot of time chasing down a simple problem that caused my project to be delayed.
After reading the text file and adding the items to the ArrayList, I was having
issues displaying the ArrayList effectively. In my getJets() method, I needed to
'print' from inside the method where originally, I just had a return statement
only. However, I was second guessing my 'addJets' and other parts of the ArrayList
code since my results were not printing. While debugging, my code would function
as needed but would display an empty array so I thought it wasn't actually adding
to the list. Once I was able to establish knowledge of this issue and corrected,
then it was forward movement. I did need a little assistance with the remove jet
option as well. I tried a bit of code, but it just wasn't working to display
the way I wanted (or made sense). Major take away is to set boundaries on problems
and ensure to escalate the questions earlier. I did ask a lot of questions from
my peers, but their overall functionality and code did differ so this caused a
bit of trouble when comparing pieces of code to see what was missing, etc.
Spent way too much time on this project but that seems to be the theme at the
moment. However, as it all seems a bit overwhelming with new knowledge, I still
welcome it and enjoy it as well. Just look forward to a smoother flow.

### Project Requirements

The initial list of Jets must be loaded from a text file.
When menu option 1 is pressed all Jets in the fleet are displayed to the user.
When menu option 2 is selected, fly() is executed on all Jets.
When menu option 3 is selected, the fastest jet from the list of Jets should be displayed to the user.
When menu option 4 is selected, the jet with the longest range should be displayed to the user.
Choosing type-specific behavior calls the interface method for those Jets.
When the user chooses to add a Jet, you are prompted to enter the model, speed (in MPH), range, and price. This Jet should be added to the list of Jets so that when the user again selects menu option 1, that custom jet is included.
If you implement the option to choose Jet type, this menu displays before entering Jet data.
When the user chooses to remove a Jet, the user is presented a menu for selecting the jet to remove.
The final menu option should exit the program.
