# Flappy-Bird-Game-Java-Project 🐥

## Introduction
Welcome to the Flappy Bird - Java Edition! This project is a clone of the popular Flappy Bird game, developed entirely using Java. The game features a simple graphical user interface (GUI) created with Swing and provides an engaging experience where players control a bird trying to fly between columns of green pipes without hitting them.

## Features
- **Simple and Intuitive Interface**: Utilizes Java Swing to create a lightweight and responsive GUI.
- **Realistic Physics**: Simulates gravity and collision detection for a challenging gameplay experience.
- **Randomized Obstacles**: Pipes are placed at random heights to increase difficulty and unpredictability.
- **Score Tracking**: Keeps track of the player's score, displayed on the screen.
- **Game Over Detection**: Ends the game when the bird collides with pipes or falls out of the screen, with an option to restart.

## Project Highlights
### Game Window Setup
- The game window is set to a fixed size of 360x640 pixels.
- The window is non-resizable and centered on the screen.
- The game frame is titled "Flappy Bird".

### Graphics and Images
- Custom images for the background, bird, and pipes are loaded and rendered on the game canvas.
- Images are scaled and positioned accurately to create a visually appealing interface.

### Bird Mechanics
- The bird can be controlled using the spacebar to fly upwards.
- Gravity affects the bird, causing it to fall when no key is pressed.
- Collision detection is implemented to end the game when the bird hits a pipe or the ground.

### Pipe Generation
- Pipes are generated at random heights and move from right to left.
- New pipes are added periodically, creating an endless scrolling effect.
- Pipes are stored in an ArrayList and their positions are updated continuously.

### Game Loop and Timers
- The game logic is executed using a game loop running at 60 frames per second.
- A separate timer handles the generation of new pipes at regular intervals.
- The game stops and displays "Game Over" when the bird collides with a pipe or the ground.

### How to Play
- Press the spacebar to make the bird fly upwards.
- Avoid the pipes by flying through the gaps.
- The game ends if the bird hits a pipe or falls to the ground.
- The score increases as you successfully navigate through the pipes.

**Enjoy the game! 😊**
