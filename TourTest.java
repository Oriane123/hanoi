package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

	//tour vide
	@Test
	public void testEmpiler_TourVide_true() {
		Disque d1 = new disque(1);
		Tour t = new Tour;
			
		boolean expected = true;
		boolean result = t.empiler(d1);
			
		assertTrue(expected, result);
			
		}
//tour avec 1 disque
	@Test
	public void testEmpiler_Tour1disque_true() {
		Disque d1 = new disque(1);
		Tour t = new Tour;
		Disque d3 = new disque(3);
		
		t.empiler(d3);
		
		boolean expected = true;
		boolean result = t.empiler(d1);

		assertTrue(expected, result);
			
		}	
	
//tour pleine
	@Test
	public void testEmpiler_Tourpleine_false() {
		Disque d1 = new disque(1);
		Disque d2 = new disque(2);
		Disque d3 = new disque(3);
		Disque d4 = new disque(4);
		Tour t = new Tour;
			
		t.empiler(d4);
		t.empiler(d3);
		t.empiler(d2);
		
		boolean expected = true;
		boolean result = t.empiler(d1);
			
		assertTrue(expected, result);
			
		}	
		

}

/*
 Fonction a tester
public boolean empiler(Disque d) {
    boolean res=false;
    if(disques.isEmpty()){
        disques.offer(d);
        res=true;
    }
    else{
        if( (disques.element().d>d.d) && (taille()<hauteurMax) ){
            res=true;
            disques.offer(d);
        }
        else{
            res=false;
        }
    }
    return res;
*/