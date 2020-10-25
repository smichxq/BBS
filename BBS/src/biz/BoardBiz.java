package biz;
import entity.Board;

import java.util.List;
import java.util.Map;

public interface BoardBiz {
	
	/**
	 * 返回一个Map
	 * key为子板块
	 * value为父板块
	 * @return
	 */
	public Map<List,List> findBoard();
	
	/**
	 * 根据boardId查找板块
	 * @param boardId
	 * @return
	 */
	public Board findBoard(int boardId);
	

}
