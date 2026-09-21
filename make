1 all: Card.class Hand.class Blackjack.class make
2
3 Card.class: Card.java
4 javac Card.java
5
6 Hand.class: Hand.java
7 javac Hand.java
8
9 Blackjack.class: Blackjack.java
10 javac Blackjack.java
11
12 run: all
13 java Blackjack
14
15 clean:
16 rm *.clas