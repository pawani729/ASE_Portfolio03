import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import Model.Domino;

public class AardvarkTest {
	  public List<Domino> _d;
	  public List<Domino> _g;
	  
	@Test
	public void testGenerateGuesses() {
	    _g = new LinkedList<Domino>();
	    int count = 0;
	    for (int l = 0; l <= 6; l++) {
	      for (int h = l; h <= 6; h++) {
	        Domino d = new Domino(h, l);
	        _g.add(d);
	        count++;
	      }
	    }
	    assertEquals(28, count);

		
	}
	
	@Test
	public void testgenerateDominoes() {
		   _d = new LinkedList<Domino>();
		    int count = 0;
		    int x = 0;
		    int y = 0;
		    for (int l = 0; l <= 6; l++) {
		      for (int h = l; h <= 6; h++) {
		        Domino d = new Domino(h, l);
		        _d.add(d);
		        d.place(x, y, x + 1, y);
		        count++;
		        x += 2;
		        if (x > 6) {
		          x = 0;
		          y++;
		        }
		      }
		      
		    }
		    assertEquals(28, count);
	}


	
}
