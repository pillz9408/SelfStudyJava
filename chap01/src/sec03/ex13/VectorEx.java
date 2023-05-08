package sec03.ex13;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		// Vector Example
		List<Board> list = new Vector<Board>();

		// BOard 객체 저장
		list.add(new Board("title1", "text1", "author1"));
		list.add(new Board("title2", "text2", "author2"));
		list.add(new Board("title3", "text3", "author3"));
		list.add(new Board("title4", "text4", "author4"));
		list.add(new Board("title5", "text5", "author5"));

		list.remove(2);
		list.remove(3);

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer );
		}
	}

}
