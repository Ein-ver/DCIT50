all: Card.class Hand.class Blackjack.class make

Card.class: Card.java
javac Card.java

Hand.class: Hand.java
javac Hand.java

Blackjack.class: Blackjack.java
javac Blackjack.java

run: all
java Blackjack

clean:
rm *.clas