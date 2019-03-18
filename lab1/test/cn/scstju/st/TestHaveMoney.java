package cn.scstju.st;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


import cn.scstju.st.HaveMoney;

public class TestHaveMoney {

	private HaveMoney have = null;

	@Before
	public void setUp(){
		have = new HaveMoney();
	}
	
	@Test
	public void test1(){
        String result = have.ifHaveMoney(7);
        assertEquals(result, "Yes");
    }
	@Test
	public void test2(){
        String result = have.ifHaveMoney(11);
        assertEquals(result, "Yes");
    }
	@Test
	public void test3(){
        String result = have.ifHaveMoney(19);
        assertEquals(result, "No");
    }
	@Test
	public void test4(){
        String result = have.ifHaveMoney(31);
        assertEquals(result, "Yes");
    }
	@Test
	public void test5(){
        String result = have.ifHaveMoney(27);
        assertEquals(result, "Yes");
    }
}


