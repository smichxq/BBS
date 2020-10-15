package dao;

import java.util.Map;

import entity.Board;

public interface BoardDao {
	/**
	 * 查找板块 
	 * key是父板块
	 * value是子板块
	 * @return
	 */
	public Map<Board, Board> findBoard();
	
	/**
	 * 根据Id查找板块
	 * @param boardId
	 * @return
	 */
	public Board findBoard(int boardId);

}