GDSL - A DSL Language for the Game of Life

How to Play:
-------------

The language allows the user to specify points for the initial grid ( sized 50x50 ), as well as a way to draw many points together. The other thing the user can do is that they can specify rules to play the Game of Life. Thus, our DSL does not specify that the user has to follow the original rules; they can get creative!

How can the user create the game then?

GameStart { // 1
	Cell (0,0) // 2
	Many (1 to 2) : (3 to 4) // 3

	StayAliveRule surrounding = 7 or surrounding = 5 // 4
	DieRule surrounding < 2 // 5
	BirthRule surrounding > 3 // 6
} // 7

is a good example that demonstrates the functionality of the DSL.

Lines 1 and 7 is how the user must start with giving their specifications. Inside that, they can write the rules and the grid that they wish.

Line 2 shows that the user can give coordinates to draw a single cell in the grid. With line 3 the user can draw cells faster, as they can specify intervals to be drawn using the Many, followed by (xbeginning to xend) : (ybeginning to yend).

Afterwards the user can specify rules for the game. The symbols the language uses for the number of neighbors are > < and = . It also supports the use of 'or' and 'and' if the users want to combine different conditions together. All they have to write is the corresponding name StayAliveRule, DieRule, or BirthRule depending on if they want to specify a rule for cells to stay alive, to die or to be born. Then, they just give the keyword surrounding, the symbol of comparison and the number they wish.

A good thing to mention is that the grid is optional. Also, not all rules are mandatory; the user just needs to specify one, so that the game can have a rule to be played with.


Notes
------
Within the language there are validations implemented with the form of warnings and errors. They are described with comments in the code.
Also, in the generator, the symbols and, or and = are generated as &&, || and ==. We use words and a single = to be more user-friendly.

Written as part of the CPS course for Software Engineering, UvA.