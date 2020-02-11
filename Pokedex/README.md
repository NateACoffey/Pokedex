# Pokédex

A desktop Pokédex for the Pokémon video games.

## Functionality

You can search for the Pokémon (in any letter case) and checks if that Pokémon exists.

It uses a data structure to show the values into corresponding textfields.

There is also a scrollable list with buttons that will also bring up the Pokémon corresponding to the text on the button.

It also show a picture of the Pokémon (**Pokémon photos taken from [Bulbapedia](https://bulbapedia.bulbagarden.net/)**; favicon and default picture made by me).

At the top, there are buttons that will take you to the first Pokémon of each generation as well as brings up its data.

## Data

This program reads from a txt file containing the data of every Pokémon. 

It uses an array with a hashed value of the Pokémon's names to store the data. This allows searching for Pokémon based on strings significantly faster than iterating through the file or an Object[] array to check string name match.

## GUI

I used JavaFX with FXML to make the GUI and show Pokémon's matched data into textfields.

I have Buttons and a TextField with ActionEvents that will grab data from the data structure, append non-standard characters to the search bar, and an automatic scroll to the searched Pokémon.

## Purpose of project

### This project was started to test my abilities in Java.

* I use basic fundamentals of programming like loops, conditional statements, an array, reading files, and manipulating strings.
* A hashing data structure to store the Pokémon's data.
* Encapsulation so classes and variables can only be read by the appropriate class and getters and a constructor for the data structure.
* Introduction to JavaFX and making a GUI
