package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
	Game game;

	@BeforeEach
	void init() {
		game = new Game();
	}

	@Test
	void test1() {
		assertEquals(0, game.score());
	}

	@Test
	void test2() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		}
		assertEquals(0, game.score());
	}

	@Test
	void test3() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		assertEquals(20, game.score());
	}

	@Test
	void test4() {
		for (int i = 0; i < 10; i++) {
			game.roll(1);
		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);
		}
		assertEquals(30, game.score());
	}
	
	@Test
	void test5() {
		game.roll(7);
		game.roll(3);
		game.roll(4);
		for(int i=0; i<17; i++) {
			game.roll(0);
		}
		assertEquals(18, game.score());
	}
	
	@Test
	void test6() {
		game.roll(10);
		game.roll(3);
		game.roll(4);
		for(int i=0; i<16; i++) {
			game.roll(0);
		}
		assertEquals(24, game.score());
	}
	
	private void rollAssist(int[] list) {
		for(int i=0; i<list.length; i++) {
			game.roll(list[i]);
		}
	}
	
	@Test
	void test7() {
		int[] tab = {1, 2, 10, 0, 10, 4, 2, 0, 10, 6, 2, 0, 10, 6, 4, 8, 2, 2, 7};
		rollAssist(tab);
		assertEquals(122, game.score());
	}
}
