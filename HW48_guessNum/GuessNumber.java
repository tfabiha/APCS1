// Tabassum Fabiha
// APCS1 pd2
// HW48 -- Keep Guessing
// 2017-12-07

/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 0, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) {
	// sets the lowest number to _lo
	// sets the highest number to _hi
        if (a < b) {
	    _lo = a;
	    _hi = b;
	} else {
	    _lo = b;
	    _hi = a;
	}

	_guessCtr = 1;
	_target = (int) (Math.random() * (_hi - _lo + 1)) + _lo;
    }

    // prints the target for debugging purposes
    public void printT() {
	System.out.println(_target);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() {
	System.out.println("Guess a number from " + _lo + " to " + _hi + ":");
	int guess = Keyboard.readInt();
	
	System.out.println();
	    
	if (guess == _target) {
	    System.out.println("You win! It took " + _guessCtr  + " guesses.");
	    return;
	}
		
	if (guess < _lo) {
	    System.out.println("Below the lower bound, Try again.");
	}

	if (guess > _hi) {
	    System.out.println("Above the upper bound, Try again.");
	}

	if (_target >= guess && guess > _lo) {
	    System.out.println("Too low. Try Again.");
	    _lo = guess + 1;
	}

	if (_hi > guess && guess >= _target) {
	    System.out.println("Too high. Try Again.");
	    _hi = guess - 1;
	}
	
	_guessCtr += 1;
	playRec();
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() {
	System.out.println("Guess a number from " + _lo + " to " + _hi + ":");
	int guess = Keyboard.readInt();
	    
	while (guess != _target){
	    _guessCtr += 1;
	    System.out.println();
	    
		
	    if (guess < _lo) {
		System.out.println("Below the lower bound, Try again.");
	    }

	    if (guess > _hi) {
		System.out.println("Above the upper bound, Try again.");
	    }

	    if (_target >= guess && guess > _lo) {
		System.out.println("Too low. Try Again.");
		_lo = guess + 1;
	    }

	    if (_hi > guess && guess >= _target) {
		System.out.println("Too high. Try Again.");
		_hi = guess - 1;
	    }
	    
	    System.out.println("Guess a number from " + _lo + " to " + _hi + ":");
	    guess = Keyboard.readInt();
	}


	System.out.println("You win! It took " + _guessCtr  + " guesses.");
		
	    
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	playRec();
	//playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
	
	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);
	//g.printT();

	//start the game
	g.play();
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }//end main

}//end class
